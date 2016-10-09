package com.golosinaspitufos.controllers;

import com.golosinaspitufos.model.Products;
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
    public List<Products> getProducts(){
        List<Products> productList = productsService.findAllProviders();
        for (Products p : productList){
            System.out.println("Andres. Providers name: " + p.getProductName());
        }
        return productList;
    }
}
