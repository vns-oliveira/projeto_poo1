package br.ucb.poo;
import java.util.ArrayList;

public class Executor {

    public static void main(String[] args) {
        System.out.println("CRUD Compras");

        ArrayList<Compra> compras = new ArrayList<>();

        Compra compra1 = new Compra();
        compra1.setProduto("Boneco do Naruto");
        compra1.setQuantidade(7);
        compra1.setValorTotal(42.99f);

        Compra compra2 = new Compra();
        compra2.setProduto("Boneco do Coringa");
        compra2.setQuantidade(1);
        compra2.setValorTotal(19.99f);

        // Create - Adicionando compras à lista
        compras.add(compra1);
        compras.add(compra2);

        // Read - Exibindo as compras
        System.out.println("Lista de Compras:");
        for (Compra compra : compras) {
            System.out.println("Produto: " + compra.getProduto());
            System.out.println("Quantidade: " + compra.getQuantidade());
            System.out.println("Valor Total: R$ " + compra.getValorTotal());
            System.out.println();
        }
        // Update - Modificando uma compra existente
        Compra compraAtualizada = new Compra();
        compraAtualizada.setProduto("Boneco do Superman");
        compraAtualizada.setQuantidade(1);
        compraAtualizada.setValorTotal(29.99f);
        compras.set(1, compraAtualizada);

        // Delete - Removendo uma compra da lista
        compras.remove(0);

        // Exibindo as compras após as operações de CRUD
        System.out.println("Compras após as operações de CRUD:");
        for (Compra compra : compras) {
            System.out.println("Produto: " + compra.getProduto());
            System.out.println("Quantidade: " + compra.getQuantidade());
            System.out.println("Valor Total: R$ " + compra.getValorTotal());
            System.out.println();
        }
    }
}