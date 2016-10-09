package com.golosinaspitufos.dto;

import com.golosinaspitufos.model.Product;
import com.golosinaspitufos.model.Provider;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pin69 on 09-Oct-16.
 */
public class ProvidersDTO {

    private List<ProviderDTO> providersDTOSet = new ArrayList<ProviderDTO>(0);

    public ProvidersDTO(List<ProviderDTO> providersDTOSet) {
        this.providersDTOSet = providersDTOSet;
    }

    public static ProvidersDTO mapFromProvidersSetEntity(List<Provider> provider){
        List<ProviderDTO> providerDTOs = new ArrayList<ProviderDTO>(0);
        for (Provider p : provider) {
            providerDTOs.add(ProviderDTO.mapFromProviderEntity(p));
        }
        return new ProvidersDTO(providerDTOs);
    }

    public List<ProviderDTO> getProvidersDTOSet() {
        return providersDTOSet;
    }

    public void setProvidersDTOSet(List<ProviderDTO> providersDTOSet) {
        this.providersDTOSet = providersDTOSet;
    }
}
