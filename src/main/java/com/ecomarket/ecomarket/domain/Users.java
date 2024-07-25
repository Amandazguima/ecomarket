package com.ecomarket.ecomarket.domain;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "Users")
@Inheritance(strategy = InheritanceType.JOINED)
public class Users {

     @Id
     private Long id;

     @Column
     private String email;

     @Column
     private String password;

    @Enumerated(EnumType.STRING)
    private RoleEnum roleEnum;

}
