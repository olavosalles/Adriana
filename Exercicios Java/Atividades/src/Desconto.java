import java.util.Scanner;

public class Desconto {
    void main () {
        Scanner s = new Scanner(System.in);

        double precoArroz = 24.90;
        double precoFeijao = 8.50;
        double precoOleo = 6.80;
        double precoAcucar = 5.20;
        double precoCafe = 18.00;
        double precoMacarrao = 4.50;
        double precoFarinha = 6.00;
        double precoFuba = 3.50;
        double precoMolho = 3.00;
        double precoSal = 2.50;

        int qtdArroz = 2;
        int qtdFeijao = 3;
        int qtdOleo = 1;
        int qtdAcucar = 1;
        int qtdCafe = 1;
        int qtdMacarrao = 2;
        int qtdFarinha = 1;
        int qtdFuba = 1;
        int qtdMolho = 2;
        int qtdSal = 1;

        double parcialArroz = precoArroz * qtdArroz;
        double parcialFeijao = precoFeijao * qtdFeijao;
        double parcialOleo = precoOleo * qtdOleo;
        double parcialAcucar = precoAcucar * qtdAcucar;
        double parcialCafe = precoCafe * qtdCafe;
        double parcialMacarrao = precoMacarrao * qtdMacarrao;
        double parcialFarinha = precoFarinha * qtdFarinha;
        double parcialFuba = precoFuba * qtdFuba;
        double parcialMolho = precoMolho * qtdMolho;
        double parcialSal = precoSal * qtdSal;

        double valorTotal = parcialArroz + parcialFeijao + parcialOleo +
                parcialAcucar + parcialCafe + parcialMacarrao +
                parcialFarinha + parcialFuba + parcialMolho + parcialSal;

        System.out.println("=== LISTAGEM DO CAIXA ===");
        System.out.println("Arroz: " + qtdArroz + " un - R$ " + parcialArroz);
        System.out.println("Feijão: " + qtdFeijao + " un - R$ " + parcialFeijao);
        System.out.println("Óleo de soja: " + qtdOleo + " un - R$ " + parcialOleo);
        System.out.println("Açúcar: " + qtdAcucar + " un - R$ " + parcialAcucar);
        System.out.println("Café: " + qtdCafe + " un - R$ " + parcialCafe);
        System.out.println("Macarrão: " + qtdMacarrao + " un - R$ " + parcialMacarrao);
        System.out.println("Farinha: " + qtdFarinha + " un - R$ " + parcialFarinha);
        System.out.println("Fubá: " + qtdFuba + " un - R$ " + parcialFuba);
        System.out.println("Molho de tomate: " + qtdMolho + " un - R$ " + parcialMolho);
        System.out.println("Sal: " + qtdSal + " un - R$ " + parcialSal);
        System.out.println("-----------------------------------");
        System.out.println("Valor total sem desconto: R$ " + String.format("%.2f",valorTotal));

        double valorFinal = valorTotal;

        if (valorTotal > 100.00) {
            double desconto = valorTotal * 0.10;
            valorFinal = valorTotal - desconto;
            System.out.println("Desconto de 10% aplicado!");
        } else {
            System.out.println("Compra abaixo de R$ 100,00. Sem desconto.");
        }


        System.out.println("VALOR FINAL A SER PAGO: R$ " + String.format("%.2f", valorFinal));


    }
}
