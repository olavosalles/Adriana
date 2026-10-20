class Pessoa {

    private String sexo;
    private String corCabelo;
    private int idade;

    public Pessoa(String sexo, String corCabelo, int idade){
        this.sexo = sexo;
        this.corCabelo = corCabelo;
        this.idade = idade;
    }

    public void pedalar() {
        System.out.println("A pessoa está pedalando.");
    }

    public void falar() {
        System.out.println("A pessoa está falando.");
    }

    public void gritar() {
        System.out.println("A pessoa está gritando.");
    }
}

class Bicicleta {
    private String cor;
    private String marca;
    private double preco;

    public Bicicleta(String cor, String marca, double preco){
        this.cor = cor;
        this.marca = marca;
        this.preco = preco;
    }

    public void pedalar() {
        System.out.println("A bicicleta está em movimento.");
    }

    public void acelerar() {
        System.out.println("A bicicleta está acelerando.");
    }

    public void frear() {
        System.out.println("A bicicleta está freando.");
    }

}

class Arvore {

    private String especie;
    private String corFolha;
    private double tamanho;

    public Arvore(String especie, String corFolha, double tamanho){
        this.especie = especie;
        this.corFolha = corFolha;
        this.tamanho = tamanho;
    }

    public void crescer(){
        System.out.println("A árvore está crescendo.");
    }

    public void produzirFrutos(){
        System.out.println("A árvore está dando frutos.");
    }

    public void infArvore(){
        System.out.println("Espécie: " + especie);
        System.out.println("Cor da folha: " + corFolha);
        System.out.println("Tamanho: " + tamanho + " metros");
    }
}

