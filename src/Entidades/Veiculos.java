package Entidades;

public class Veiculos {
	//Atributos da Classe
	private String marca;
	private String modelo;
	private int Ano;
	private double ValorDiario;
	
	//Construtores
	public Veiculos(String marca, String modelo, int ano, double valorDiario) {
		this.marca = marca;
		this.modelo = modelo;
		this.Ano = ano;
		this.ValorDiario = valorDiario;
	}
	
	// Getter e Setters

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return Ano;
	}

	public void setAno(int ano) {
		Ano = ano;
	}

	public double getValorDiario() {
		return ValorDiario;
	}

	public void setValorDiario(double valorDiario) {
		ValorDiario = valorDiario;
	}

	
	//toString
	
	@Override
	public String toString() {
		return "Marca=" + marca + 
				"\nModelo=" + modelo + 
				"\nAno=" + Ano + 
				"\nValorDiario=" + ValorDiario;
	}
	
}
