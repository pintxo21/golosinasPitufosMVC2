package com.golosinaspitufos.controllers;

import com.golosinaspitufos.model.Product;
import com.golosinaspitufos.services.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.List;

/**
 * Created by pin69 on 05-Oct-16.
 */

@Controller
@RequestMapping("product")
public class ProductController {

    @Autowired
    private ProductsService productsService;

    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(method = RequestMethod.GET)
    public List<Product> getProducts(){
        List<Product> productList = productsService.findAllProducts();
        for (Product p : productList){
            System.out.println("Andres. Provider name: " + p.getProductName());
        }
        return productList;
    }
}
