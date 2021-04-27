package com.wsa.sre.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wsa.sre.model.Tarefa;
import com.wsa.sre.model.dto.TarefaRequest;
import com.wsa.sre.service.TarefaService;

@RestController
@RequestMapping("/api/tarefas")
public class TarefaController {
	
	@Autowired
	private TarefaService tarefaService;

	@GetMapping
	public ResponseEntity<List<Tarefa>> getTarefas() {
		return ResponseEntity.ok(tarefaService.findAll());
	}
	
	@PostMapping
	public ResponseEntity<Void> gravarTarefa(@RequestBody TarefaRequest tarefaRequest) {
		tarefaService.gravarTarefa(tarefaRequest);
		return ResponseEntity.noContent().build();
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Tarefa> alteraTarefa(@PathVariable Long id, @RequestBody TarefaRequest tarefaRequest) {
		Tarefa tarefa = tarefaService.alterarTarefa(id, tarefaRequest);
		return ResponseEntity.ok(tarefa);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deletarTarefa(@PathVariable Long id) {
		tarefaService.deletarTarefa(id);
		return ResponseEntity.noContent().build();
	}
	
}
