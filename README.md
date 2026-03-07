# Projeto FiapRide - Gestão de Passageiros

Este projeto simula um sistema de transporte onde é possível gerenciar o saldo e o nível de fidelidade de um passageiro.

## Funcionalidades Implementadas
* **Carregar Saldo**: Permite adicionar créditos ao passageiro, com validação para impedir valores negativos.
* **Pagar Viagem**: Deduz o valor da passagem do saldo, incrementa o contador de viagens e verifica se o passageiro atingiu um novo nível de fidelidade.
* **Sistema de Fidelidade**:
  - Bronze: Inicial.
  - Prata: Ao completar 10 viagens.
  - Ouro: Ao completar 20 viagens.

## Estrutura do Projeto
* `model/Passageiro.java`: Contém os atributos e regras de negócio.
* `main/SistemaPrincipal.java`: Classe responsável por testar e executar o sistema.