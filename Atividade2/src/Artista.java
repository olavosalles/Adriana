public class Artista {

    private String nome;
    private String nacionalidade;
    private int idade;

    public Artista(String nome, String nacionalidade, int idade){
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
    }

    public void esculpirMascara(){
        System.out.println(nome + " está esculpindo a máscara.");
    }

    public void pintarMascara(){
        System.out.println(nome + " está pintando a máscara.");
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Nacionalidade: " + nacionalidade);
        System.out.println("Idade: " + idade);
    }
}
