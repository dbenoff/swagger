package io.swagger.service;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.node.ObjectNode;
import io.swagger.model.*;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by dbenoff on 7/27/2017.
 */
public class MerchantCustomDeserializer extends StdDeserializer<Merchant> {

    protected MerchantCustomDeserializer() {
        super(Merchant.class);
    }


    @Override
    public Merchant deserialize(JsonParser jp, DeserializationContext ctx)
            throws IOException {
        Merchant merchant = new Merchant();
        ObjectMapper mapper = (ObjectMapper) jp.getCodec();
        ObjectNode obj = mapper.readTree(jp);
        Iterator<Map.Entry<String, JsonNode>> elementsIterator = obj.fields();

        BigDecimal latitude = null;
        BigDecimal longitude = null;
        while (elementsIterator.hasNext()) {
            Map.Entry<String, JsonNode> element = elementsIterator.next();
            String name = element.getKey();
            String value = element.getValue().textValue();
            if(value == null)
                continue;
            switch (name){
                case "name" :
                    merchant.setName(value);
                    break;
                case "indirectId" :
                    MerchantlocationSource merchantlocationSource = new MerchantlocationSource();
                    merchantlocationSource.setIndirectId(value);
                    merchant.setSource(merchantlocationSource);
                    break;
                case "latitude" :
                    latitude = BigDecimal.valueOf(new Double(value));
                    break;
                case "longitude" :
                    longitude = BigDecimal.valueOf(new Double(value));
                    break;
            }

            if(latitude != null && longitude != null){
                MerchantlocationContactInfoGps gps = new MerchantlocationContactInfoGps();
                gps.setLatitude(latitude);
                gps.setLongitude(longitude);
                MerchantlocationContactInfo info = new MerchantlocationContactInfo();
                info.setGps(gps);
                Location location = new Location();
                location.setContactInfo(info);
                InlineResponse200 response = new InlineResponse200();
                response.setContactInfo(info);
                merchant.getLocations().add(response);
            }
        }
        return merchant;
    }

}
