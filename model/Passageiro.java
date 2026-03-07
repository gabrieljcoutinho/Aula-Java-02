package model;

public class Passageiro {
    private String nome;
    private double saldo;
    private int totalViagens;
    private String categoriaFidelidade;

    // Construtor atualizado para receber nome e saldo inicial
    public Passageiro(String nome, double saldoInicial) {
        this.nome = nome;
        this.saldo = saldoInicial;
        this.totalViagens = 0;
        this.categoriaFidelidade = "Bronze";
    }

    // Método para carregar saldo com validação
    public void carregarSaldo(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("Recarga de R$" + valor + " realizada com sucesso.");
        } else {
            System.out.println("Erro: O valor da recarga deve ser positivo.");
        }
    }

    // Método para pagar viagem com validação de saldo e acúmulo de viagens
    public void pagarViagem(double valor) {
        if (valor <= this.saldo) {
            this.saldo -= valor;
            this.totalViagens++;
            System.out.println("Viagem de R$" + valor + " paga com sucesso.");
            verificarUpgrade();
        } else {
            System.out.println("Erro: Saldo insuficiente para realizar a viagem.");
        }
    }

    // Método interno para atualizar categoria
    private void verificarUpgrade() {
        if (this.totalViagens >= 20 && !this.categoriaFidelidade.equals("Ouro")) {
            this.categoriaFidelidade = "Ouro";
            System.out.println("Parabéns! Você subiu para a categoria Ouro.");
        } else if (this.totalViagens >= 10 && this.categoriaFidelidade.equals("Bronze")) {
            this.categoriaFidelidade = "Prata";
            System.out.println("Parabéns! Você subiu para a categoria Prata.");
        }
    }

    // Getters para permitir a leitura dos dados no SistemaPrincipal
    public String getNome() { return nome; }
    public double getSaldo() { return saldo; }
    public String getCategoriaFidelidade() { return categoriaFidelidade; }
}