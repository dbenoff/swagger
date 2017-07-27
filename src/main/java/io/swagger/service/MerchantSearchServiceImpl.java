package io.swagger.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.googlecode.cqengine.ConcurrentIndexedCollection;
import com.googlecode.cqengine.IndexedCollection;
import com.googlecode.cqengine.index.radixreversed.ReversedRadixTreeIndex;
import com.googlecode.cqengine.query.Query;
import io.swagger.model.Merchant;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Service;

import java.io.InputStream;
import java.util.*;

import static com.googlecode.cqengine.query.QueryFactory.startsWith;

/**
 * Created by dbenoff on 7/27/2017.
 */
@Service
public class MerchantSearchServiceImpl implements InitializingBean {

    IndexedCollection<MerchantSearchableProxy> merchantSearchableProxies;
    Map<UUID, Merchant> merchantMap = new HashMap<>();

    public List<Merchant> searchForMerchants(MerchantSearchParameters params){
        List<Merchant> merchants = new ArrayList<>();
        Query<MerchantSearchableProxy> query1 = startsWith(MerchantSearchableProxy.NAME, params.name);
        for (MerchantSearchableProxy proxy : merchantSearchableProxies.retrieve(query1)) {
            merchants.add(merchantMap.get(proxy.uuid));
        }
        return merchants;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        InputStream is = MerchantSearchServiceImpl.class.getResourceAsStream("/data.json");

        SimpleModule module = new SimpleModule();
        module.addDeserializer(Merchant.class, new MerchantCustomDeserializer());

        ObjectMapper mapper = new ObjectMapper();
        mapper.registerModule(module);

        TypeFactory tf = mapper.getTypeFactory();
        CollectionType collectionType = tf.constructCollectionType(List.class, Merchant.class);

        List<Merchant> merchants = mapper.readValue(is, collectionType);

        merchantSearchableProxies = new ConcurrentIndexedCollection<>();
        merchantSearchableProxies.addIndex(ReversedRadixTreeIndex.onAttribute(MerchantSearchableProxy.NAME));
        for(Merchant merchant : merchants){
            merchantMap.put(merchant.uuid, merchant);
            merchantSearchableProxies.add(new MerchantSearchableProxy(merchant.uuid, merchant.getName()));
        }

    }
}
