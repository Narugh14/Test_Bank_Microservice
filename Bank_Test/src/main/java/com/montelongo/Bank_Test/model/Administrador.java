package com.montelongo.Bank_Test.model;


import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Setter @Getter
public class Administrador extends Usuario{

    private String fullName;
    private String gradePrivilege;

    public Administrador(Integer id, String name, String lastName,
                         Integer numberPhone, String AddressStore, String gradePrivilege) {
        super(id, name, lastName, numberPhone, AddressStore);
        this.gradePrivilege = gradePrivilege;
        this.fullName = name + lastName;
    }

    @Override
    public String toString() {
        return "Administrador{" +
                "fullName='" + fullName + '\'' +
                ", gradePrivilege='" + gradePrivilege + '\'' +
                '}';
    }

    @Override
    public String RegisterDate() {
        return "RegisterDate{Date:"+ String.valueOf(LocalDate.now())+"}";
    }
}
