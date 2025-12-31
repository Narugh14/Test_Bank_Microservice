package com.montelongo.Bank_Test.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.LocalDate;


@Setter @Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "empleados")
public class Empleado{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "lastName")
    private String lastName;

    @Column(name = "numberPhone", unique = true)
    private Long numberPhone;

    @Column(name = "birthdate")
    private String birthdate;

    @Column(name = "numEmployee", unique = true)
    private String numEmployee;

    @Column(name = "areaEmployee")
    private String areaEmployee;

    @Column(name="addressStore")
    private String addressStore;

}
