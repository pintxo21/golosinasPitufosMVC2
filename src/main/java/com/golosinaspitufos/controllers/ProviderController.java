package com.golosinaspitufos.controllers;

import com.golosinaspitufos.dto.ProvidersDTO;
import com.golosinaspitufos.model.Provider;
import com.golosinaspitufos.services.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.List;

/**
 * Created by pin69 on 02-Oct-16.
 */
@Controller
@RequestMapping("provider")
public class ProviderController {

    @Autowired
    private ProviderService providerService;

    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(method = RequestMethod.GET)
    public ProvidersDTO getProviders(){
        List<Provider> providerList = providerService.findAllProviders();
        for (Provider p : providerList){
            System.out.println("Andres. Provider name: " +p.getProviderName());
        }

        return ProvidersDTO.mapFromProvidersSetEntity(providerList);
    }

}
