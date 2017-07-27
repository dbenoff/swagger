package io.swagger.service;

import io.swagger.model.Merchant;

import java.util.List;

/**
 * Created by dbenoff on 7/27/2017.
 */
public interface MerchantSearchService {

    public List<Merchant> searchForMerchants(MerchantSearchParameters params);
}
