package com.montelongo.Bank_Test.repository;

import com.montelongo.Bank_Test.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
}
