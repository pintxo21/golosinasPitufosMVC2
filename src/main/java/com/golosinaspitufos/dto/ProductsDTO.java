package com.golosinaspitufos.dto;

import com.golosinaspitufos.model.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pin69 on 09-Oct-16.
 */
public class ProductsDTO {

    private List<ProductDTO> productDTOSet = new ArrayList<ProductDTO>(0);

    public ProductsDTO(List<ProductDTO> productDTOSet) {
        this.productDTOSet = productDTOSet;
    }

    public static ProductsDTO mapFromProductSetEntity(List<Product> products){
        List<ProductDTO> productDTOs = new ArrayList<ProductDTO>(0);
        for (Product p : products) {
            productDTOs.add(ProductDTO.mapFromProductEntity(p));
        }
        return new ProductsDTO(productDTOs);
    }

    public List<ProductDTO> getProductDTOSet() {
        return productDTOSet;
    }

    public void setProductDTOSet(List<ProductDTO> productDTOSet) {
        this.productDTOSet = productDTOSet;
    }
}
