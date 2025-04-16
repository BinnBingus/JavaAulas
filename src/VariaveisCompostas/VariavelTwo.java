package VariaveisCompostas;

import java.util.Arrays;
import java.util.Scanner;

public class VariavelTwo {
	
	public static void main(String[] args) {
		
		int count = 0;
		
		Scanner num = new Scanner (System.in);

		System.out.println("Qtd itens no vetor?: " );
		int tam = num.nextInt();
		
		double[] notasAlunos = new double [tam];
		
		do {
			
			System.out.println("Quais as notas que queira inserir?: " );
			int nota = num.nextInt();
			
			if (nota >= 0 && nota <= 10) {
				for (int i = 0; i < notasAlunos.length; i++) {
					
					if (count == i) {
						notasAlunos[i] = nota;
					}
				}
				
				count ++;
				System.out.println("Número cadastrado!" );
			} else {
				System.out.println("Digite um número válido seu pola" );
			}
			
			
			}
			
		while (count != tam);
		
		double notas = 0;
		
		System.out.println("As notas são: ");
		for (int i = 0; i < notasAlunos.length; i++) {
			System.out.println(notasAlunos[i]);
			notas += notasAlunos[i] / tam;
			
		}
		
		System.out.println("A media é: ");
		System.out.println(notas);
		
		
		
		num.close();
	}
}
