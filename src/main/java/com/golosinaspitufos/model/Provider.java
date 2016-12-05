package com.golosinaspitufos.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="providers")
public class Provider implements java.io.Serializable {

    private Long id;
    private String providerName;
    private String providerAddress;
    private String providerPhone;
    private int providerArchived = 0;
    private Set<Prices_1> prices_1 = new HashSet<Prices_1>(0);

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="provider_id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name="provider_name")
    public String getProviderName() {
        return providerName;
    }

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    @Column(name="provider_address")
    public String getProviderAddress() {
        return providerAddress;
    }

    public void setProviderAddress(String providerAddress) {
        this.providerAddress = providerAddress;
    }

    @Column(name="provider_phone")
    public String getProviderPhone() {
        return providerPhone;
    }

    public void setProviderPhone(String providerPhone) {
        this.providerPhone = providerPhone;
    }

    @Column(name="provider_archived")
    public int getProviderArchived() {
        return providerArchived;
    }

    public void setProviderArchived(int providerArchived) {
        this.providerArchived = providerArchived;
    }


    @OneToMany(fetch = FetchType.LAZY, mappedBy = "pk.provider")
    public Set<Prices_1> getPrices_1() {
        return prices_1;
    }

    public void setPrices_1(Set<Prices_1> prices_1) {
        this.prices_1 = prices_1;
    }

    @Override
    public String toString() {
        return "ProviderController [id=" + id + ", providerName=" + providerName
                + ", providerAddress=" + providerAddress + ", providerPhone="
                + providerPhone + "]";
    }

}

