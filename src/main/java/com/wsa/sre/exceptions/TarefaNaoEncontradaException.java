package com.wsa.sre.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.BAD_REQUEST)
public class TarefaNaoEncontradaException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public TarefaNaoEncontradaException(String mensagem) {
		super(mensagem);
	}

}
