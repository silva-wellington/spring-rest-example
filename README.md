# spring-rest-example

Este projeto é um CRUD simples usando as seguintes tecnologia:
- Spring boot
- Spring mvc
- Spring Rest
- Spring jpa
- MySql
- Lombok

## Pré-requisitos
1. Ter instalado o MySql na porta 3306
2. Criar um banco de dados com o nome `restdb`
3. Ter instalado o Maven

## Instalação do projeto
1. Clonar o repositório: `git clone https://github.com/silva-wellington/spring-rest-example`
2. Entrar na pasta do projeto: `cd spring-rest-example`
3. Executar o projeto: `mvn spring-boot:run`

## Features:

1. ### GET `http://localhost:8088/api/tarefas` Buscar todas as tarefas.
   - Retorna o código `200` e uma lista de `Tarefas`.

2. ### POST `http://localhost:8088/api/tarefas` Salvar uma tarefa nova.

   - Envia um json com uma Tarefa: 
	~~~
	{
		"nome": "Tarefa 1"
	}
	~~~

   - Retorna o código `200` em caso de sucesso e o objeto json persistido.

3. ### PUT `http://localhost:8088/api/tarefas/{ID}` Alterar uma tarefa.

   - Envia um json com uma Tarefa no body e o Id da Tarefa que será alterada no Path: 
	~~~
	{
		"nome": "Tarefa 1"
	}
	~~~

   - Retorna o código `200` em caso de sucesso e o objeto json persistido.

4. ### DELET `http://localhost:8088/api/tarefas/{ID}` Excluir uma tarefa.
   - Envia Id da Tarefa que será deletada no Path.
   - Retorna o código `200` em caso de sucesso.



