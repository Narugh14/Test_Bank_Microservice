package com.montelongo.Bank_Test.repository;

import com.montelongo.Bank_Test.domain.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
    Cliente findByEmail(String email);
    Optional<Cliente> findByNumClient(Integer numClient);
}
