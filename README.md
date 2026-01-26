# 🚀 Projeto Spring Boot – API REST (Java + Spring Boot)

Este projeto é uma **API REST** desenvolvida em **Java com Spring Boot**, baseada no curso do **Nelio Alves (EducandoWeb)**.  
O objetivo é aplicar na prática os conceitos de **Spring Boot**, **JPA/Hibernate**, **arquitetura em camadas** e **boas práticas** no desenvolvimento de APIs REST.

---

## 📌 Visão Geral

A aplicação simula um **sistema de pedidos (e-commerce simplificado)**, permitindo o gerenciamento de:

- Usuários  
- Produtos  
- Categorias  
- Pedidos  
- Itens de Pedido  

A API segue o padrão **REST**, com operações de **CRUD** (Create, Read, Update e Delete).

---

## 🛠️ Tecnologias Utilizadas

- Java 21  
- Spring Boot  
- Spring Web  
- Spring Data JPA  
- Hibernate  
- H2 Database (ambiente de teste)
- PostgreSQL (produção – Render)  
- Maven  
- Docker  
- Postman  

## 🧱 Arquitetura do Projeto

O projeto segue a **arquitetura em camadas**, padrão em aplicações Spring Boot:

com.educandoweb.projeto_spring
│
│
├── ProjetoSpringApplication.java
│
├── config
│ └── TesteConfig.java
│
├── entities
│ ├── User
│ ├── Order
│ ├── Product
│ ├── Category
│ └── OrderItem
│
├── repositories
│ ├── UserRepository
│ ├── OrderRepository
│ ├── ProductRepository
│ └── CategoryRepository
│
├── services
│ ├── UserService
│ ├── OrderService
│ ├── ProductService
│ └── CategoryService
│
├── resources
│ ├── UserResource
│ ├── OrderResource
│ ├── ProductResource
│ └── CategoryResource
│
└── resources.exceptions
├── ResourceExceptionHandler
└── StandardError


---

## 🧩 Camadas da Aplicação

### Resource (Controller)
Responsável por receber as requisições HTTP e expor os endpoints REST (`GET`, `POST`, `PUT`, `DELETE`).

### Service
Contém as regras de negócio da aplicação, centralizando a lógica e validações.

### Repository
Responsável pela comunicação com o banco de dados utilizando **Spring Data JPA**.

### Entities
Representam as tabelas do banco de dados e seus relacionamentos.

---

## 🗄️ Banco de Dados

### Ambiente de Teste
Utiliza **H2 Database em memória**, configurado no perfil de teste.

### Produção
Utiliza **PostgreSQL**, com deploy realizado na nuvem através do **Render**.

---

## ⚠️ Tratamento de Exceções

O tratamento de exceções é centralizado, garantindo respostas padronizadas para erros como:

- 404 – Recurso não encontrado  
- 400 – Erro de requisição  

Exemplo de resposta:

```json
{
  "timestamp": "2026-01-22T19:30:00Z",
  "status": 404,
  "error": "Resource not found",
  "message": "User not found",
  "path": "/users/10"
}

- PostgreSQL (produção – Render)  
- Maven  
- Docker  
- Postman  
