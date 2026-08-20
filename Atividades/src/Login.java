import java.util.Scanner;

public class Login {
    public static void executar() {
        Scanner s = new Scanner(System.in);
        int n;
        int senha = 1234;

        IO.println("Digite sua senha: ");
        n = s.nextInt();

        if (n == senha) {
            IO.println("Acesso permitido");
        } else {
            IO.println("Acesso negado");
        }


    }
}