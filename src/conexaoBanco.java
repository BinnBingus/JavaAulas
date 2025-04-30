import java.sql.Driver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
public class conexaoBanco {
	
	Scanner sc = new Scanner (System.in);

	public static void main(String[] args) {
		
		try {
			conectionBanco();
			System.out.println("Conectado com suceso");
		} catch (SQLException e) {
			System.out.println("Erro de conexão " + e);
		}
		
	}
	
	public static void conectionBanco() throws SQLException {
		
		String url = "jdbc:mysql://localhost:3306/Dados";
		String usuario = "root";
		String senha = "";
		
		Connection conexao = DriverManager.getConnection(url, usuario, senha);
		
		String sql = "INSERT INTO usuario (id, nome, cpf, corFavorita, dinoFavorito, crimeRealizado,orgaoRoubados) VALUES (?, ?, ?, ?, ?, ?, ?)";
		PreparedStatement consQuery = conexao.prepareStatement(sql);
		consQuery.setString(1, null);
		consQuery.setString(2, "Pedrinho Mamador");
		consQuery.setInt(3, 666666-6666);
		consQuery.setString(4, "Red");
		consQuery.setString(5,"Bronquiosauro");
		consQuery.setString(6, "Assasinato");
		consQuery.setInt(7, 1);
		
		consQuery.executeUpdate();
		
		consQuery.close();
		conexao.close();
		
		System.out.println("Conexão estabelecida");
	}

}
