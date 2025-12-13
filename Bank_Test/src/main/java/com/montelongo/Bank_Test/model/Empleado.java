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

    @Override
    public String RegisterDate() {
        return "RegisterDate{"
                +" Date:"+ LocalDate.now()
                +", No.Employee: "+numEmployee.toString()
                +"}";
    }
}
