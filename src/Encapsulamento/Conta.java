package Encapsulamento;

public class Conta {
	
	private String titular;
	private double saldo;
	public double diminuicao;
	public double aumento;
	public String windows;
	
	public Conta(String titular, double Saldo, String windows) {
		this.titular = titular;
		this.saldo = Saldo;
		this.windows = windows;
	}
	
	public void Morte(String windows) {
		this.windows = windows;
	}
	
	public String getDelete() {
		return windows;
	}
	
	public String getTitular() {
		return titular;
	}
	
	public double GetSaldo() {
		return saldo;
	}
	
	public void UrubuPix(double Ganho) {
		this.saldo = Ganho;
	}
	
	public void Heranca(String Filho) {
		this.titular = Filho;
	}
	
	public void aumento(double valor) {
		if (valor > 0) {
			this.saldo += valor;
		}else {
			System.out.println("Erro!! Você é burro ERRO!!");
		}
	}
	
	public void diminuicao(double valor) {
		if (valor > 0) {
			this.saldo -= valor;
		}else {
			System.out.println("Erro!! Você é burro ERRO!!");
		}
	}
	
	public void saque(double valor) {
		if (valor > this.saldo || this.saldo <= 0) {
			System.out.println("POBREKKKKKKKKKKKKKKKKK"+"\nValor não pode ser sacado");
		} else {
			
			if (valor == 0) {
				System.out.println("Você é autista?");
			} else {
				System.out.println("Valor Sacado R$" + valor);
				this.saldo -= valor;
			}
		}
	}
	
	
	
	
	
	
	
	//@Override
	//public String toString() {
	//	return "Titular: " + titular +
	//	" Saldo: R$" + saldo;
	//}
}
