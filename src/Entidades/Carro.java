package Entidades;

import serviço.Alugar;

public class Carro extends Veiculos implements Alugar {
	//Encapsulamento
	//Atributos
	
	private boolean ArCondicionado;
	
	//Construtor
	
	public Carro(String marca, String modelo, int ano, double valorDiario, boolean ArCondicionado) {
		super(marca, modelo, ano, valorDiario);
		this.ArCondicionado = ArCondicionado;
		// TODO Auto-generated constructor stub
	}
	
	//toString
	
	public String ToString() {
		return "Marca : " + getMarca() +
				"Modelo : " + getModelo() +
				"Ano : " + getAno() +
				"Valor diaria : " + getValorDiario() + 
				"Ar Condicionado : " + ArCondicionado;
	}
	
	public double calcularAluguel(int dias) {
		double ValorAluguel;
		
		if (ArCondicionado) {
			ValorAluguel = getValorDiario() * dias * 1.5;
		} else {
			ValorAluguel = getValorDiario() * dias;
		}
		
		return ValorAluguel;
	}
	
	
}
