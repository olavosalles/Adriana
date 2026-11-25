package org.example.atividadedao.model;

public class Artista {
    private int id;
    private String nome;
    private String nacionalidade;
    private int idade;

    public Artista() {}

    public Artista(String nome, String nacionalidade, int idade) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
    }

    public Artista(int id, String nome, String nacionalidade, int idade) {
        this.id = id;
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getNacionalidade() { return nacionalidade; }
    public void setNacionalidade(String nacionalidade) { this.nacionalidade = nacionalidade; }

    public int getIdade() { return idade; }
    public void setIdade(int idade) { this.idade = idade; }

    public String esculpirMascara() {
        return nome + " está esculpindo a máscara.";
    }

    public String pintarMascara() {
        return nome + " está pintando a máscara.";
    }

    public String exibirInformacoes() {
        return "Artista [ID: " + id + ", Nome: " + nome + ", Nacionalidade: " + nacionalidade + ", Idade: " + idade + " anos]";
    }

    @Override
    public String toString() {
        return exibirInformacoes();
    }
}

