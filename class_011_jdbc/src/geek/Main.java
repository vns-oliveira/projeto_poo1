package geek;

import br.ucb.poo.Cliente;
import br.ucb.poo.Conexao;
import br.ucb.poo.Produto;

public class Main {

	public static void main(String[] args) {
		
		String host = "jdbc:mysql://localhost:3306/projeto";
		String user = "root";
		String password = "Vinicius99@";
		
		Conexao conexao = new Conexao(host, user, password);
		
		Cliente cliente1 = new Cliente();
		cliente1.setNome("Beatriz");
		cliente1.setEmail("bia@gmail.com");
		cliente1.setTelefone("(99) 9 9999-9999");
		cliente1.setEndereco("Vicente Pires");
		
		conexao.salvarCliente(cliente1.getNome(), cliente1.getEmail(), cliente1.getTelefone(), cliente1.getEndereco());
		
		 Produto produto = new Produto();
	     produto.setNome("Boneco Madara");
	     produto.setDescricao("Boneco");
	     produto.setValor(32.99f);
	        
	     conexao.salvarProduto(produto.getNome(), produto.getDescricao(), produto.getValor());
	     
    }
}

