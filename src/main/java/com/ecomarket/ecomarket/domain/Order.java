package com.ecomarket.ecomarket.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "Orders")
public class Order {

    @Id
    private Long id;
    @Column
    private double total;

    @JsonProperty(access= JsonProperty.Access.WRITE_ONLY)
    @ManyToOne
    private Customer customer;

}
