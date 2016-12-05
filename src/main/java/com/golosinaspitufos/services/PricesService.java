package com.golosinaspitufos.services;

/**
 * Created by pin69 on 05-Dec-16.
 */

import com.golosinaspitufos.dao.PricesRepository;
import com.golosinaspitufos.model.Prices_1;
import com.golosinaspitufos.model.Product;
import com.golosinaspitufos.model.Provider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PricesService {

    @Autowired
    PricesRepository pricesRepository;

    @Transactional
    public Product savePrices(Long productId,Long providerID, float price){
        Prices_1 prices = new Prices_1();
        Product product = new Product();
        Provider provider = new Provider();
        provider.setId(providerID);
        product.setId(productId);
        prices.setProduct(product);
        prices.setProvider(provider);
        prices.setPrice(price);

        pricesRepository.save(prices);

        return product;
    }

}
