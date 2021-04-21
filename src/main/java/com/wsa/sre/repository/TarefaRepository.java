package com.wsa.sre.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wsa.sre.model.Tarefa;

public interface TarefaRepository extends JpaRepository<Tarefa, Long> {

}
