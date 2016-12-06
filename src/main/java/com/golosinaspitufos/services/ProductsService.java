package com.golosinaspitufos.services;

import com.golosinaspitufos.dao.ProductsRepository;
import com.golosinaspitufos.model.Prices_1;
import com.golosinaspitufos.model.Product;
import com.golosinaspitufos.model.Provider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static com.golosinaspitufos.services.ValidationUtils.assertNotBlank;
import static org.springframework.util.Assert.notNull;

/**
 * Created by pin69 on 05-Oct-16.
 */


@Service
public class ProductsService {

    @Autowired
    ProductsRepository productsRepository;

    @Transactional(readOnly = true)
    public List<Product> findAllProducts(){
        List<Product> pv = productsRepository.findAllProducts();
        return pv;
    }

    @Transactional
    public Product saveProduct(Long id, String productCategory, String productSubcategory, String productName,
                                String productDescription, Set<Prices_1> prices) {

        assertNotBlank(productCategory, "username cannot be blank");
        assertNotBlank(productSubcategory, "username cannot be blank");
        assertNotBlank(productName, "username cannot be blank");

        Product product = new Product();

        if (id != null) {
            product = productsRepository.findProduct(id);
            product.setProductCategory(productCategory);
            product.setProductSubcategory(productSubcategory);
            product.setProductName(productName);
            product.setProductDescription(productDescription);
            productsRepository.save(product);
        } else {
            product.setProductCategory(productCategory);
            product.setProductSubcategory(productSubcategory);
            product.setProductName(productName);
            product.setProductDescription(productDescription);
            productsRepository.save(product);
        }

        return product;
    }

}
