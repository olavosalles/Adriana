package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opcao;
        codMetodos cod = new codMetodos();
        Scanner s = new Scanner(System.in);

        while (true) {
            System.out.println("===== MENU =============");
            System.out.println("0. Encerrar Programa");
            System.out.println("1. Múltiplo");
            System.out.println("2. Login");
            System.out.println("3. Sistema de Compras");
            System.out.println("4. Verificar Temperatura");
            System.out.println("5. Os 35 camelos");
            System.out.println("6. Calculadora Viagem");
            System.out.println("7. Aluguel de Carro");
            System.out.println("DIGITE UMA OPÇÃO: ");
            opcao = s.nextInt();

            switch (opcao) {
                case 0:
                    System.out.println("Encerrando programa...\n");
                    return;

                case 1:
                    cod.multiplo();
                    System.out.println();
                    break;

                case 2:
                    cod.login();
                    System.out.println();
                    break;

                case 3:
                    cod.SistemaCompra();
                    System.out.println();
                    break;

                case 4:
                    cod.VerificarTemperatura();
                    System.out.println();
                    break;

                case 5:
                    cod.camelos35();
                    System.out.println();
                    break;

                case 6:
                    cod.calculadoraViagem();
                    System.out.println();
                    break;

                case 7:
                    cod.aluguelCarro();
                    System.out.println();
                    break;

                default:
                    System.out.println("Entrada Inválida! Tente novamente.\n");
                    break;
            }
        }
    }
}
