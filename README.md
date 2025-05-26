# Projeto Sistema de Pedidos

Este é um sistema de gerenciamento de pedidos desenvolvido com **Spring Boot**, utilizando os padrões de projeto **Strategy** e **State** para controle de frete e fluxo de estados do pedido, respectivamente.

Integrantes do grupo:
Leonardo Henrique Costa
Ana Carolina Dumont Franco
Fred


## 📌 Funcionalidades

- Cadastro de novos pedidos (POST /pedido)
- Atualização de pedidos (PUT /pedido/{id})
- Exclusão de pedidos (DELETE /pedido/{id})
- Listagem geral (GET /pedido)
- Busca por ID (GET /pedido/{id})
- Mudança de estado:
  - Pagar (PATCH /pedido/{id}/pagar)
  - Cancelar (PATCH /pedido/{id}/cancelar)
  - Despachar (PATCH /pedido/{id}/despachar)

## 🛠 Tecnologias

- Java 17
- Spring Boot
- H2 Database
- Design Patterns: **Strategy**, **State**

## 📦 Padrões Utilizados

### Strategy
Utilizado para cálculo de frete:
- FreteAviao
- FreteCaminhao

### State
Utilizado para transições de estado de pedido:
- AguardandoPagamentoState
- PagoState
- EnviadoState
- CanceladoState

Cada estado define as ações possíveis e impede transições inválidas.

## 🧪 Testando com Postman

- Importar coleção ou fazer chamadas diretas com `PATCH`, `POST`, `PUT`, GET E DELETE.
- Exemplo:
```http
PATCH http://localhost:8080/pedido/{id}/pagar
```

## ⚠️ Regras de Negócio

- Um pedido **não pode ser pago** se já estiver **PAGO, ENVIADO ou CANCELADO**
- Um pedido **não pode ser cancelado ou despachado** após o envio
- O cálculo do frete é automático conforme o tipo selecionado

## 📚 Diagrama de Classes

O projeto inclui um **diagrama de classes UML** com todos os componentes estruturais e relacionamentos.

![Diagrama](<DIAGRAMA DE CLASSE PROJETO3105.png>)

## 🚀 Executando

O banco H2 é inicializado automaticamente caso selecionado o profile de test com dados fictícios no DBService e acessando o caminho http://localhost:8080/h2-console e o PostgreSQL é só fazer a criação do banco igual ao que colocou em application-dev.properties em jdbc:postgresql://localhost:5432/{nome do banco} e ao iniciar o projeto os dados ja serão injetados.

---

Projeto desenvolvido para fins de aprendizado em Engenharia de Software com boas práticas em Java.
