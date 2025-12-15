package com.montelongo.Bank_Test.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "usuarios")
public abstract class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String lastName;
    private Integer numberPhone;
    private String AddressStore;

    public Usuario(Integer id, String name,
                   String lastName, Integer numberPhone,
                   String addressStore) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.numberPhone = numberPhone;
        AddressStore = addressStore;
    }

    public Usuario() {
    }

    public abstract String RegisterDate();
}
