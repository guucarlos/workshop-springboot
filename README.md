🚀 Projeto Spring Boot – API REST (Java + Spring Boot)
Este projeto é uma API REST desenvolvida em Java com Spring Boot, baseada no curso do Nelio Alves (EducandoWeb).
O objetivo é aprender na prática os fundamentos do Spring Boot, JPA/Hibernate, arquitetura em camadas e boas práticas para construção de serviços REST.
👉 Projeto publicado na nuvem e testado com Postman.
📌 Visão Geral
A aplicação simula um sistema de pedidos (e-commerce simplificado), permitindo o gerenciamento de:
Usuários
Produtos
Categorias
Pedidos
Itens de Pedido
A API segue o padrão REST, permitindo operações de criação, listagem, busca, atualização e exclusão (CRUD).
🛠️ Tecnologias Utilizadas
Java 21
Spring Boot
Spring Web
Spring Data JPA
Hibernate
H2 Database (ambiente de teste)
PostgreSQL (produção – Render)
Maven
Docker
Postman
🧱 Arquitetura do Projeto
O projeto segue a arquitetura em camadas, padrão em aplicações Spring Boot:
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
🧩 Camadas Explicadas
1️⃣ Resource (Controller)
Pacote: resources
Responsável por expor os endpoints REST e receber as requisições HTTP:
GET
POST
PUT
DELETE
Exemplos:
/users
/products
/orders
Utiliza anotações como:
@RestController
@RequestMapping
@GetMapping, @PostMapping, etc.
2️⃣ Service
Pacote: services
Contém a regra de negócio da aplicação:
validações
lógica de processamento
tratamento de exceções
O controller nunca acessa o repository diretamente.
3️⃣ Repository
Pacote: repositories
Responsável pela comunicação com o banco de dados, utilizando Spring Data JPA:
public interface UserRepository extends JpaRepository<User, Long> {
}
O Spring gera automaticamente os métodos CRUD.
4️⃣ Entities
Pacote: entities
Representam as tabelas do banco de dados e seus relacionamentos:
@Entity
@Id
@OneToMany
@ManyToOne
@ManyToMany
Exemplos:
Um Order possui vários OrderItem
Um Product pode pertencer a várias Category
🗄️ Banco de Dados
🔹 Ambiente de Teste
Utiliza H2 Database em memória, configurado em:
application-test.properties
Ideal para aprendizado e testes rápidos.
🔹 Produção
Utiliza PostgreSQL, com deploy realizado no Render, usando variáveis de ambiente.
⚠️ Tratamento de Exceções
Centralizado no pacote resources.exceptions, garantindo respostas padronizadas.
Exemplo de erro 404:
{
"timestamp": "2026-01-22T19:30:00Z",
"status": 404,
"error": "Resource not found",
"message": "User not found",
"path": "/users/10"
}
▶️ Como Executar Localmente
Clone o repositório
Abra no IntelliJ ou Eclipse
Execute a classe:
ProjetoSpringApplication
A aplicação estará disponível em:
http://localhost:8080
☁️ Deploy na Nuvem (Render)
O projeto foi publicado no Render, utilizando Docker.
Variáveis de ambiente utilizadas:
APP_PROFILE=prod
DATABASE_URL=jdbc:postgresql://usuario:senha@host:5432/banco
A aplicação está pronta para rodar em ambiente de produção.
🧪 Testes com Postman
Exemplos de endpoints disponíveis:
GET /users
GET /users/{id}
POST /users
PUT /users/{id}
DELETE /users/{id}
O mesmo padrão se aplica a:
/products
/categories
/orders