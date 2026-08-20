public class Mascara {

    private String cor;
    private String tamanho;
    private String formato;

    public Mascara(String cor, String tamanho, String formato){
        this.cor = cor;
        this.tamanho = tamanho;
        this.formato = formato;
    }

    public void limpar(){
        System.out.println("A mascara foi limpa.");
    }

    public void colocar(){
        System.out.println("A mostra foi colocada.");
    }

    public void retirar(){
        System.out.println("A mascara foi retirada.");
    }
}
