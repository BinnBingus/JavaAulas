package Entidades;

public class Moto extends Veiculos {
	private boolean Cilindradas;
	
	public Moto(String marca, String modelo, int ano, double valorDiario, boolean Cilindradas) {
		super(marca, modelo, ano, valorDiario);
		this.Cilindradas = Cilindradas;
		// TODO Auto-generated constructor stub
	}

}
