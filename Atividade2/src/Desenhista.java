public class Desenhista {

    private String nome;
    private String especialidade;
    private int anosExperiencia;

    public Desenhista(String nome, String especialidade, int anosExperiencia) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.anosExperiencia = anosExperiencia;
    }

    public void desenhar() {
        System.out.println(nome + " está desenhando um mangá.");
    }

    public void criarPersonagem() {
        System.out.println(nome + " criou um novo personagem.");
    }

    public void exibirExperiencia() {
        System.out.println(nome + " possui " + anosExperiencia + " anos de experiência.");
    }
}
