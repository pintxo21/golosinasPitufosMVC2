package com.golosinaspitufos.dao;


import com.golosinaspitufos.model.Provider;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
public class ProviderRepository {

    @PersistenceContext
    EntityManager em;

    public List<Provider> findAllProviders(){
        Query query = em.createQuery("SELECT e FROM Provider e");
        return (List<Provider>) query.getResultList();
    }

}