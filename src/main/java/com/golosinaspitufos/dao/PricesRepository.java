package com.golosinaspitufos.dao;

import com.golosinaspitufos.model.PricesId;
import com.golosinaspitufos.model.Prices_1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class PricesRepository {

    @PersistenceContext
    EntityManager em;

    @Autowired
    ProductsRepository productsRepository;

    @Autowired
    ProviderRepository providerRepository;

    public Prices_1 findPrices(Long productId, Long providerId){
        PricesId pricesId = new PricesId();
        pricesId.setProduct(productsRepository.findProduct(productId));
        pricesId.setProvider(providerRepository.findProvider(providerId));
        return em.find (Prices_1.class,pricesId);
    }

    public Prices_1 save(Prices_1 prices) {
        return em.merge(prices);
    }

}