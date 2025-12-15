package com.montelongo.Bank_Test.dto;

public record ClienteDTO(
        Integer id,
        String name,
        String AddressStore,
        Integer numClient,
        String typeClient
) {
}
