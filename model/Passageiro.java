package br.com.fiapride.model;

public class Passageiro {

    public String nome;
    public double saldo;

    // Método 1: Adiciona saldo à conta
    public void carregarSaldo(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("Recarga de R$" + valor + " realizada com sucesso para " + nome);
        } else {
            System.out.println("Erro: O valor da recarga deve ser positivo.");
        }
    }

    // Método 2: Desconta o valor de uma viagem
    public void pagarViagem(double valorViagem) {
        if (valorViagem <= 0) {
            System.out.println("Erro: Valor da viagem inválido.");
        } else if (this.saldo >= valorViagem) {
            this.saldo -= valorViagem;
            System.out.println("Viagem de R$" + valorViagem + " paga. Novo saldo de " + nome + ": R$" + this.saldo);
        } else {
            System.out.println("Erro: Saldo insuficiente para o passageiro " + nome);
        }
    }
}