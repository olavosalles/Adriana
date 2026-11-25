package org.example.atividadedao.model;

public class Manga {
    private int id;
    private String titulo;
    private String genero;
    private int numeroCapitulos;

    public Manga() {}

    public Manga(String titulo, String genero, int numeroCapitulos) {
        this.titulo = titulo;
        this.genero = genero;
        this.numeroCapitulos = numeroCapitulos;
    }

    public Manga(int id, String titulo, String genero, int numeroCapitulos) {
        this.id = id;
        this.titulo = titulo;
        this.genero = genero;
        this.numeroCapitulos = numeroCapitulos;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public String getGenero() { return genero; }
    public void setGenero(String genero) { this.genero = genero; }

    public int getNumeroCapitulos() { return numeroCapitulos; }
    public void setNumeroCapitulos(int numeroCapitulos) { this.numeroCapitulos = numeroCapitulos; }

    public String adicionarCapitulo() {
        this.numeroCapitulos++;
        return "Novo capítulo adicionado ao mangá " + titulo + ".";
    }

    public String publicar() {
        return "O mangá " + titulo + " foi publicado.";
    }

    public String exibirInformacoes() {
        return "Mangá [ID: " + id + ", Título: " + titulo + ", Gênero: " + genero + ", Capítulos: " + numeroCapitulos + "]";
    }

    @Override
    public String toString() {
        return exibirInformacoes();
    }
}

