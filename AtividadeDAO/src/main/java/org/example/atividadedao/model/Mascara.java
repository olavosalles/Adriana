package org.example.atividadedao.model;

public class Mascara {
    private int id;
    private String cor;
    private String tamanho;
    private String formato;

    public Mascara() {}

    public Mascara(String cor, String tamanho, String formato) {
        this.cor = cor;
        this.tamanho = tamanho;
        this.formato = formato;
    }

    public Mascara(int id, String cor, String tamanho, String formato) {
        this.id = id;
        this.cor = cor;
        this.tamanho = tamanho;
        this.formato = formato;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getCor() { return cor; }
    public void setCor(String cor) { this.cor = cor; }

    public String getTamanho() { return tamanho; }
    public void setTamanho(String tamanho) { this.tamanho = tamanho; }

    public String getFormato() { return formato; }
    public void setFormato(String formato) { this.formato = formato; }

    public String limpar() {
        return "A máscara foi limpa.";
    }

    public String colocar() {
        return "A máscara foi colocada.";
    }

    public String exibirInformacoes() {
        return "Máscara [ID: " + id + ", Cor: " + cor + ", Tamanho: " + tamanho + ", Formato: " + formato + "]";
    }

    @Override
    public String toString() {
        return exibirInformacoes();
    }
}

