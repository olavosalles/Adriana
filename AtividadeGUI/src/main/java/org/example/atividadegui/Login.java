package org.example.atividadegui;

import java.util.Scanner;

public class Login {
    public static void executar() {
        Scanner s = new Scanner(System.in);
        int n;
        int senha = 1234;

        System.out.println("Digite sua senha: ");
        n = s.nextInt();

        if (n == senha) {
            System.out.println("Acesso permitido");
        } else {
            System.out.println("Acesso negado");
        }


    }
}