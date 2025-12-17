package com.montelongo.Bank_Test.domain;


import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Setter @Getter
public class Administrador {

    private String fullName;
    private String gradePrivilege;

    @Override
    public String toString() {
        return "Administrador{" +
                "fullName='" + fullName + '\'' +
                ", gradePrivilege='" + gradePrivilege + '\'' +
                '}';
    }
}
