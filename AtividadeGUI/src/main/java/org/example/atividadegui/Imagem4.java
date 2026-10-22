package org.example.atividadegui;

class Manga {
    private String titulo;
    private String genero;
    private int numeroCapitulos;

    public Manga(String titulo, String genero, int numeroCapitulos) {
        this.titulo = titulo;
        this.genero = genero;
        this.numeroCapitulos = numeroCapitulos;
    }

    public String adicionarCapitulo() {
        this.numeroCapitulos++;
        return "Novo capítulo adicionado ao mangá " + titulo + ".";
    }

    public String publicar() {
        return "O mangá " + titulo + " foi publicado.";
    }

    public String exibirInformacoes() {
        return "Mangá [Título: " + titulo + ", Gênero: " + genero + ", Capítulos: " + numeroCapitulos + "]";
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

    public String atacar() {
        return nome + " realizou um ataque!";
    }

    public String falar() {
        return nome + " está falando.";
    }

    public String exibirInformacoes() {
        return "Personagem [Nome: " + nome + ", Idade: " + idade + " anos, Tipo: " + tipo + "]";
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

    public String desenhar() {
        return nome + " está desenhando um mangá.";
    }

    public String criarPersonagem() {
        return nome + " criou um novo personagem.";
    }

    public String exibirInformacoes() {
        return "Desenhista [Nome: " + nome + ", Especialidade: " + especialidade + ", Experiência: " + anosExperiencia + " anos]";
    }
}
