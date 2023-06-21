package br.ucb.poo;
import java.util.ArrayList;
public class Executa {
    
        public static void main(String[] args) {
            System.out.println("CRUD Cliente");

            ArrayList<Cliente> clientes = new ArrayList<>();

            Cliente cliente1 = new Cliente();
            cliente1.setNome("Ana Maito");
            cliente1.setEmail("Ana23@example.com");
            cliente1.setTelefone("1234567890");

            Cliente cliente2 = new Cliente();
            cliente2.setNome("Rafaella");
            cliente2.setEmail("rafaella@example.com");
            cliente2.setTelefone("9876543210");

            // Create - Adicionando clientes à lista
            clientes.add(cliente1);
            clientes.add(cliente2);

           
 
 // Read - Exibindo os clientes
            System.out.println("Lista de Clientes:");
            for (Cliente cliente : clientes) {
                System.out.println("Nome: " + cliente.getNome());
                System.out.println("Email: " + cliente.getEmail());
                System.out.println("Telefone: " + cliente.getTelefone());
                System.out.println();
            }

            // Update - Modificando um cliente existente
            Cliente clienteAtualizado = new Cliente();
            clienteAtualizado.setNome("Vinícius");
            clienteAtualizado.setEmail("vinicius@example.com");
            clienteAtualizado.setTelefone("9999999999");
            clientes.set(1, clienteAtualizado);

            // Delete - Removendo um cliente da lista
            clientes.remove(0);

            // Exibindo os clientes após as operações de CRUD
            System.out.println("Clientes após as operações de CRUD:");
            for (Cliente cliente : clientes) {
                System.out.println("Nome: " + cliente.getNome());
                System.out.println("Email: " + cliente.getEmail());
                System.out.println("Telefone: " + cliente.getTelefone());
                System.out.println();
            }
        }
    }