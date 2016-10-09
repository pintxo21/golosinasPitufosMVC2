package com.golosinaspitufos.services;

import com.golosinaspitufos.dao.ProviderRepository;
import com.golosinaspitufos.model.Provider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by pin69 on 02-Oct-16.
 */
@Service
public class ProviderService {

    @Autowired
    ProviderRepository providerRepository;

    @Transactional(readOnly = true)
    public List<Provider> findAllProviders(){
        List<Provider> pv = providerRepository.findAllProviders();
        return pv;
    }

}
