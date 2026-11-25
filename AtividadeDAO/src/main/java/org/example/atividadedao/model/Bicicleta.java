package org.example.atividadedao.model;

public class Bicicleta {
    private int id;
    private String cor;
    private String marca;
    private double preco;

    public Bicicleta() {}

    public Bicicleta(String cor, String marca, double preco) {
        this.cor = cor;
        this.marca = marca;
        this.preco = preco;
    }

    public Bicicleta(int id, String cor, String marca, double preco) {
        this.id = id;
        this.cor = cor;
        this.marca = marca;
        this.preco = preco;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getCor() { return cor; }
    public void setCor(String cor) { this.cor = cor; }

    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }

    public double getPreco() { return preco; }
    public void setPreco(double preco) { this.preco = preco; }

    public String pedalar() {
        return "A bicicleta está em movimento.";
    }

    public String acelerar() {
        return "A bicicleta está acelerando.";
    }

    public String exibirInformacoes() {
        return "Bicicleta [ID: " + id + ", Marca: " + marca + ", Cor: " + cor + ", Preço: R$ " + String.format("%.2f", preco) + "]";
    }

    @Override
    public String toString() {
        return exibirInformacoes();
    }
}

