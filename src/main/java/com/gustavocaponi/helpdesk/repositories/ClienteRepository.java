package com.gustavocaponi.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gustavocaponi.helpdesk.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
