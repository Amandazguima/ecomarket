package com.ecomarket.ecomarket.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Product {

    @Id
    private Long id;
    @Column
    private int quantity;
    @Column
    private double price;
    @JsonProperty(access= JsonProperty.Access.WRITE_ONLY)
    @ManyToOne
    private Seller seller;
    @Column
    private String description;
    @Column
    private String name;

}
