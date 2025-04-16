package VariaveisCompostas;

import java.util.ArrayList;
import java.util.List;
import java.math.*;
import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		
		Scanner num = new Scanner (System.in);
		
		List <String> listaNomes = new ArrayList<>();
		List <Integer> listaNumeros = new ArrayList<>();
		List <Double> listaQuebrados = new ArrayList<>();
		
		//Integer Aleatorio = Math.random(6);
		
		listaNomes.add("Luiz Fernando Carrupt Maceta");
		listaNomes.add("P'Didy");
		listaNomes.add("Justin Biber");
		listaNomes.add(1, "FBI");
		listaNomes.add(3,"InterPOOL");
		
		
		System.out.println(listaNomes.size());
		
		System.out.println(listaNomes.get(2));
		
		listaNomes.remove(1);
		
		listaNomes.remove("FBI");
		
		System.out.println(listaNomes.indexOf("P'Didy"));
		
		for(String nome : listaNomes) {
			System.out.println(nome);
		}
		
		
	}

}
