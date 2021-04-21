package com.wsa.sre.service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wsa.sre.exceptions.TarefaNaoEncontradaException;
import com.wsa.sre.model.Tarefa;
import com.wsa.sre.model.dto.TarefaRequest;
import com.wsa.sre.repository.TarefaRepository;

@Service
public class TarefaService {

	@Autowired
	private TarefaRepository tarefaRepository;

	public List<Tarefa> findAll() {
		return tarefaRepository.findAll();
	}

	public void gravarTarefa(TarefaRequest tarefaRequest) {
		
		Tarefa tarefa = tarefaRequest.toTarefa();
		tarefa.setCriado(LocalDateTime.now());
		tarefaRepository.save(tarefa);
		
	}

	public Tarefa alterarTarefa(Long id, TarefaRequest tarefaRequest) {
		
		Optional<Tarefa> tarefaBanco = tarefaRepository.findById(id);

		if (tarefaBanco.isPresent()) {
			Tarefa tarefa = tarefaBanco.get();
			tarefa.setNome(tarefaRequest.getNome());
			return tarefaRepository.save(tarefa);

		} else {
			throw new TarefaNaoEncontradaException("A tarefa de ID " + id + " não foi encontrada no banco!");
		}

	}

	public void deletarTarefa(Long id) {
		
		Optional<Tarefa> tarefaBanco = tarefaRepository.findById(id);

		if (tarefaBanco.isPresent()) {
			Tarefa tarefa = tarefaBanco.get();
			tarefaRepository.delete(tarefa);

		} else {
			throw new TarefaNaoEncontradaException("A tarefa de ID " + id + " não foi encontrada no banco!");
		}

	}
}
