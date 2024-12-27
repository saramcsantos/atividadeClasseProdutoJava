package br.com.alura.produto.model;

public class Servico implements Vendavel {
    private String descricaoServico;
    private double precoPorHora;

    public String getDescricaoServico() {
        return descricaoServico;
    }

    public void setDescricaoServico(String descricaoServico) {
        this.descricaoServico = descricaoServico;
    }

    public double getPrecoPorHora() {
        return precoPorHora;
    }

    public void setPrecoPorHora(double precoPorHora) {
        this.precoPorHora = precoPorHora;
    }

    @Override
    public double getPrecoTotalCompra(int quantidade) {
        return precoPorHora * quantidade;
    }

    @Override
    public double getAplicaDesconto(double percentual, double precoFinal) {
        return precoPorHora -= (precoPorHora * percentual / 100.0);
    }
}
