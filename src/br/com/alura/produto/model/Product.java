package br.com.alura.produto.model;

public class Product {
    private String nomeDoProduto;
    private double precoDoProduto;

    public String getNomeDoProduto() {
        return nomeDoProduto;
    }

    public void setNomeDoProduto(String nomeDoProduto) {
        this.nomeDoProduto = nomeDoProduto;
    }

    public double getPrecoDoProduto() {
        return precoDoProduto;
    }

    public void setPrecoDoProduto(double precoDoProduto) {
        this.precoDoProduto = precoDoProduto;
    }

    public double aplicaDesconto(double desconto){
        double calculaDesconto = precoDoProduto - (precoDoProduto * desconto);
        return calculaDesconto;
    }
}
