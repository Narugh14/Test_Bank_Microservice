package com.montelongo.Bank_Test.controller;

import com.montelongo.Bank_Test.dto.Cliente.ClienteDetalleResponseDTO;
import com.montelongo.Bank_Test.dto.Cliente.ClienteRegisterRequestDTO;
import com.montelongo.Bank_Test.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteService clientService;

    @GetMapping("/{id}")
    public ResponseEntity<ClienteDetalleResponseDTO> obtenerCliente(@PathVariable Integer id){
        return ResponseEntity.ok(clientService.obtenerClienteId(id));
    }

    @Transactional
    @PostMapping
    public ResponseEntity<ClienteDetalleResponseDTO> registrarCliente(@RequestBody @Valid ClienteRegisterRequestDTO datos){
       return ResponseEntity.ok(clientService.registrarCliente(datos));
    }

}
