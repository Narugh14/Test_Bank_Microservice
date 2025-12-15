package com.montelongo.Bank_Test.service;

import com.montelongo.Bank_Test.dto.ClienteDTO;
import com.montelongo.Bank_Test.model.Cliente;
import com.montelongo.Bank_Test.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clientRepo;

    public ClienteDTO obtenerClienteId(Integer id){
        Optional<Cliente> cliente = clientRepo.findById(id);
        if(!cliente.isPresent()) return null;

        Cliente c = cliente.get();
        return new ClienteDTO(
                c.getId(),
                c.getName(),
                c.getAddressStore(),
                c.getNumClient(),
                c.getTypeClient());
    }
}
