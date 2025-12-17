package com.montelongo.Bank_Test.dto.Cliente;

public record ClienteDetalleResponseDTO(
        Integer id,
        String name,
        String addressStore,
        Integer numClient,
        String typeClient) {
}
