package br.com.fiapride.main;

import br.com.fiapride.model.Passageiro;

public class SistemaPrincipal {

    public static void main(String[] args) {
        Passageiro passageiro1 = new Passageiro();
        passageiro1.nome = "Ana Silva";
        passageiro1.saldo = 50.0;

        System.out.println("======= Sistema FiapRide ========");

        // Teste de Recarga Válida
        passageiro1.carregarSaldo(20.0);

        // Teste de Pagamento Válido
        passageiro1.pagarViagem(15.0);

        // Teste de Saldo Insuficiente (Cenário Inválido)
        passageiro1.pagarViagem(100.0);

        // Teste de Recarga Negativa (Cenário Inválido)
        passageiro1.carregarSaldo(-10.0);

        System.out.println("Estado Final - Passageiro: " + passageiro1.nome + " | Saldo: R$" + passageiro1.saldo);
    }
}