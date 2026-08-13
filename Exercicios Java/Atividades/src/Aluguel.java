import java.util.Scanner;

public class Aluguel {
    public static void main (String[] args){
        Scanner s = new Scanner(System.in);
        int dias;
        double kmpercorrida, pAluguel;
        double pdiaria=100.00;

        System.out.println("Quantos dias ficou com o carro?");
        dias=s.nextInt();
        System.out.println("Quantos km percorreu?");
        kmpercorrida=s.nextDouble();

        if (kmpercorrida > 100){
            pAluguel=(dias*pdiaria) + ((kmpercorrida-100)*10.00);
            System.out.println("Valor do aluguel: " + String.format("%.2f",pAluguel));
        }
        else{
            pAluguel= (dias*pdiaria);
            System.out.println("Valor do aluguel: " + String.format("%.2f",pAluguel));
        }



    }
}
