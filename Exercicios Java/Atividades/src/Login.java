import java.util.Scanner;

public class Login {
    void main() {
        Scanner s = new Scanner(System.in);
        int n;
        int senha = 1234;

        n = s.nextInt();

        if (n == senha) {
            IO.println("Acesso permitido");
        } else {
            IO.println("Acesso negado");
        }


    }
}