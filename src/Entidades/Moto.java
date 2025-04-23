package Entidades;
import serviço.Alugar;

public class Moto extends Veiculos implements Alugar {
	private boolean Cilindradas;
	
	public Moto(String marca, String modelo, int ano, double valorDiario, boolean Cilindradas) {
		super(marca, modelo, ano, valorDiario);
		this.Cilindradas = Cilindradas;
		// TODO Auto-generated constructor stub
	}
	
	public String ToString() {
		return  "\nMarca : " + getMarca() +
				"\nModelo : " + getModelo() +
				"\nAno : " + getAno() +
				"\nValor diaria : " + getValorDiario() + 
				"\nCilindrada : " + Cilindradas;
	}
	
	public double calcularAluguel(int dias) {
		double ValorAluguel;
		
		if (Cilindradas) {
			ValorAluguel = getValorDiario() * dias * 1.5;
		} else {
			ValorAluguel = getValorDiario() * dias;
		}
		
		return ValorAluguel;
	}

}
