package com.golosinaspitufos.dao;//package com.golosinaspitufos.model;


import com.golosinaspitufos.model.Products;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
public class ProductsRepository {

    @PersistenceContext
    EntityManager em;

    public List<Products> findAllProducts(){
        Query query = em.createQuery("SELECT e FROM Products e");
        return (List<Products>) query.getResultList();
    }

}