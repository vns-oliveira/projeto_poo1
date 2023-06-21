package br.ucb.poo;

import java.util.ArrayList;

public class Executora {

    public static void main(String[] args) {
        System.out.println("CRUDS");
        System.out.println("CADASTRO");

        ArrayList<Produto> produtos = new ArrayList<>();

        Produto bonecoNaruto = new Produto();
        bonecoNaruto.setNome("Boneco do Naruto");
        bonecoNaruto.setDescricao("Boneco colecionável do personagem Naruto");
        bonecoNaruto.setValor(27.99f);

        Produto bonecoBatman = new Produto();
        bonecoBatman.setNome("Boneco do Batman");
        bonecoBatman.setDescricao("Boneco colecionável do personagem Batman");
        bonecoBatman.setValor(19.99f);

        // Create - Adicionando produtos à lista
        produtos.add(bonecoNaruto);
        produtos.add(bonecoBatman);
  
        // Read - Exibindo os produtos
        for (Produto produto : produtos) {
            System.out.println("Nome: " + produto.getNome());
            System.out.println("Descrição: " + produto.getDescricao());
            System.out.println("Valor: R$ " + produto.getValor());
            System.out.println();
        }

        // Update - Modificando um produto existente
        Produto produtoAtualizado = new Produto();
        produtoAtualizado.setNome("Boneco do Superman");
        produtoAtualizado.setDescricao("Boneco colecionável do personagem Superman");
        produtoAtualizado.setValor(29.99f);
        produtos.set(1, produtoAtualizado);

        // Delete - Removendo um produto da lista
        produtos.remove(0);

        // Exibindo os produtos após as operações de CRUD
        System.out.println("Produtos após as operações de CRUD:");
        for (Produto produto : produtos) {
            System.out.println("Nome: " + produto.getNome());
            System.out.println("Descrição: " + produto.getDescricao());
            System.out.println("Valor: R$ " + produto.getValor());
            System.out.println();
        }
    }
}