import java.util.Scanner;

public class Multiplo {
    public static void executar() {
        int num1;
        int num2;
        Scanner s = new Scanner(System.in);

        IO.println("Digite um número:");
        num1 = s.nextInt();
        IO.println("Digite outro número:");
        num2 = s.nextInt();

        if (num1 % num2 == 0) {
            System.out.println("O numero " + num1 + " é múltiplo de " + num2);
        } else {
            System.out.println("O numero " + num1 + " não é múltiplo de " + num2);
        }
    }
}
