package com.golosinaspitufos.services;

import com.golosinaspitufos.dao.ProductsRepository;
import com.golosinaspitufos.model.Products;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by pin69 on 05-Oct-16.
 */


@Service
public class ProductsService {

    @Autowired
    ProductsRepository productsRepository;

    @Transactional(readOnly = true)
    public List<Products> findAllProviders(){
        List<Products> pv = productsRepository.findAllProducts();
        return pv;
    }

}
