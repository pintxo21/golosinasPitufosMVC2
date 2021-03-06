package com.golosinaspitufos.dao;//package com.golosinaspitufos.model;


import com.golosinaspitufos.model.Product;
import com.golosinaspitufos.model.Provider;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
public class ProductsRepository {

    @PersistenceContext
    EntityManager em;

    public List<Product> findAllProducts(){
        Query query = em.createQuery("SELECT e FROM Product e");
        return (List<Product>) query.getResultList();
    }

    public Product findProduct(Long id){
        return em.find(Product.class,id);
    }

    public Product save(Product product) {
        return em.merge(product);
    }

}