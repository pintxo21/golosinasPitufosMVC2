package com.golosinaspitufos.dao;


import com.golosinaspitufos.model.Provider;
import org.springframework.stereotype.Repository;

import javax.persistence.*;
import java.util.List;

@Repository
public class ProviderRepository {

    @PersistenceContext
    EntityManager em;

    public List<Provider> findAllProviders(){
        Query query = em.createQuery("SELECT e FROM Provider e");
        return (List<Provider>) query.getResultList();
    }

    public Provider findProvider(Long id){
        return em.find(Provider.class,id);
    }

    public Provider save(Provider provider) {
        return em.merge(provider);
    }
}