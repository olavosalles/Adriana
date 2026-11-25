package org.example.atividadedao.model;

public class Terno {
    private int id;
    private String cor;
    private String tamanho;
    private double preco;

    public Terno() {}

    public Terno(String cor, String tamanho, double preco) {
        this.cor = cor;
        this.tamanho = tamanho;
        this.preco = preco;
    }

    public Terno(int id, String cor, String tamanho, double preco) {
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

    public String abotoar() {
        return "O terno foi abotoado.";
    }

    public String vestir() {
        return "O terno foi vestido.";
    }

    public String exibirInformacoes() {
        return "Terno [ID: " + id + ", Cor: " + cor + ", Tamanho: " + tamanho + ", Preço: R$ " + String.format("%.2f", preco) + "]";
    }

    @Override
    public String toString() {
        return exibirInformacoes();
    }
}

