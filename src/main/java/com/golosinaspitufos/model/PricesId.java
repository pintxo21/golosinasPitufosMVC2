package com.golosinaspitufos.model;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;

/**
 * Created by pin69 on 05-Oct-16.
 */

@Embeddable
public class PricesId implements java.io.Serializable {

    @ManyToOne
    private Product product;

    @ManyToOne
    private Provider provider;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Provider getProvider() {
        return provider;
    }

    public void setProvider(Provider provider) {
        this.provider = provider;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PricesId that = (PricesId) o;

        if (product != null ? !product.equals(that.product) : that.product != null) return false;
        if (provider != null ? !provider.equals(that.provider) : that.provider != null) return false;

        return true;
    }

    public int hashCode() {
        int result;
        result = (product != null ? product.hashCode() : 0);
        result = 31 * result + (provider != null ? provider.hashCode() : 0);
        return result;
    }

}
