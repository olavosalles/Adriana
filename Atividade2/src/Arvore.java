public class Arvore {

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
