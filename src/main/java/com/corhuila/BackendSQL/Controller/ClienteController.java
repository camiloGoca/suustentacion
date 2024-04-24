package com.corhuila.BackendSQL.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.corhuila.BackendSQL.Entity.Cliente;
import com.corhuila.BackendSQL.Service.ClienteService;

@RestController
@RequestMapping("/cliente")
@CrossOrigin
public class ClienteController {
    @Autowired
    private ClienteService clienteService;

    @GetMapping
    public List<Cliente> getAllClientes() {
        return clienteService.getAllClientes();
    }

    @GetMapping("/{id}")
    public Cliente getClienteById(@PathVariable int id) {
        return clienteService.getClienteById(id);
    }

    @PostMapping
    public Cliente createCliente(@RequestBody Cliente Cliente) {
        return clienteService.createCliente(Cliente);
    }

    @PutMapping("/{id}")
    public Cliente updateCliente(@PathVariable int id, @RequestBody Cliente Cliente) {
        return clienteService.updateCliente(Cliente);
    }

    @DeleteMapping("/{id}")
    public void deleteClienteById(@PathVariable int id) {
        clienteService.deleteClienteById(id);
    }
}
