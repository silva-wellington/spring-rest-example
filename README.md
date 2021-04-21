# spring-rest-example
- Spring boot
- Spring mvc
- Spring jpa
- MySql
- Lonbok

## Pré-requisitos
1. Ter instalado o MySql na porta 3306
2. Criar um banco de dados com o nome `restdb`
3. Ter instalado o Maven

## Instalação do projeto
1. Clonar o repositório: `git clone https://github.com/silva-wellington/spring-rest-example`
2. Entrar na pasta do projeto: `cd spring-rest-example`
3. Executar o projeto: `mvn spring-boot:run`

## Features:
### GET

Busca todas as tarefas.

URL: `http://localhost:8088/api/tarefas`

### POST

Salva uma tarefa nova.

URL: `http://localhost:8088/api/tarefas`
body: 
~~~
{
	"nome": "Tarefa 1"
}
~~~

### PUT

Altera uma tarefa.

URL: `http://localhost:8088/api/tarefas/{ID}`
body: 
~~~
{
	"nome": "Tarefa 999"
}
~~~

### DELET

Exclui uma tarefa.
URL: `http://localhost:8088/api/tarefas/{ID}`




