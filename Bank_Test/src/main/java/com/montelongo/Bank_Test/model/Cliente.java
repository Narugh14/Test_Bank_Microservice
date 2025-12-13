package com.montelongo.Bank_Test.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Setter @Getter
public class Cliente extends Usuario{

    private Integer numClient;
    private String birthdate;
    private String typeClient;
    private String email;
    private String addressClient;
    private Integer code_postal;

    public Cliente(Integer id, String name, String lastName, Integer numberPhone, String addressStore) {
        super(id, name, lastName, numberPhone, addressStore);
    }

    private Cliente cliente = new Cliente();

    @Override
    public String RegisterDate() {
        return "RegisterDate{"
                +" Date:"+ LocalDate.now()
                +", No.Cliente: "+numClient.toString()
                +", AddressStore: "+ cliente.getAddressStore()
                +"}";
    }
}
