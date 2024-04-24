package com.corhuila.BackendSQL.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.corhuila.BackendSQL.Entity.Cliente;
import com.corhuila.BackendSQL.Repository.ClienteRepository;

@Service
public class ClienteService {
    @Autowired
    private ClienteRepository clienteRepository;

    public List<Cliente> getAllClientes() {
        return clienteRepository.findAll();
    }

    public Cliente getClienteById(int id) {
        return clienteRepository.findById(id).orElse(null);
    }

    public Cliente createCliente(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    public Cliente updateCliente(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    public void deleteClienteById(int id) {
        clienteRepository.deleteById(id);
    }
}
