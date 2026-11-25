package org.example.atividadedao.model;

public class Pessoa {
    private int id;
    private String sexo;
    private String corCabelo;
    private int idade;

    public Pessoa() {}

    public Pessoa(String sexo, String corCabelo, int idade) {
        this.sexo = sexo;
        this.corCabelo = corCabelo;
        this.idade = idade;
    }

    public Pessoa(int id, String sexo, String corCabelo, int idade) {
        this.id = id;
        this.sexo = sexo;
        this.corCabelo = corCabelo;
        this.idade = idade;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getSexo() { return sexo; }
    public void setSexo(String sexo) { this.sexo = sexo; }

    public String getCorCabelo() { return corCabelo; }
    public void setCorCabelo(String corCabelo) { this.corCabelo = corCabelo; }

    public int getIdade() { return idade; }
    public void setIdade(int idade) { this.idade = idade; }

    public String pedalar() {
        return "A pessoa está pedalando.";
    }

    public String falar() {
        return "A pessoa está falando.";
    }

    public String exibirInformacoes() {
        return "Pessoa [ID: " + id + ", Sexo: " + sexo + ", Cabelo: " + corCabelo + ", Idade: " + idade + " anos]";
    }

    @Override
    public String toString() {
        return exibirInformacoes();
    }
}

