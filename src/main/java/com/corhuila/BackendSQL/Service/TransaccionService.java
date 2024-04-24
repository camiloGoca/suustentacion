package com.corhuila.BackendSQL.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.corhuila.BackendSQL.Entity.Transaccion;
import com.corhuila.BackendSQL.Repository.TransaccionRepository;

@Service
public class TransaccionService {
    @Autowired
    private TransaccionRepository transaccionRepository;

    public List<Transaccion> getAllTransaccions() {
        return transaccionRepository.findAll();
    }

    public Transaccion getTransaccionById(int id) {
        return transaccionRepository.findById(id).orElse(null);
    }

    public Transaccion createTransaccion(Transaccion transaccion) {
        return transaccionRepository.save(transaccion);
    }

    public Transaccion updateTransaccion(Transaccion transaccion) {
        return transaccionRepository.save(transaccion);
    }

    public void deleteTransaccionById(int id) {
        transaccionRepository.deleteById(id);
    }
}
