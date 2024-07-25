package com.ecomarket.ecomarket.domain;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.List;


@Entity
@Data
public class Customer extends Users{

    @Id
    private Long id;

    private String name;

    private String lastName;

    private Date birthdate;

    private String cpf;

    @OneToMany()
    private List<Address> addresses;

}
