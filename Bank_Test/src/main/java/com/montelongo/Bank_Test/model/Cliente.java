package com.montelongo.Bank_Test.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@NoArgsConstructor
@Setter @Getter
@Entity
@Table(name = "clientes")
public class Cliente extends Usuario{

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

    // Constructor sin ID (para creación nueva)
    public Cliente(String name, String lastName, Integer numberPhone,
                   String addressStore, Integer numClient, String birthdate,
                   String typeClient, String email, String addressClient,
                   Integer codePostal) {
        super(null, name, lastName, numberPhone, addressStore);
        this.numClient = numClient;
        this.birthdate = birthdate;
        this.typeClient = typeClient;
        this.email = email;
        this.addressClient = addressClient;
        this.codePostal = codePostal;
    }

    // Constructor con ID (para actualización)
    public Cliente(Integer id, String name, String lastName,
                   Integer numberPhone, String addressStore,
                   Integer numClient, String birthdate, String typeClient,
                   String email, String addressClient, Integer codePostal) {
        super(id, name, lastName, numberPhone, addressStore);
        this.numClient = numClient;
        this.birthdate = birthdate;
        this.typeClient = typeClient;
        this.email = email;
        this.addressClient = addressClient;
        this.codePostal = codePostal;
    }

    @Override
    public String RegisterDate() {
        return "RegisterDate{"
                +" Date:"+ LocalDate.now()
                +", No.Cliente: "+numClient.toString()
                +", AddressStore: "+ addressClient
                +"}";
    }
}
