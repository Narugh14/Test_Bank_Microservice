package com.montelongo.Bank_Test.dto.Cliente;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record ClienteEditarRequestDTO(
        @NotBlank String name,
        @NotBlank String lastname,
        @NotNull Long numberPhone,
        @NotNull String typeClient,
        @NotBlank @Email String email,
        @NotBlank String addressClient,
        @NotNull Integer codePostal
) {
}
