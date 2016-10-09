package com.golosinaspitufos.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by pin69 on 18-Sep-16.
 */


@Entity
@Table(name = "products")
public class Product implements java.io.Serializable {

    private int id;
    private String productCategory;
    private String productSubcategory;
    private String productName;
    private String productDescription;
    private Set<Prices_1> prices_1 = new HashSet<Prices_1>(0);

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "product_id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "product_category")
    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    @Column(name = "product_subcategory")
    public String getProductSubcategory() {
        return productSubcategory;
    }

    public void setProductSubcategory(String productSubcategory) {
        this.productSubcategory = productSubcategory;
    }

    @Column(name = "product_name")
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    @Column(name = "product_description")
    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "pk.product", cascade=CascadeType.ALL)
    public Set<Prices_1> getPrices_1(){
        return prices_1;
    }

    public void setPrices_1(Set<Prices_1> prices_1){
        this.prices_1 = prices_1;
    }

    @Override
    public String toString() {
        return "ProductController [id=" + id + ", productName=" + productName
                + ", productCategory=" + productCategory + ", productSubcategory=" + productSubcategory
                + ", productDescription=" + productDescription + ", prices=" + prices_1
                + "]";
    }

}

