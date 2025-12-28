package com.montelongo.Bank_Test.service;

import com.montelongo.Bank_Test.dto.Cliente.ClienteDetalleResponseDTO;
import com.montelongo.Bank_Test.dto.Cliente.ClienteEditarRequestDTO;
import com.montelongo.Bank_Test.dto.Cliente.ClienteRegisterRequestDTO;
import com.montelongo.Bank_Test.domain.Cliente;
import com.montelongo.Bank_Test.repository.ClienteRepository;
import jakarta.persistence.EntityNotFoundException;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clientRepo;

    public ClienteService(ClienteRepository clientRepo) {
        this.clientRepo = clientRepo;
    }

    public ClienteDetalleResponseDTO obtenerClienteId(Integer id){
       Cliente client= clientRepo.findById(id)
                .orElseThrow(() ->
                        new EntityNotFoundException(
                                "Cliente no encontrado con id: " + id
                        )
                );
       return new ClienteDetalleResponseDTO(
                client.getId(),
                client.getName(),
                client.getAddressStore(),
                client.getNumClient(),
                client.getTypeClient()
       );
    }

    @Transactional
    public ClienteDetalleResponseDTO registrarCliente(ClienteRegisterRequestDTO dto){
        Cliente clienteSave = new Cliente(
                null, dto.name(), dto.lastname(),
                dto.numberPhone(), dto.addressStore(), dto.numCliente(),
                dto.birthdate(), dto.typeClient(), dto.email(),
                dto.addressClient(), dto.codePostal()
        );
        clientRepo.save(clienteSave);
        Optional<Cliente> client = clientRepo.findById(clienteSave.getId());
        if(!client.isPresent()) return null;
        return new ClienteDetalleResponseDTO(
                client.get().getId(), client.get().getName(),
                client.get().getAddressStore(), client.get().getNumClient(), client.get().getTypeClient());
    }

    @Transactional
    public ClienteDetalleResponseDTO editarCliente(@Valid ClienteEditarRequestDTO datos, Integer numClient) {
        //Buscar cliente
        Cliente cliente = clientRepo.findByNumClient(numClient)
                .orElseThrow(() -> new RuntimeException("Cliente no encontrado"));
        //Modificar el opbjeto existente
        cliente.setName(datos.name());
        cliente.setLastName(datos.lastname());
        cliente.setNumberPhone(datos.numberPhone());
        cliente.setTypeClient(datos.typeClient());
        cliente.setEmail(datos.email());
        cliente.setAddressClient(datos.addressClient());
        cliente.setCodePostal(datos.codePostal());
        //Guarda
        Cliente clienteActualizado = clientRepo.save(cliente);
        //Regresar el DTO con los datos actualizados
        return new ClienteDetalleResponseDTO(
                clienteActualizado.getId(),
                clienteActualizado.getName(),
                clienteActualizado.getAddressStore(),
                clienteActualizado.getNumClient(),
                clienteActualizado.getTypeClient()
        );
    }

    @Transactional
    public void eliminarCliente(Integer numCliente) {
        Cliente cliente = clientRepo.findByNumClient(numCliente)
                .orElseThrow(() -> new EntityNotFoundException("Cliente no encontrado"));
        clientRepo.delete(cliente);
    }
}
