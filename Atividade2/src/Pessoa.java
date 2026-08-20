public class Pessoa {

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
