package hospital;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Hospital {

	public static void main(String[] args) {

		try (Connection conexao = DriverManager.getConnection("jdbc:mysql://10.225.0.4/20201164010003_hospital", "20201164010003", "20201164010003+santos")) {
			PreparedStatement stmt = conexao.prepareStatement("select * from medico");
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				int id = rs.getInt("id");
				String nome = rs.getString("nome");
				int matricula = rs.getInt("matricula");
				int idade = rs.getInt("idade");
				String especialidade = rs.getString("especialidade");
				float salario = rs.getFloat("salario");
				System.out.println("ID: " + id);
				System.out.println("Nome: " + nome);
				System.out.println("E-Mail: " + matricula);
				System.out.println("Idade: " + idade);
				System.out.println("Sspecialidade: " + especialidade);
				System.out.println("Salario: " + salario);
				
				System.out.println("-------------------------");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
