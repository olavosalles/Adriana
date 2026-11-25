package org.example.atividadedao.model;

public class Tribo {
    private int id;
    private String nome;
    private String regiao;
    private String lingua;

    public Tribo() {}

    public Tribo(String nome, String regiao, String lingua) {
        this.nome = nome;
        this.regiao = regiao;
        this.lingua = lingua;
    }

    public Tribo(int id, String nome, String regiao, String lingua) {
        this.id = id;
        this.nome = nome;
        this.regiao = regiao;
        this.lingua = lingua;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getRegiao() { return regiao; }
    public void setRegiao(String regiao) { this.regiao = regiao; }

    public String getLingua() { return lingua; }
    public void setLingua(String lingua) { this.lingua = lingua; }

    public String realizarDanca() {
        return nome + " está realizando uma dança tradicional.";
    }

    public String produzirMascara() {
        return nome + " está produzindo uma máscara tradicional.";
    }

    public String exibirInformacoes() {
        return "Tribo [ID: " + id + ", Nome: " + nome + ", Região: " + regiao + ", Língua: " + lingua + "]";
    }

    @Override
    public String toString() {
        return exibirInformacoes();
    }
}

