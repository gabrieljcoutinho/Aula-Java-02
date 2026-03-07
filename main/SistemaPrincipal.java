package main;

import model.Passageiro;

public class SistemaPrincipal {

    public static void main(String[] args) {
        // Criando o objeto usando o construtor (Nome e Saldo inicial)
        Passageiro passageiro1 = new Passageiro("Ana Silva", 50.0);

        System.out.println("======= Sistema FiapRide ========");

        // Teste de Recarga Válida
        passageiro1.carregarSaldo(20.0);

        // Teste de Pagamento Válido
        passageiro1.pagarViagem(15.0);

        // Teste de Saldo Insuficiente (Cenário Inválido)
        passageiro1.pagarViagem(100.0);

        // Teste de Recarga Negativa (Cenário Inválido)
        passageiro1.carregarSaldo(-10.0);

        // Exibindo estado final usando os métodos Getters
        System.out.println("\n--- Estado Final ---");
        System.out.println("Passageiro: " + passageiro1.getNome());
        System.out.println("Saldo: R$" + passageiro1.getSaldo());
        System.out.println("Categoria: " + passageiro1.getCategoriaFidelidade());
    }
}