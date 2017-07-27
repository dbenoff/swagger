package io.swagger.service;

import com.googlecode.cqengine.attribute.Attribute;
import com.googlecode.cqengine.attribute.SimpleAttribute;
import com.googlecode.cqengine.query.option.QueryOptions;

import java.util.UUID;

/**
 * Created by dbenoff on 7/27/2017.
 */
public class MerchantSearchableProxy {

    public final UUID uuid;
    public final String name;

    public MerchantSearchableProxy(UUID uuid, String name) {
        this.uuid = uuid;
        this.name = name;
    }

    public static final Attribute<MerchantSearchableProxy, String> NAME = new SimpleAttribute<MerchantSearchableProxy, String>("name") {
        public String getValue(MerchantSearchableProxy merchant, QueryOptions queryOptions) { return merchant.name; }
    };
}
