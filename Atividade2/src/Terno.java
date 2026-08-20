public class Terno {

    private String cor;
    private String tamanho;
    private double preco;

    public Terno(String cor, String tamanho, double preco) {
        this.cor = cor;
        this.tamanho = tamanho;
        this.preco = preco;
    }

    public void abotoar() {
        System.out.println("O terno foi abotoado.");
    }

    public void vestir() {
        System.out.println("O terno foi vestido.");
    }

    public void exibirInformacoes() {
        System.out.println("Cor: " + cor);
        System.out.println("Tamanho: " + tamanho);
        System.out.println("Preço: " + preco);
    }
}
