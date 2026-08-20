public class Manga {

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