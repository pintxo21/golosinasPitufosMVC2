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
public class Products implements java.io.Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "product_id")
    private int id;

    @Column(name = "product_category")
    private String productCategory;

    @Column(name = "product_subcategory")
    private String productSubcategory;

    @Column(name = "product_name")
    private String productName;

    @Column(name = "product_description")
    private String productDescription;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "pk.products", cascade=CascadeType.ALL)
    private Set<Prices_1> prices_1 = new HashSet<Prices_1>(0);


    public Set<Prices_1> getPrices_1(){
        return prices_1;
    }

    public void setPrices_1(Set<Prices_1> prices_1){
        this.prices_1 = prices_1;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public String getProductSubcategory() {
        return productSubcategory;
    }

    public void setProductSubcategory(String productSubcategory) {
        this.productSubcategory = productSubcategory;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }
}

