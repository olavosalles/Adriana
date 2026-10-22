package org.example.atividadegui;

class Mascara {
    private String cor;
    private String tamanho;
    private String formato;

    public Mascara(String cor, String tamanho, String formato) {
        this.cor = cor;
        this.tamanho = tamanho;
        this.formato = formato;
    }

    public String limpar() {
        return "A máscara foi limpa.";
    }

    public String colocar() {
        return "A máscara foi colocada.";
    }

    public String exibirInformacoes() {
        return "Máscara [Cor: " + cor + ", Tamanho: " + tamanho + ", Formato: " + formato + "]";
    }
}

class Tribo {
    private String nome;
    private String regiao;
    private String lingua;

    public Tribo(String nome, String regiao, String lingua) {
        this.nome = nome;
        this.regiao = regiao;
        this.lingua = lingua;
    }

    public String realizarDanca() {
        return nome + " está realizando uma dança tradicional.";
    }

    public String produzirMascara() {
        return nome + " está produzindo uma máscara tradicional.";
    }

    public String exibirInformacoes() {
        return "Tribo [Nome: " + nome + ", Região: " + regiao + ", Língua: " + lingua + "]";
    }
}

class Artista {
    private String nome;
    private String nacionalidade;
    private int idade;

    public Artista(String nome, String nacionalidade, int idade) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
    }

    public String esculpirMascara() {
        return nome + " está esculpindo a máscara.";
    }

    public String pintarMascara() {
        return nome + " está pintando a máscara.";
    }

    public String exibirInformacoes() {
        return "Artista [Nome: " + nome + ", Nacionalidade: " + nacionalidade + ", Idade: " + idade + " anos]";
    }
}
