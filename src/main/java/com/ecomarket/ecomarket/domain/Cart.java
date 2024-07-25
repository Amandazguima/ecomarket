package com.ecomarket.ecomarket.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Entity
@Data
public class Cart {

    @Id
    private Long id;
    @Column
    private double total;
    @JsonProperty(access= JsonProperty.Access.WRITE_ONLY)
    @OneToOne
    private Customer customer;
}
