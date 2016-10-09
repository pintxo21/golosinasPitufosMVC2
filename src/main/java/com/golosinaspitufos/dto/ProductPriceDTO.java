package com.golosinaspitufos.dto;

import com.golosinaspitufos.model.Prices_1;

/**
 * Created by pin69 on 09-Oct-16.
 */
public class ProductPriceDTO {

    private float price;
    private String providerName;

    public ProductPriceDTO(float price, String providerName) {
        this.price = price;
        this.providerName = providerName;
    }

    public static ProductPriceDTO mapFromPrice_1Entity(Prices_1 prices_1){
        return new ProductPriceDTO(prices_1.getPrice(),prices_1.getProvider().getProviderName());
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getProviderName() {
        return providerName;
    }

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }
}
