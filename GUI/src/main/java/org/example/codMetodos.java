package org.example;

import java.util.Scanner;

public class codMetodos {

    static Scanner s = new Scanner(System.in);

    public static void multiplo() {
        int n1, n2;

        System.out.println("Digite o número base: ");
        n1 = s.nextInt();
        System.out.println("Digite o múltiplo: ");
        n2 = s.nextInt();

        if (n1 % n2 == 0) {
            System.out.println(n1 + " é múltiplo de " + n2);
        } else {
            System.out.println(n1 + " não é múltiplo de " + n2);
        }
    }

    public static void login() {
        String senha = "1234";
        String tentativa;

        while (true) {
            System.out.println("Digite a senha: ");
            tentativa = s.nextLine();

            if (tentativa.equals(senha)) {
                System.out.println("Acesso Permitido");
                break;
            } else {
                System.out.println("Acesso Negado. Tente novamente");
            }
        }
    }

    public static void SistemaCompra() {
        double compra = 0;
        double desconto = 0.1;
        double[] precos = {6.50, 13.00, 6.50, 4.50, 29.00, 4.50, 5.00, 4.00, 3.50, 2.50};
        String[] produtos = {
            "Arroz (1,5kg)", "Feijão Preto (2kg)", "Óleo de Soja (900ml)", "Açúcar Refinado (1kg)",
            "Café Torrado e moído (500g)", "Macarrão espaguete (500g)", "Farinha de Trigo (1kg)",
            "Fubá de milho (500g)", "Molho de tomate (300g)", "Sal refinado (1kg)"
        };
        int opcao, quant;

        while (true) {
            System.out.println("====== MENU DE COMPRAS =======");
            System.out.println("0. Encerrar Compra");
            for (int i = 0; i < produtos.length; i++) {
                System.out.printf("%d. %s - R$ %.2f%n", (i + 1), produtos[i], precos[i]);
            }
            System.out.println("\nDigite uma opção: ");

            opcao = s.nextInt();

            if (opcao == 0) {
                System.out.println("Compra Encerrada!\n");
                System.out.println("========= TOTAL ==============");
                System.out.printf("Valor total da compra: R$ %.2f%n", compra);
                if (compra > 100) {
                    compra -= (compra * desconto);
                }
                System.out.printf("Valor total com desconto: R$ %.2f%n", compra);
                return;
            } else if (opcao >= 1 && opcao <= 10) {
                int indice = opcao - 1;
                System.out.printf("Preço base: R$ %.2f%n", precos[indice]);
                System.out.println("Digite a quantidade do seu pedido: ");
                quant = s.nextInt();
                compra += precos[indice] * quant;
                System.out.println("Item inserido com sucesso!");
                System.out.printf("Compra parcial: R$ %.2f%n%n", compra);
            } else {
                System.out.println("Opção Inválida!\n");
            }
        }
    }

    public static void VerificarTemperatura() {
        double base = 18.00;
        double media = 0;
        int quant = 0;
        String entrada;

        while (true) {
            System.out.println("Digite a temperatura aferida ou 'concluir': ");
            entrada = s.nextLine();

            if (entrada.equalsIgnoreCase("concluir")) {
                if (quant > 0) {
                    media = media / quant;
                    System.out.printf("Temperatura Média: %.2f%n", media);
                    if (media < base) {
                        System.out.println("Frio.\n");
                    } else {
                        System.out.println("Temperatura Agradável.\n");
                    }
                }
                break;
            } else {
                try {
                    double temp = Double.parseDouble(entrada);
                    quant++;
                    media += temp;
                } catch (NumberFormatException e) {
                    System.out.println("Valor inválido.");
                }
            }
        }
    }

    public static void camelos35() {
        double camelos = 35;
        double irmao1 = 1.0 / 2;
        double irmao2 = 1.0 / 3;
        double irmao3 = 1.0 / 9;

        camelos = camelos + 1;

        irmao1 = irmao1 * camelos;
        irmao2 = irmao2 * camelos;
        irmao3 = irmao3 * camelos;

        double beremiz = camelos - (irmao1 + irmao2 + irmao3);

        System.out.println("==== DISTRIBUIÇÃO: =======");
        System.out.printf("1° irmão: %.0f camelos%n", irmao1);
        System.out.printf("Hamed Narim: %.0f camelos%n", irmao2);
        System.out.printf("Harim: %.0f camelos%n", irmao3);
        System.out.printf("Beremiz: %.0f camelos%n", beremiz);
        System.out.println("==========================");
    }

    public static void calculadoraViagem() {
        double desconto = 0.05;
        double kml = 12.00;

        System.out.println("Digite a distância da viagem (em km): ");
        double km = s.nextDouble();
        System.out.println("Digite o preço da gasolina na sua região: ");
        double precoGasolina = s.nextDouble();

        double total = (km / kml) * precoGasolina;

        if (km > 500.00) {
            total -= (total * desconto);
            System.out.println("Desconto aplicado!");
        }

        System.out.printf("O resultado total é de: R$ %.2f%n", total);
    }

    public static void aluguelCarro() {
        double diaria = 300;
        double limite = 50;
        double adicionalPorKm = 20;

        System.out.println("Digite quantos dias alugou o carro: ");
        int dias = s.nextInt();
        System.out.println("Digite quantos km foram percorridos: ");
        double km = s.nextDouble();

        double valorAdicional = 0;
        if (km > limite) {
            valorAdicional = adicionalPorKm * (km - limite);
        }

        double total = (diaria * dias) + valorAdicional;

        System.out.println("==== RESUMO ===================");
        System.out.println("Dias alugados: " + dias);
        System.out.println("Km percorridos: " + km);
        System.out.printf("Diária: R$ %.2f%n", diaria);
        System.out.printf("Adicional: R$ %.2f%n", valorAdicional);
        System.out.printf("Total do aluguel: R$ %.2f%n", total);
        System.out.println("===============================");
    }
}
