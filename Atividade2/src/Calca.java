public class Calca {
    private String cor;
    private String tamanho;
    private double preco;

    public Calca(String cor, String tamanho, double preco) {
        this.cor = cor;
        this.tamanho = tamanho;
        this.preco = preco;
    }

    public void vestir() {
        System.out.println("A calça foi vestida.");
    }

    public void lavar() {
        System.out.println("A calça foi lavada.");
    }

    public void exibirInformacoes() {
        System.out.println("Cor: " + cor);
        System.out.println("Tamanho: " + tamanho);
        System.out.println("Preço: " + preco);
    }


}
