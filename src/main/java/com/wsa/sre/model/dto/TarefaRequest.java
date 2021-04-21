package com.wsa.sre.model.dto;

import java.time.Instant;

import com.wsa.sre.model.Tarefa;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class TarefaRequest {
	
	private String nome;
	
	private Instant creatadeDate;

	public Tarefa toTarefa() {
		return new Tarefa(this.nome);
	}

}
