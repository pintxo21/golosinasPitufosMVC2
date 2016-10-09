package com.golosinaspitufos.dto;

import com.golosinaspitufos.model.Prices_1;
import com.golosinaspitufos.model.Product;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by pin69 on 09-Oct-16.
 */
public class ProductDTO {

    private int id;
    private String productCategory;
    private String productSubcategory;
    private String productName;
    private String productDescription;
    private Set<ProductPriceDTO> prices = new HashSet<ProductPriceDTO>(0);


    public ProductDTO(int id, String productCategory, String productSubcategory, String productName,
                      String productDescription, Set<ProductPriceDTO> prices) {
        this.id = id;
        this.productCategory = productCategory;
        this.productSubcategory = productSubcategory;
        this.productName = productName;
        this.productDescription = productDescription;
        this.prices = prices;
    }

    public static ProductDTO mapFromProductEntity(Product product){

        Set<ProductPriceDTO> productPriceDTOs = new HashSet<ProductPriceDTO>(0);
        for (Prices_1 p1 : product.getPrices_1()){
            productPriceDTOs.add(ProductPriceDTO.mapFromPrice_1Entity(p1));
        }

        return new ProductDTO(product.getId(), product.getProductCategory(), product.getProductSubcategory()
        , product.getProductName(), product.getProductDescription(), productPriceDTOs);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public String getProductSubcategory() {
        return productSubcategory;
    }

    public void setProductSubcategory(String productSubcategory) {
        this.productSubcategory = productSubcategory;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public Set<ProductPriceDTO> getPrices() {
        return prices;
    }

    public void setPrices(Set<ProductPriceDTO> prices) {
        this.prices = prices;
    }
}
