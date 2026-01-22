# Projeto Spring Boot – Web Services (Java + Spring Boot)

Este projeto é uma **API REST** desenvolvida em **Java com Spring Boot**, baseada no curso do **Nelio Alves (EducandoWeb)**. O objetivo principal é **aprender na prática os fundamentos do Spring Boot**, JPA/Hibernate, arquitetura em camadas e boas práticas para construção de serviços REST.

---

## Visão Geral

A aplicação simula um **sistema de pedidos (e-commerce simplificado)**, com cadastro e relacionamento entre:

* Usuários
* Produtos
* Categorias
* Pedidos
* Itens de Pedido

A API permite **criar, listar, buscar, atualizar e excluir** esses recursos, seguindo o padrão REST.

---

## Tecnologias Utilizadas

* **Java 17+**
* **Spring Boot**
* **Spring Web**
* **Spring Data JPA**
* **Hibernate**
* **H2 Database** (ambiente de teste)
* **Maven**
* **Postman** (para testes da API)

---

## Estrutura do Projeto

O projeto segue a **arquitetura em camadas**, bem comum em aplicações Spring:

```
com.educandoweb.projeto_spring
│
├── ProjetoSpringApplication.java
│
├── config
│   └── TesteConfig.java
│
├── entities
│   ├── User
│   ├── Order
│   ├── Product
│   ├── Category
│   └── OrderItem
│
├── repositories
│   ├── UserRepository
│   ├── OrderRepository
│   ├── ProductRepository
│   └── CategoryRepository
│
├── services
│   ├── UserService
│   ├── OrderService
│   ├── ProductService
│   └── CategoryService
│
├── resources
│   ├── UserResource
│   ├── OrderResource
│   ├── ProductResource
│   └── CategoryResource
│
└── resources.exceptions
    ├── ResourceExceptionHandler
    └── StandardError
```

---

## Camadas Explicadas

### 1. Resource (Controller)

Pacote: `resources`

Responsável por **receber as requisições HTTP** (GET, POST, PUT, DELETE) e devolver as respostas.

Exemplo:

* `UserResource` → endpoints `/users`
* `ProductResource` → endpoints `/products`

Aqui ficam as anotações como:

* `@RestController`
* `@RequestMapping`
* `@GetMapping`, `@PostMapping`, etc.

---

### 2. Service

Pacote: `services`

Contém a **regra de negócio** da aplicação. O controller chama o service, e o service conversa com o repository.

Exemplo:

* Buscar usuário por ID
* Tratar exceções
* Controlar regras antes de salvar ou excluir dados

---

### 3. Repository

Pacote: `repositories`

Responsável pela **comunicação com o banco de dados**.

Utiliza:

* `JpaRepository`

Exemplo:

```java
public interface UserRepository extends JpaRepository<User, Long> {
}
```

O Spring cria automaticamente os métodos de acesso ao banco.

---

### 4. Entidades (Entities)

Pacote: `entities`

Representam as **tabelas do banco de dados**.

Utilizam anotações JPA como:

* `@Entity`
* `@Id`
* `@OneToMany`
* `@ManyToOne`
* `@ManyToMany`

Exemplo:

* Um `Order` tem vários `OrderItem`
* Um `Product` pertence a várias `Category`

---

## Banco de Dados

### Ambiente de Teste

No arquivo:

```
src/main/resources/application-test.properties
```

É utilizado o banco **H2 em memória**, ideal para testes e aprendizado.

O banco é criado automaticamente quando a aplicação sobe.

---

## Tratamento de Exceções

Pacote: `resources.exceptions`

A classe `ResourceExceptionHandler` centraliza os erros da API, retornando respostas amigáveis como:

* 404 – Recurso não encontrado
* 400 – Erro de requisição

Exemplo de retorno:

```json
{
  "timestamp": "2026-01-22T19:30:00Z",
  "status": 404,
  "error": "Resource not found",
  "message": "User not found",
  "path": "/users/10"
}
```

---

## Como Executar o Projeto

1. Clone o repositório
2. Abra no IntelliJ / Eclipse
3. Execute a classe:

```
ProjetoSpringApplication
```

4. A API ficará disponível em:

```
http://localhost:8080
```

---

## Testes com Postman

Exemplos de endpoints:

* `GET /users`
* `GET /users/{id}`
* `POST /users`
* `PUT /users/{id}`
* `DELETE /users/{id}`

O mesmo padrão se aplica para:

* `/products`
* `/categories`
* `/orders`

---

## Objetivo Educacional do Projeto

Este projeto serve para aprender:

* Spring Boot do zero
* API REST
* JPA e Hibernate
* Relacionamentos entre entidades
* Tratamento de exceções
* Arquitetura em camadas
* Boas práticas no backend Java

---

## Próximos Passos Sugeridos

* Migrar de H2 para **PostgreSQL**
* Adicionar **DTOs**
* Implementar **Spring Security**
* Criar documentação com **Swagger/OpenAPI**
* Subir o projeto na nuvem (Railway, Render, AWS)

---

Se quiser, no próximo passo posso:

* Te explicar **arquivo por arquivo**
* Ajudar a **adaptar esse projeto para o seu marketplace**
* Preparar ele para **produção na nuvem** 🚀
