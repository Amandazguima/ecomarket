package com.ecomarket.ecomarket.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table
@Data
public class Address {

    @Id
    private Long id;
    @Column
    private String street;
    @Column
    private String city;
    @Column
    private String state;
    @Column
    private String country;
    @Column
    private String postalCode;

}
