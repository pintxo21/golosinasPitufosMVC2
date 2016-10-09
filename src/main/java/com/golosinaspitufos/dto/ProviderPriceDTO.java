package com.golosinaspitufos.dto;

import com.golosinaspitufos.model.Prices_1;

/**
 * Created by pin69 on 09-Oct-16.
 */
public class ProviderPriceDTO {

    private float price;
    private String productCategory;
    private String productSubcategory;
    private String productName;

    public ProviderPriceDTO(float price, String productCategory, String productSubcategory, String productName) {
        this.price = price;
        this.productCategory = productCategory;
        this.productSubcategory = productSubcategory;
        this.productName = productName;
    }

    public static ProviderPriceDTO mapFromPrice_1Entity(Prices_1 prices_1){
        return new ProviderPriceDTO(prices_1.getPrice(),prices_1.getProduct().getProductCategory(),
                prices_1.getProduct().getProductSubcategory(), prices_1.getProduct().getProductName());
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public String getProducSubcategory() {
        return productSubcategory;
    }

    public void setProducSubcategory(String producSubcategory) {
        this.productSubcategory = producSubcategory;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
}
