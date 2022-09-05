package com.gustavocaponi.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gustavocaponi.helpdesk.domain.Chamado;

public interface ChamadoRepository extends JpaRepository<Chamado, Integer> {

}
