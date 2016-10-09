package com.golosinaspitufos.model;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * Created by pin69 on 05-Oct-16.
 */

@Embeddable
public class PricesId implements java.io.Serializable {

    @ManyToOne
    private Products products;

    @ManyToOne
    private Providers providers;

    public Products getProducts() {
        return products;
    }

    public void setProducts(Products products) {
        this.products = products;
    }

    public Providers getProviders() {
        return providers;
    }

    public void setProviders(Providers providers) {
        this.providers = providers;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PricesId that = (PricesId) o;

        if (products != null ? !products.equals(that.products) : that.products != null) return false;
        if (providers != null ? !providers.equals(that.providers) : that.providers != null) return false;

        return true;
    }

    public int hashCode() {
        int result;
        result = (products != null ? products.hashCode() : 0);
        result = 31 * result + (providers != null ? providers.hashCode() : 0);
        return result;
    }

}
