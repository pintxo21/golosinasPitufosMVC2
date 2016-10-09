package com.golosinaspitufos.model;

import javax.persistence.*;

/**
 * Created by pin69 on 18-Sep-16.
 */
@Entity
@Table(name = "prices_1")
@AssociationOverrides({
        @AssociationOverride(name = "pk.products",
                joinColumns = @JoinColumn(name = "product_id")),
        @AssociationOverride(name = "pk.providers",
                joinColumns = @JoinColumn(name = "provider_id"))})
public class Prices_1 implements java.io.Serializable {

    @EmbeddedId
    private PricesId pk = new PricesId();

    @Column(name = "price")
    private float price;

    public PricesId getPk() {
        return pk;
    }

    public void setPk(PricesId pk) {
        this.pk = pk;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Transient
    public Products getProducts() {
        return getPk().getProducts();
    }

    public void setProducts(Products products) {
        getPk().setProducts(products);
    }

    @Transient
    public Providers getProvider() {
        return getPk().getProviders();
    }

    public void setProvider(Providers providers) {
        getPk().setProviders(providers);
    }


    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        Prices_1 that = (Prices_1) o;

        if (getPk() != null ? !getPk().equals(that.getPk())
                : that.getPk() != null)
            return false;

        return true;
    }

    public int hashCode() {
        return (getPk() != null ? getPk().hashCode() : 0);
    }


}
