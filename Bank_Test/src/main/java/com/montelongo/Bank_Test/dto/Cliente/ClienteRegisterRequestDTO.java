package com.montelongo.Bank_Test.dto.Cliente;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record ClienteRegisterRequestDTO(
     @NotBlank String name,
     @NotBlank String lastname,
     @NotNull Long numberPhone,
     @NotBlank String addressStore,
     @NotNull Integer numCliente,
     @NotBlank String birthdate,
     @NotBlank String typeClient,
     @NotBlank @Email String email,
     @NotBlank String addressClient,
     @NotNull Integer codePostal
) {
}
