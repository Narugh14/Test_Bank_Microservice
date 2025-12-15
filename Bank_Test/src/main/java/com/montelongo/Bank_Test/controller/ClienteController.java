package com.montelongo.Bank_Test.controller;

import com.montelongo.Bank_Test.dto.ClienteDTO;
import com.montelongo.Bank_Test.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteService clientService;

    @GetMapping("/{id}")
    public ClienteDTO obtenerClientPorID(@PathVariable Integer id){
        return clientService.obtenerClienteId(id);
    }

}
