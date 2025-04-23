package principal;

import Entidades.Carro;
import Entidades.Moto;

public class Main {

	public static void main(String[] args) {
		Moto Kawasaki = new Moto(null, null, 0, 0, true);
		Carro Civic = new Carro(null, null, 0, 0, true);
		System.out.println(Civic.toString());
		System.out.println(Kawasaki.toString());
	}
	

	
	

}
