package br.ucb.poo;

public class Compra {
    private String produto;
    private int quantidade;
    private float valorTotal;

    public String getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }

    public void setQuantidade(int i) {
        this.quantidade = i;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }
}
