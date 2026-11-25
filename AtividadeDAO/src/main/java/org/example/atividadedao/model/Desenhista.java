package org.example.atividadedao.model;

public class Desenhista {
    private int id;
    private String nome;
    private String especialidade;
    private int anosExperiencia;

    public Desenhista() {}

    public Desenhista(String nome, String especialidade, int anosExperiencia) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.anosExperiencia = anosExperiencia;
    }

    public Desenhista(int id, String nome, String especialidade, int anosExperiencia) {
        this.id = id;
        this.nome = nome;
        this.especialidade = especialidade;
        this.anosExperiencia = anosExperiencia;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getEspecialidade() { return especialidade; }
    public void setEspecialidade(String especialidade) { this.especialidade = especialidade; }

    public int getAnosExperiencia() { return anosExperiencia; }
    public void setAnosExperiencia(int anosExperiencia) { this.anosExperiencia = anosExperiencia; }

    public String desenhar() {
        return nome + " está desenhando um mangá.";
    }

    public String criarPersonagem() {
        return nome + " criou um novo personagem.";
    }

    public String exibirInformacoes() {
        return "Desenhista [ID: " + id + ", Nome: " + nome + ", Especialidade: " + especialidade + ", Experiência: " + anosExperiencia + " anos]";
    }

    @Override
    public String toString() {
        return exibirInformacoes();
    }
}

