package com.montelongo.Bank_Test.controller;

import com.montelongo.Bank_Test.dto.Cliente.ClienteDetalleResponseDTO;
import com.montelongo.Bank_Test.dto.Cliente.ClienteEditarRequestDTO;
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
    public ResponseEntity<ClienteDetalleResponseDTO> obtenerClienteId(@PathVariable Integer id){
        return ResponseEntity.ok(clientService.obtenerClienteId(id));
    }

    @PostMapping
    public ResponseEntity<ClienteDetalleResponseDTO> registrar(@RequestBody @Valid ClienteRegisterRequestDTO datos){
       return ResponseEntity.ok(clientService.registrarCliente(datos));
    }

    @PutMapping("/{numClient}")
    public ResponseEntity<ClienteDetalleResponseDTO> editar(@PathVariable Integer numClient,@RequestBody @Valid ClienteEditarRequestDTO datos){
        return ResponseEntity.ok(clientService.editarCliente(datos, numClient));
    }

    @DeleteMapping("/{numClient}")
    public ResponseEntity eliminar(@PathVariable Integer numCliente){
        clientService.eliminarCliente(numCliente);
        return ResponseEntity.noContent().build();
    }

}
