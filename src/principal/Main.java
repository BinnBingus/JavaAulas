package principal;

import Entidades.Carro;
import Entidades.Moto;

public class Main {

	public static void main(String[] args) {
		Moto Kawasaki = new Moto("SeiLáManNãoConheço", "30", 2500, 3.0, true);
		Carro Civic = new Carro(null, null, 0, 0, true);
		
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		System.out.println(Kawasaki.toString());
		System.out.println("O valor em Aluguel foi de :R$" + Kawasaki.calcularAluguel(5));
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		System.out.println(Civic.toString());
		System.out.println("O valor em Aluguel foi de :R$" + Civic.calcularAluguel(5));
	}
	
	

}
