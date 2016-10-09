package com.golosinaspitufos.dao;


import com.golosinaspitufos.model.Providers;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
public class ProviderRepository {

    @PersistenceContext
    EntityManager em;

    public List<Providers> findAllProviders(){
        Query query = em.createQuery("SELECT e FROM Provider e");
        return (List<Providers>) query.getResultList();
    }

}