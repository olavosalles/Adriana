package org.example.atividadegui;

class Pessoa {
    private String sexo;
    private String corCabelo;
    private int idade;

    public Pessoa(String sexo, String corCabelo, int idade) {
        this.sexo = sexo;
        this.corCabelo = corCabelo;
        this.idade = idade;
    }

    public String pedalar() {
        return "A pessoa está pedalando.";
    }

    public String falar() {
        return "A pessoa está falando.";
    }

    public String exibirInformacoes() {
        return "Pessoa [Sexo: " + sexo + ", Cabelo: " + corCabelo + ", Idade: " + idade + " anos]";
    }
}

class Bicicleta {
    private String cor;
    private String marca;
    private double preco;

    public Bicicleta(String cor, String marca, double preco) {
        this.cor = cor;
        this.marca = marca;
        this.preco = preco;
    }

    public String pedalar() {
        return "A bicicleta está em movimento.";
    }

    public String acelerar() {
        return "A bicicleta está acelerando.";
    }

    public String exibirInformacoes() {
        return "Bicicleta [Marca: " + marca + ", Cor: " + cor + ", Preço: R$ " + String.format("%.2f", preco) + "]";
    }
}

class Arvore {
    private String especie;
    private String corFolha;
    private double tamanho;

    public Arvore(String especie, String corFolha, double tamanho) {
        this.especie = especie;
        this.corFolha = corFolha;
        this.tamanho = tamanho;
    }

    public String crescer() {
        return "A árvore está crescendo.";
    }

    public String produzirFrutos() {
        return "A árvore está dando frutos.";
    }

    public String exibirInformacoes() {
        return "Árvore [Espécie: " + especie + ", Folhas: " + corFolha + ", Altura: " + tamanho + " m]";
    }
}
