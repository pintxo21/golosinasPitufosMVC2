package com.golosinaspitufos.model;

import javax.persistence.*;

/**
 * Created by pin69 on 18-Sep-16.
 */
@Entity
@Table(name="prices")
public class Prices {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="prices_id")
    private int id;

    @Column(name="product_name")
    private String productName;

    @Column(name="provider_name")
    private String providerName;

    @Column(name="price")
    private String price;

}
