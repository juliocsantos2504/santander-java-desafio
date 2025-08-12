# Santander Java Desafio

Este repositório contém a implementação de uma API RESTful desenvolvida durante o Bootcamp Java Backend Santander da Digital Innovation One (DIO). O projeto visa simular funcionalidades de um sistema bancário, incluindo operações como criação de usuários e contas.

## Tecnologias Utilizadas

- **Java 21**: Linguagem de programação principal.
- **Spring Boot 3.5.4**: Framework para desenvolvimento da aplicação.
- **Spring Data JPA**: Implementação de persistência de dados.
- **Spring Web**: Criação de endpoints RESTful.
- **Springdoc OpenAPI**: Documentação automática da API.
- **H2 Database**: Banco de dados em memória para desenvolvimento.
- **PostgreSQL**: Banco de dados para produção.
- **Gradle**: Sistema de automação de builds.

## Funcionalidades

- Criação de usuários com informações pessoais.
- Simulação de contas bancárias associadas a usuários.
- Validação de números de conta únicos.
- Documentação da API acessível via Swagger UI.

## Estrutura do Projeto

- **`src/main/java/me/dio/santander_java_desafio`**: Contém os pacotes principais da aplicação.
  - **controller**: Controladores REST.
  - **domain**: Modelos de dados.
  - **repository**: Interfaces de acesso a dados.
  - **service**: Lógica de negócios.
  - **config**: Configurações específicas, como conversão de URLs de banco de dados.
- **`src/main/resources`**: Contém arquivos de configuração e recursos estáticos.
  - **`application.yml`**: Configurações da aplicação, incluindo banco de dados e JPA.

## Como Executar

### Requisitos

- Java 21
- Gradle
- Banco de dados PostgreSQL (para produção)

### Desenvolvimento com H2 (Banco de Dados em Memória)

1. Clone o repositório:

   ```bash
   git clone https://github.com/juliocsantos2504/santander-java-desafio.git
   cd santander-java-desafio
