package org.example.atividadedao.model;

public class Personagem {
    private int id;
    private String nome;
    private int idade;
    private String tipo;

    public Personagem() {}

    public Personagem(String nome, int idade, String tipo) {
        this.nome = nome;
        this.idade = idade;
        this.tipo = tipo;
    }

    public Personagem(int id, String nome, int idade, String tipo) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.tipo = tipo;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public int getIdade() { return idade; }
    public void setIdade(int idade) { this.idade = idade; }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    public String atacar() {
        return nome + " realizou um ataque!";
    }

    public String falar() {
        return nome + " está falando.";
    }

    public String exibirInformacoes() {
        return "Personagem [ID: " + id + ", Nome: " + nome + ", Idade: " + idade + " anos, Tipo: " + tipo + "]";
    }

    @Override
    public String toString() {
        return exibirInformacoes();
    }
}

