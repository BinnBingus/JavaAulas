package VariaveisCompostas;

public class VariaveisCompostas {

	public static void main(String[] args) {
		
		// String[] Usuarios = new String [5];
		
		double [ ] notasAlunos = new double [5];
		
		notasAlunos[0] = 9.0;
		notasAlunos[1] = 1.0;
		notasAlunos[2] = 4.0;
		notasAlunos[3] = 6.0;
		notasAlunos[4] = 10.0;
		double media = 0;
		
		
		
		for (int i = 0; i < notasAlunos.length; i++) {
			
			media =  (notasAlunos[i] + notasAlunos[i]) / 2;
			
			//System.out.println(notasAlunos[i]);
			System.out.println(media);
			
		}
		
		for (double nota : notasAlunos) {
			//media =  nota + nota;
			//System.out.println(media);
			
		}
		
		// System.out.println(notasAlunos [0]);
		
		//System.out.println(media);
		
		
	}

}
