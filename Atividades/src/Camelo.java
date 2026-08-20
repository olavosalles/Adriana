public class Camelo {
    public static void executar() {

        int camelo=36;

        int irmao1 = 36/2;
        int irmao2 = 36/3;
        int irmao3 = 36/9;

        int totalDistribuido = irmao1+irmao2+irmao3;
        int camelosRestantes =camelo-totalDistribuido;

        System.out.println("TOTAL DE CAMELOS: "+camelo);
        System.out.println("Irmão Mais Velho: " + irmao1 + " camelos");
        System.out.println("Hamed Namir (1/3): "+irmao2 + " camelos");
        System.out.println("Harim (1/9): "+irmao3 + " camelos");
        System.out.println("Lucro de Beremiz: "+(camelosRestantes-1) + " camelo");
        System.out.println("E pro viajante é devolvido seu camelo");



    }
}
