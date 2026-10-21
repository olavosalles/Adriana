package org.example;

class Mascara {
    private String cor;
    private String tamanho;
    private String formato;

    public Mascara(String cor, String tamanho, String formato) {
        this.cor = cor;
        this.tamanho = tamanho;
        this.formato = formato;
    }

    public void limpar() {
        System.out.println("A máscara foi limpa.");
    }

    public void colocar() {
        System.out.println("A máscara foi colocada.");
    }

    public void retirar() {
        System.out.println("A máscara foi retirada.");
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

    public void realizarDanca() {
        System.out.println(nome + " está realizando uma dança tradicional.");
    }

    public void produzirMascara() {
        System.out.println(nome + " está produzindo uma máscara tradicional.");
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Região: " + regiao);
        System.out.println("Língua: " + lingua);
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

    public void esculpirMascara() {
        System.out.println(nome + " está esculpindo a máscara.");
    }

    public void pintarMascara() {
        System.out.println(nome + " está pintando a máscara.");
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Nacionalidade: " + nacionalidade);
        System.out.println("Idade: " + idade);
    }
}
