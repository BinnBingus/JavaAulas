import java.util.InputMismatchException;
import java.util.Scanner;

public class Excecoes {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
//		try {
//			System.out.println("Qual numero será divido por 0? :");
//			int num = sc.nextInt();
//			
//			System.out.println("o numero digitado foi " + num);
//			
//			// Informar o erro gerado para compilação
//		} catch (InputMismatchException e) {
//			e.printStackTrace();
//			System.out.println("Burro!! Digite um numero valido: " );
//		}
		
		
//		try {
//			
//			int [] list = new int[5];
//			System.out.println(list [6]);
//			
//			list[0] = 1;
//			list[1] = 2;
//			
//
//		} catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("Local de lista não encontrado");
//
//		}
		

		
//		try {
//			int calc = 10/0;
//			System.out.println(calc);
//			
//		} catch (ArithmeticException c) {
//			System.out.println("Eroo! Tipo de erro:" + c + "O programa não consegue fazer a divisão por 0");
//		}

//		try {
//			String text = "ÁGUA E FOGO";
//			int num = Integer.parseInt(text);
//		} catch (Exception aef) {
//			System.out.println("Obsidian " + aef);
//		}

		
		try {
			System.out.println("Digite o primeiro numero: ");
			System.out.println("Digite o segundo numero: ");
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		

		sc.close();
	}

}
