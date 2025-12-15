package com.montelongo.Bank_Test.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Setter @Getter
public class Empleado extends Usuario{

    private String numEmployee;
    private String areaEmployee;
    private Float mouthlySalary;
    private Integer salesNumber;

    public Empleado(Integer id, String name, String lastName,
                    Integer numberPhone, String addressStore,
                    String numEmployee, String areaEmployee,
                    Float mouthlySalary, Integer salesNumber) {
        super(id, name, lastName, numberPhone, addressStore);
        this.numEmployee = numEmployee;
        this.areaEmployee = areaEmployee;
        this.mouthlySalary = mouthlySalary;
        this.salesNumber = salesNumber;
    }

    @Override
    public String RegisterDate() {
        return "RegisterDate{"
                +" Date:"+ LocalDate.now()
                +", No.Employee: "+numEmployee.toString()
                +"}";
    }
}
