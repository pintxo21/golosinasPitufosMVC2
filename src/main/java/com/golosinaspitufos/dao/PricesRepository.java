//package com.golosinaspitufos.dao;//package com.golosinaspitufos.model;
////
////import org.springframework.data.repository.CrudRepository;
////
/////**
//// * Created by pin69 on 18-Sep-16.
//// */
////public interface PricesRepository extends CrudRepository<Prices, Integer> {
////
////    //List<Prices> findByProviderArchived();
////}
//
//import com.golosinaspitufos.model.Providers;
//import org.springframework.stereotype.Repository;
//
//import javax.persistence.EntityManager;
//import javax.persistence.PersistenceContext;
//import javax.persistence.Query;
//import java.util.List;
//
//@Repository
//public class PricesRepository {
//
//    @PersistenceContext
//    EntityManager em;
//
//    public List<Providers> findAllPrices(){
//        Query query = em.createQuery("SELECT e FROM Prices e");
//        return (List<Providers>) query.getResultList();
//    }
//
//}