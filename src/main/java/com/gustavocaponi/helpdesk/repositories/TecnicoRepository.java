package com.gustavocaponi.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gustavocaponi.helpdesk.domain.Tecnico;

public interface TecnicoRepository extends JpaRepository<Tecnico, Integer> {

}
