import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class outrasExcecoes {

	public static void main(String[] args) {
		
		try {
			Class.forName("texto");
		} catch (ClassNotFoundException e) {
			System.out.println("A classe não foi encontrada: ");
		} 
		
		
		try {
			File file = new File("arquivo.txt");
			FileReader fr = new FileReader(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			System.out.println("Fudeo tudo meno");
			e.printStackTrace();
		}finally {
			System.out.println("Programa finalizado");
		}
	}

}
