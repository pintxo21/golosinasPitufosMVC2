package com.golosinaspitufos.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="providers")
public class Provider implements java.io.Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="provider_id")
    private int id;

    @Column(name="provider_name")
    private String providerName;

    @Column(name="provider_address")
    private String providerAddress;

    @Column(name="provider_phone")
    private String providerPhone;

    @Column(name="provider_archived")
    private int providerArchived = 0;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "pk.provider")
    private Set<Prices_1> prices_1 = new HashSet<Prices_1>(0);

    public Set<Prices_1> getPrices_1() {
        return prices_1;
    }

    public void setPrices_1(Set<Prices_1> prices_1) {
        this.prices_1 = prices_1;
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

    public int getProviderArchived() {
        return providerArchived;
    }

    public void setProviderArchived(int providerArchived) {
        this.providerArchived = providerArchived;
    }

    @Override
    public String toString() {
        return "ProviderController [id=" + id + ", providerName=" + providerName
                + ", providerAddress=" + providerAddress + ", providerPhone="
                + providerPhone + "]";
    }

}

