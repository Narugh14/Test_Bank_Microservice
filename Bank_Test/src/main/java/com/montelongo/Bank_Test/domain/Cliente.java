package com.montelongo.Bank_Test.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter @Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "clientes")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "lastName")
    private String lastName;

    @Column(name = "numberPhone", unique = true)
    private Long numberPhone;

    @Column(name = "addressStore")
    private String addressStore;

    @Column(name = "num_client", unique = true)
    private Integer numClient;

    @Column(name = "birthdate")
    private String birthdate;

    @Column(name = "type_client")
    private String typeClient;

    @Column(name = "email", unique = true)
    private String email;

    @Column(name = "address_client")
    private String addressClient;

    @Column(name = "code_postal")
    private Integer codePostal;
}
