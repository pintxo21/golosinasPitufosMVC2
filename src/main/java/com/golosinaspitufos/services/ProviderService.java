package com.golosinaspitufos.services;

import com.golosinaspitufos.dao.ProviderRepository;
import com.golosinaspitufos.model.Prices_1;
import com.golosinaspitufos.model.Provider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Set;

import static com.golosinaspitufos.services.ValidationUtils.assertNotBlank;
import static org.springframework.util.Assert.notNull;
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

    @Transactional
    public Provider saveProvider(Long id, String providerName, String providerAddress, String providerPhone, Set<Prices_1> prices) {

        assertNotBlank(providerName, "username cannot be blank");
        notNull(providerAddress, "date is mandatory");
        notNull(providerPhone, "time is mandatory");

        Provider provider = new Provider();

        if (id != null) {
            provider = providerRepository.findProvider(id);
            provider.setProviderName(providerName);
            provider.setProviderAddress(providerAddress);
            provider.setProviderPhone(providerPhone);
            providerRepository.save(provider);
        } else {
            provider.setProviderName(providerName);
            provider.setProviderAddress(providerAddress);
            provider.setProviderPhone(providerPhone);
            providerRepository.save(provider);
        }

        return provider;
    }

}
