public class Bicicleta {
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
