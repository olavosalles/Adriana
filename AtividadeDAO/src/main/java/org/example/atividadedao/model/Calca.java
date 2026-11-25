package org.example.atividadedao.model;

public class Calca {
    private int id;
    private String cor;
    private String tamanho;
    private double preco;

    public Calca() {}

    public Calca(String cor, String tamanho, double preco) {
        this.cor = cor;
        this.tamanho = tamanho;
        this.preco = preco;
    }

    public Calca(int id, String cor, String tamanho, double preco) {
        this.id = id;
        this.cor = cor;
        this.tamanho = tamanho;
        this.preco = preco;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getCor() { return cor; }
    public void setCor(String cor) { this.cor = cor; }

    public String getTamanho() { return tamanho; }
    public void setTamanho(String tamanho) { this.tamanho = tamanho; }

    public double getPreco() { return preco; }
    public void setPreco(double preco) { this.preco = preco; }

    public String vestir() {
        return "A calça foi vestida.";
    }

    public String lavar() {
        return "A calça foi lavada.";
    }

    public String exibirInformacoes() {
        return "Calça [ID: " + id + ", Cor: " + cor + ", Tamanho: " + tamanho + ", Preço: R$ " + String.format("%.2f", preco) + "]";
    }

    @Override
    public String toString() {
        return exibirInformacoes();
    }
}

