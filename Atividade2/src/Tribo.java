public class Tribo {

    private String nome;
    private String regiao;
    private String lingua;

    public Tribo(String nome, String regiao, String lingua){
        this.nome = nome;
        this.regiao = regiao;
        this.lingua = lingua;
    }

    public void realizarDanca() {
        System.out.println(nome + " está realizando uma dança tradicional.");
    }

    public void produzirMascara() {
        System.out.println(nome + " está produzindo uma máscara tradicional.");
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Região: " + regiao);
        System.out.println("Língua: " + lingua);
    }
}
