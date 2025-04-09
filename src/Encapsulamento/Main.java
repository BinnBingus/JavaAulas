package Encapsulamento;

import Encapsulamento.Conta;

public class Main {

	public static void main(String[] args) {
		
		Conta maria = new Conta("Teste", 1000000, "windows");
		
		maria.saque(900);
		maria.aumento(1000);
		
		System.out.println("Saldo : " + maria.GetSaldo());
		System.out.println("Herdeiro : " + maria.getTitular());
		
		System.out.println("New Saldo : " + maria.GetSaldo());
		
	}

}
