package com.corhuila.BackendSQL.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.corhuila.BackendSQL.Entity.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository <Cliente, Integer>{}
