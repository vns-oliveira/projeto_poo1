package br.ucb.poo.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoFactory {
	
	public static void main(String[] args) {
		System.out.println("Conexão com banco de dados.");
		
		String host = "jdbc:mysql://localhost:3306/projeto";
		String user = "root";
		String password = "Vinicius99@";
		
		Connection connection = null;
		
		try {
            // Carregar o driver JDBC
            Class.forName("com.mysql.jdbc.Driver");

            // Estabelecer a conexão com o banco de dados
            connection = DriverManager.getConnection(host, user, password);

            // Aqui você pode executar as consultas ou atualizações no banco de dados
            // Exemplo: Statement statement = connection.createStatement();
            //          ResultSet resultSet = statement.executeQuery("SELECT * FROM tabela");

            // Fechar a conexão
            connection.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
	}
}
