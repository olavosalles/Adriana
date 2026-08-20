public class Main {
    public static void main(String[] args) {


    // Testes da imagem 1
        Camisa camisa = new Camisa("Azul", "M", 89.90);
        camisa.vestir();
        camisa.lavar();
        camisa.exibirInformacoes();
        System.out.println();

        Calca calca = new Calca("Preta", "G", 99.90);
        calca.vestir();
        calca.lavar();
        calca.exibirInformacoes();
        System.out.println();

        Terno terno = new Terno("Azul claro", "M", 139.90);
        terno.abotoar();
        terno.vestir();
        terno.exibirInformacoes();
        System.out.println();

    // Testes da imagem 2
        Bicicleta bicicleta = new Bicicleta("Preta", "Caloi", 949.00);
        bicicleta.pedalar();
        bicicleta.acelerar();
        bicicleta.frear();
        System.out.println();

        Pessoa pessoa = new Pessoa("M", "Moreno", 19);
        pessoa.pedalar();
        pessoa.falar();
        pessoa.gritar();
        System.out.println();

        Arvore arvore = new Arvore("Jabuticabeira", "Verde", 3.00);
        arvore.crescer();
        arvore.produzirFrutos();
        arvore.infArvore();
        System.out.println();

    // Testes imagem 3
        Mascara mascara = new Mascara("Marrom", "G", "Circular");
        mascara.limpar();
        mascara.colocar();
        mascara.retirar();
        System.out.println();

        Artista artista = new Artista("Mauricio", "Brasileiro", 67);
        artista.esculpirMascara();
        artista.pintarMascara();
        artista.exibirInformacoes();
        System.out.println();

        Tribo tribo = new Tribo("Zulu", "África do Sul", "IsiZulu");
        tribo.produzirMascara();
        tribo.realizarDanca();
        tribo.exibirInformacoes();
        System.out.println();

    // Testes imagem 4
        Manga manga = new Manga("Naruto", "Ação", 700);
        manga.publicar();
        manga.adicionarCapitulo();
        manga.exibirInformacoes();
        System.out.println();

    }
}
