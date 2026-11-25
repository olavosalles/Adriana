package org.example.atividadedao.model;

public class Arvore {
    private int id;
    private String especie;
    private String corFolha;
    private double tamanho;

    public Arvore() {}

    public Arvore(String especie, String corFolha, double tamanho) {
        this.especie = especie;
        this.corFolha = corFolha;
        this.tamanho = tamanho;
    }

    public Arvore(int id, String especie, String corFolha, double tamanho) {
        this.id = id;
        this.especie = especie;
        this.corFolha = corFolha;
        this.tamanho = tamanho;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getEspecie() { return especie; }
    public void setEspecie(String especie) { this.especie = especie; }

    public String getCorFolha() { return corFolha; }
    public void setCorFolha(String corFolha) { this.corFolha = corFolha; }

    public double getTamanho() { return tamanho; }
    public void setTamanho(double tamanho) { this.tamanho = tamanho; }

    public String crescer() {
        return "A árvore está crescendo.";
    }

    public String produzirFrutos() {
        return "A árvore está dando frutos.";
    }

    public String exibirInformacoes() {
        return "Árvore [ID: " + id + ", Espécie: " + especie + ", Folhas: " + corFolha + ", Altura: " + tamanho + " m]";
    }

    @Override
    public String toString() {
        return exibirInformacoes();
    }
}

