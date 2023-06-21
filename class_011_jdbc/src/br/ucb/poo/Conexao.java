package br.ucb.poo;

import java.sql.*;

public class Conexao {
	
	private String host;
	private String username;
	private String password;

	public Conexao(String host, String username, String password) {
		this.host = host;
		this.username = username;
		this.password = password;
	}
	
	public void conectar() {
        try {
            Connection connection = DriverManager.getConnection(host, username, password);
            System.out.println("Conexão bem-sucedida!");
            
            connection.close();
        } catch (SQLException e) {
            System.out.println("Erro ao conectar-se ao banco de dados: " + e.getMessage());
        }
	}
	
	public void salvarCliente(String nome, String email, String telefone, String endereco) {
		try {
			
			Connection connection = DriverManager.getConnection(host, username, password);
            String sql = "INSERT INTO cliente (nome, email, telefone, endereco) VALUES (?, ?, ?, ?)";

            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, nome);
            statement.setString(2, email);
            statement.setString(3, telefone);
            statement.setString(4, endereco);

            int rowsInserted = statement.executeUpdate();

            if (rowsInserted > 0) {
                System.out.println("Dados inseridos com sucesso!");
            }

            statement.close();
            
		} catch(SQLException e) {
			 System.out.println("Erro ao conectar-se ao banco de dados: " + e.getMessage());
		}
	}

	public void salvarProduto(String nome, String descricao, float valor) {
		
try {
	
			Connection connection = DriverManager.getConnection(host, username, password);
            String sql = "INSERT INTO produto (nome, descricao, valor) VALUES (?, ?, ?)";

            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, nome);
            statement.setString(2, descricao);
            statement.setFloat(3, valor);

            int rowsInserted = statement.executeUpdate();

            if (rowsInserted > 0) {
                System.out.println("Dados inseridos com sucesso!");
            }

            statement.close();
            
		} catch(SQLException e) {
			 System.out.println("Erro ao conectar-se ao banco de dados: " + e.getMessage());
		}
		
	}
	
}