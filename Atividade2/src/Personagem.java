public class Personagem {

    private String nome;
    private int idade;
    private String tipo;

    public Personagem(String nome, int idade, String tipo) {
        this.nome = nome;
        this.idade = idade;
        this.tipo = tipo;
    }

    public void atacar() {
        System.out.println(nome + " realizou um ataque!");
    }

    public void falar() {
        System.out.println(nome + " está falando.");
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Tipo: " + tipo);
    }
}
