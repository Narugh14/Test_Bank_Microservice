package com.montelongo.Bank_Test.controller;

import com.montelongo.Bank_Test.dto.Cliente.ClienteDetalleResponseDTO;
import com.montelongo.Bank_Test.dto.Cliente.ClienteEditarRequestDTO;
import com.montelongo.Bank_Test.dto.Cliente.ClienteRegisterRequestDTO;
import com.montelongo.Bank_Test.service.ClienteService;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
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

    @Tag(name = "get", description = "GET metodo de Usuarios de la APIs")
    @GetMapping("/{id}")
    public ResponseEntity<ClienteDetalleResponseDTO> obtenerClienteId(@PathVariable Integer id){
        return ResponseEntity.ok(clientService.obtenerClienteId(id));
    }

    @Tag(name = "post", description = "POST metodo de Usuarios de la APIs")
    @PostMapping
    public ResponseEntity<ClienteDetalleResponseDTO> registrar(@RequestBody @Valid ClienteRegisterRequestDTO datos){
       return ResponseEntity.ok(clientService.registrarCliente(datos));
    }

    @Tag(name = "put", description = "PUT metodo de Usuarios de la APIs")
    @PutMapping("/{numClient}")
    public ResponseEntity<ClienteDetalleResponseDTO> editar(@PathVariable Integer numClient,@RequestBody @Valid ClienteEditarRequestDTO datos){
        return ResponseEntity.ok(clientService.editarCliente(datos, numClient));
    }

    @Tag(name = "delete", description = "DELETE metodo de Usuarios de la APIs")
    @DeleteMapping("/{numClient}")
    public ResponseEntity eliminar(@PathVariable Integer numClient){
        clientService.eliminarCliente(numClient);
        return ResponseEntity.noContent().build();
    }

}
