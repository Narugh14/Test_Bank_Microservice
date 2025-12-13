package com.montelongo.Bank_Test.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public abstract class Usuario {
    private Integer id;
    private String name;
    private String lastName;
    private Integer numberPhone;
    private String AddressStore;

    public Usuario(Integer id, String name, String lastName, Integer numberPhone, String addressStore) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.numberPhone = numberPhone;
        AddressStore = addressStore;
    }

    public abstract String RegisterDate();
}
