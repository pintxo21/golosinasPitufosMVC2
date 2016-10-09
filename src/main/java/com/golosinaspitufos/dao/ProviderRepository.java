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
        Query query = em.createQuery("SELECT e.id, e.providerName FROM Provider e");
        return (List<Provider>) query.getResultList();
    }

}