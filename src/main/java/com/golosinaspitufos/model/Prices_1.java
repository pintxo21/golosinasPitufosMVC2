package com.golosinaspitufos.model;

import javax.persistence.*;

/**
 * Created by pin69 on 18-Sep-16.
 */
@Entity
@Table(name = "prices_1")
@AssociationOverrides({
        @AssociationOverride(name = "pk.product",
                joinColumns = @JoinColumn(name = "product_id")),
        @AssociationOverride(name = "pk.provider",
                joinColumns = @JoinColumn(name = "provider_id"))})
public class Prices_1 implements java.io.Serializable {

    private PricesId pk = new PricesId();
    private float price;

    @EmbeddedId
    public PricesId getPk() {
        return pk;
    }

    public void setPk(PricesId pk) {
        this.pk = pk;
    }

    @Column(name = "price")
    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Transient
    public Product getProduct() {
        return getPk().getProduct();
    }

    public void setProduct(Product product) {
        getPk().setProduct(product);
    }

    @Transient
    public Provider getProvider() {
        return getPk().getProvider();
    }

    public void setProvider(Provider provider) {
        getPk().setProvider(provider);
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

    @Override
    public String toString(){
        return "PriceController [Product_name=" + getProduct().getProductName()
                + " ,Provider_name=" + getProvider().getProviderName()
                + " ,Price=" + price
                + "]";
    }

}
