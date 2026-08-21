import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n======================================");
            System.out.println("       MENU DE EXERCÍCIOS JAVA");
            System.out.println("======================================");
            System.out.println("Qual você deseja executar?");
            System.out.println("1 - Verificação de Múltiplo");
            System.out.println("2 - Sistema de Login Simplificado");
            System.out.println("3 - Compra com desconto");
            System.out.println("4 - Temperatura");
            System.out.println("5 - Os trinta e cinco camelos");
            System.out.println("6 - Calculadora de viagem");
            System.out.println("7 - Aluguel de carro");
            System.out.println("0 - Sair");
            System.out.print("Digite uma opção: ");

            opcao = sc.nextInt();

            switch (opcao) {

                case 1:
                    Multiplo.executar();
                    break;
                case 2:
                    Login.executar();
                    break;
                case 3:
                    Desconto.executar();
                    break;
                case 4:
                    Temperatura.executar();
                    break;
                case 5:
                    Camelo.executar();
                    break;
                case 6:
                    Viagem.executar();
                    break;
                case 7:
                    Aluguel.executar();
                    break;
                case 0:
                    System.out.println("Programa encerrado!");
                    break;
                default:
                    System.out.println("Opção Inválida!");
                    break;
            }
            if (opcao != 0) {
                System.out.println("\nPressione ENTER para continuar...");
                sc.nextLine();
                sc.nextLine();
            }

        } while (opcao != 0);

        sc.close();
        }
    }