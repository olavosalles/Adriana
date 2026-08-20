public class Main {
    public static void main(String[] args) {


    // Testes da imagem 1
        System.out.println("\n----------------------------------------");
        Camisa camisa = new Camisa("Azul", "M", 89.90);
        camisa.vestir();
        camisa.lavar();
        camisa.exibirInformacoes();

        Calca calca = new Calca("Preta", "G", 99.90);
        calca.vestir();
        calca.lavar();
        calca.exibirInformacoes();

        Terno terno = new Terno("Azul claro", "M", 139.90);
        terno.abotoar();
        terno.vestir();
        terno.exibirInformacoes();

    // Testes da imagem 2
        System.out.println("\n----------------------------------------");
        Bicicleta bicicleta = new Bicicleta("Preta", "Caloi", 949.00);
        bicicleta.pedalar();
        bicicleta.acelerar();
        bicicleta.frear();

        Pessoa pessoa = new Pessoa("M", "Moreno", 19);
        pessoa.pedalar();
        pessoa.falar();
        pessoa.gritar();

        Arvore arvore = new Arvore("Jabuticabeira", "Verde", 3.00);
        arvore.crescer();
        arvore.produzirFrutos();
        arvore.infArvore();

    // Testes imagem 3
        System.out.println("\n----------------------------------------");
        Mascara mascara = new Mascara("Marrom", "G", "Circular");
        mascara.limpar();
        mascara.colocar();
        mascara.retirar();

        Artista artista = new Artista("Mauricio", "Brasileiro", 67);
        artista.esculpirMascara();
        artista.pintarMascara();
        artista.exibirInformacoes();

        Tribo tribo = new Tribo("Zulu", "África do Sul", "IsiZulu");
        tribo.produzirMascara();
        tribo.realizarDanca();
        tribo.exibirInformacoes();


    // Testes imagem 4
        System.out.println("\n----------------------------------------");
        Manga manga = new Manga("Naruto", "Ação", 700);
        manga.publicar();
        manga.adicionarCapitulo();
        manga.exibirInformacoes();

        Personagem personagem = new Personagem("Joao", 18, "Protagonista");
        personagem.atacar();
        personagem.falar();
        personagem.exibirInformacoes();

        Desenhista desenhista = new Desenhista("Akira", "Mangá", 10);
        desenhista.desenhar();
        desenhista.criarPersonagem();
        desenhista.exibirExperiencia();
    }
}
