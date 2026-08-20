import java.util.Scanner;

public class Viagem {
    public static void executar() {
        Scanner s = new Scanner(System.in);

        double distancia, precoComb, valorGasto;

        System.out.println("Qual a distância da viagem (em Km)?");
        distancia = s.nextDouble();
        System.out.println("Qual o preço do combústivel?");
        precoComb = s.nextDouble();

        valorGasto = (distancia / 12) * (precoComb);

        if (distancia > 500) {
            valorGasto = valorGasto - (valorGasto * 0.05);
            System.out.println("Custo da viagem: " + String.format("%.2f", valorGasto));
        } else {
            System.out.println("Custo da viagem: " + String.format("%.2f", valorGasto));
        }


    }
}
