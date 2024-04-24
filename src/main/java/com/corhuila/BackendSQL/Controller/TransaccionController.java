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

import com.corhuila.BackendSQL.Entity.Transaccion;
import com.corhuila.BackendSQL.Service.TransaccionService;

@RestController
@RequestMapping("/transaccion")
@CrossOrigin
public class TransaccionController {
    @Autowired
    private TransaccionService transaccionService;

    @GetMapping
    public List<Transaccion> getAllClientes() {
        return transaccionService.getAllTransaccions();
    }

    @GetMapping("/{id}")
    public Transaccion getClienteById(@PathVariable int id) {
        return transaccionService.getTransaccionById(id);
    }

    @PostMapping
    public Transaccion createTransaccion(@RequestBody Transaccion transaccion) {
        return transaccionService.createTransaccion(transaccion);
    }

    @PutMapping("/{id}")
    public Transaccion updateTransaccion(@PathVariable int id, @RequestBody Transaccion transaccion) {
        return transaccionService.updateTransaccion(transaccion);
    }

    @DeleteMapping("/{id}")
    public void deleteTransaccion(@PathVariable int id) {
        transaccionService.deleteTransaccionById(id);
    }
}
