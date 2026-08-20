import java.util.Scanner;

public class Temperatura {
    public static void executar(){
        Scanner s = new Scanner(System.in);

        System.out.println("Qual a temperatura em graus celsius?");
        double temp=s.nextDouble();
        if (temp > 18){
            System.out.println("A temperatura em São José dos Campos está agradável!");
        }
        else{
            System.out.println("Está frio em São José dos Campos!");
        }

    }

}