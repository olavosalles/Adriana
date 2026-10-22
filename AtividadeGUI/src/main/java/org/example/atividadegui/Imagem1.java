package org.example.atividadegui;

class Camisa {
    private String cor;
    private String tamanho;
    private double preco;

    public Camisa(String cor, String tamanho, double preco) {
        this.cor = cor;
        this.tamanho = tamanho;
        this.preco = preco;
    }

    public String vestir() {
        return "A camisa foi vestida.";
    }

    public String lavar() {
        return "A camisa foi lavada.";
    }

    public String exibirInformacoes() {
        return "Camisa [Cor: " + cor + ", Tamanho: " + tamanho + ", Preço: R$ " + String.format("%.2f", preco) + "]";
    }
}

class Calca {
    private String cor;
    private String tamanho;
    private double preco;

    public Calca(String cor, String tamanho, double preco) {
        this.cor = cor;
        this.tamanho = tamanho;
        this.preco = preco;
    }

    public String vestir() {
        return "A calça foi vestida.";
    }

    public String lavar() {
        return "A calça foi lavada.";
    }

    public String exibirInformacoes() {
        return "Calça [Cor: " + cor + ", Tamanho: " + tamanho + ", Preço: R$ " + String.format("%.2f", preco) + "]";
    }
}

class Terno {
    private String cor;
    private String tamanho;
    private double preco;

    public Terno(String cor, String tamanho, double preco) {
        this.cor = cor;
        this.tamanho = tamanho;
        this.preco = preco;
    }

    public String abotoar() {
        return "O terno foi abotoado.";
    }

    public String vestir() {
        return "O terno foi vestido.";
    }

    public String exibirInformacoes() {
        return "Terno [Cor: " + cor + ", Tamanho: " + tamanho + ", Preço: R$ " + String.format("%.2f", preco) + "]";
    }
}
