package Entidades;

public class Carro extends Veiculos {
	//Encapsulamento
	//Atributos
	
	private boolean ArCondicionado;
	
	//Construtor
	
	public Carro(String marca, String modelo, int ano, double valorDiario, boolean ArCondicionado) {
		super(marca, modelo, ano, valorDiario);
		this.ArCondicionado = ArCondicionado;
		// TODO Auto-generated constructor stub
	}
	
}
