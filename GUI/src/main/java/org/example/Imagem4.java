package org.example;

class Manga {
    private String titulo;
    private String genero;
    private int numeroCapitulos;

    public Manga(String titulo, String genero, int numeroCapitulos) {
        this.titulo = titulo;
        this.genero = genero;
        this.numeroCapitulos = numeroCapitulos;
    }

    public void adicionarCapitulo() {
        numeroCapitulos++;
        System.out.println("Novo capítulo adicionado.");
    }

    public void publicar() {
        System.out.println("O mangá " + titulo + " foi publicado.");
    }

    public void exibirInformacoes() {
        System.out.println("Título: " + titulo);
        System.out.println("Gênero: " + genero);
        System.out.println("Capítulos: " + numeroCapitulos);
    }
}

class Personagem {
    private String nome;
    private int idade;
    private String tipo;

    public Personagem(String nome, int idade, String tipo) {
        this.nome = nome;
        this.idade = idade;
        this.tipo = tipo;
    }

    public void atacar() {
        System.out.println(nome + " realizou um ataque!");
    }

    public void falar() {
        System.out.println(nome + " está falando.");
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Tipo: " + tipo);
    }
}

class Desenhista {
    private String nome;
    private String especialidade;
    private int anosExperiencia;

    public Desenhista(String nome, String especialidade, int anosExperiencia) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.anosExperiencia = anosExperiencia;
    }

    public void desenhar() {
        System.out.println(nome + " está desenhando um mangá.");
    }

    public void criarPersonagem() {
        System.out.println(nome + " criou um novo personagem.");
    }

    public void exibirExperiencia() {
        System.out.println(nome + " possui " + anosExperiencia + " anos de experiência.");
    }
}
