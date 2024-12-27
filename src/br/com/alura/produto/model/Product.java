package br.com.alura.produto.model;

public class Product implements Vendavel {
    private String nome;
    private double precoProduto;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrecoProduto() {
        return precoProduto;
    }

    public void setPrecoProduto(double precoProduto) {
        this.precoProduto = precoProduto;
    }

    @Override
    public double getPrecoTotalCompra(int quantidade) {
        return precoProduto * quantidade;
    }

    @Override
    public double getAplicaDesconto(double percentual, double precoFinal) {
        return precoProduto -= (precoProduto * percentual / 100.0);
    }
}
