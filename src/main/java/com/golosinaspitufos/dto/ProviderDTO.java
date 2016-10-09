package com.golosinaspitufos.dto;

import com.golosinaspitufos.model.Prices_1;
import com.golosinaspitufos.model.Product;
import com.golosinaspitufos.model.Provider;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by pin69 on 09-Oct-16.
 */
public class ProviderDTO {

    private int id;
    private String providerName;
    private String providerAddress;
    private String providerPhone;
    private Set<ProviderPriceDTO> prices = new HashSet<ProviderPriceDTO>(0);

    public ProviderDTO(int id, String providerName, String providerAddress, String providerPhone, Set<ProviderPriceDTO> prices) {
        this.id = id;
        this.providerName = providerName;
        this.providerAddress = providerAddress;
        this.providerPhone = providerPhone;
        this.prices = prices;
    }

    public static ProviderDTO mapFromProviderEntity(Provider provider){

        Set<ProviderPriceDTO> providerPriceDTOs = new HashSet<ProviderPriceDTO>(0);
        for (Prices_1 p1 : provider.getPrices_1()){
            providerPriceDTOs.add(ProviderPriceDTO.mapFromPrice_1Entity(p1));
        }

        return new ProviderDTO(provider.getId(), provider.getProviderName(), provider.getProviderAddress()
                , provider.getProviderPhone(), providerPriceDTOs);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProviderName() {
        return providerName;
    }

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    public String getProviderAddress() {
        return providerAddress;
    }

    public void setProviderAddress(String providerAddress) {
        this.providerAddress = providerAddress;
    }

    public String getProviderPhone() {
        return providerPhone;
    }

    public void setProviderPhone(String providerPhone) {
        this.providerPhone = providerPhone;
    }

    public Set<ProviderPriceDTO> getPrices() {
        return prices;
    }

    public void setPrices(Set<ProviderPriceDTO> prices) {
        this.prices = prices;
    }
}
