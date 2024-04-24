package com.corhuila.BackendSQL.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.corhuila.BackendSQL.Entity.Transaccion;

@Repository
public interface TransaccionRepository extends JpaRepository<Transaccion, Integer> {}
