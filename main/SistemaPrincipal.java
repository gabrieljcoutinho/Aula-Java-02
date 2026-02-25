package br.com.fiapride.main;

import br.com.fiapride.model.Passageiro;

public class SistemaPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Passageiro passageiro1 = new Passageiro();
		passageiro1.nome = "Ana Silva";
		passageiro1.saldo = 50.0;
		
		Passageiro passageiro2 = new Passageiro();
		passageiro2.nome = "Britney Spears";
		passageiro2.saldo = 1.000;
				
//Exibindo os dados no console
		System.out.println("=======Sistema FiapRide========");
		System.out.println("Passageiro: " + passageiro1.nome + " | Saldo: R$" + passageiro1.saldo);
		System.out.println("Passageiro: " + passageiro2.nome + " | Saldo: R$" + passageiro2.saldo);

	}

}
