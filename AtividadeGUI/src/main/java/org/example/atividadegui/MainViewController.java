package org.example.atividadegui;

import javafx.fxml.FXML;
import javafx.scene.control.*;

public class MainViewController {


    // MÚLTIPLO
    @FXML private TextField txtMultiploN1;
    @FXML private TextField txtMultiploN2;
    @FXML private Label lblResultadoMultiplo;

    @FXML
    protected void onCalcularMultiplo() {
        try {
            int n1 = Integer.parseInt(txtMultiploN1.getText().trim());
            int n2 = Integer.parseInt(txtMultiploN2.getText().trim());

            if (n2 == 0) {
                lblResultadoMultiplo.setText("Divisão por zero não é permitida!");
                lblResultadoMultiplo.setStyle("-fx-text-fill: red;");
            } else if (n1 % n2 == 0) {
                lblResultadoMultiplo.setText("O número " + n1 + " é múltiplo de " + n2);
                lblResultadoMultiplo.setStyle("-fx-text-fill: green;");
            } else {
                lblResultadoMultiplo.setText("O número " + n1 + " NÃO é múltiplo de " + n2);
                lblResultadoMultiplo.setStyle("-fx-text-fill: orange;");
            }
        } catch (Exception e) {
            lblResultadoMultiplo.setText("Digite números inteiros válidos!");
            lblResultadoMultiplo.setStyle("-fx-text-fill: red;");
        }
    }


    // LOGIN
    @FXML private TextField txtSenhaLogin;
    @FXML private Label lblResultadoLogin;

    @FXML
    protected void onEntrarLogin() {
        try {
            int senha = Integer.parseInt(txtSenhaLogin.getText().trim());
            if (senha == 1234) {
                lblResultadoLogin.setText("✔ Acesso Permitido!");
                lblResultadoLogin.setStyle("-fx-text-fill: green;");
            } else {
                lblResultadoLogin.setText("✖ Acesso Negado!");
                lblResultadoLogin.setStyle("-fx-text-fill: red;");
            }
        } catch (Exception e) {
            lblResultadoLogin.setText("Digite apenas números!");
            lblResultadoLogin.setStyle("-fx-text-fill: red;");
        }
    }


    // COMPRA COM DESCONTO
    @FXML private TextArea txtAreaDesconto;

    @FXML
    protected void onCalcularDesconto() {
        double total = (24.90 * 2) + (8.50 * 3) + 6.80 + 5.20 + 18.00 + (4.50 * 2) + 6.00 + 3.50 + (3.00 * 2) + 2.50;

        StringBuilder sb = new StringBuilder();
        sb.append("=== LISTAGEM DO CAIXA ===\n");
        sb.append("Arroz (2 un): R$ 49.80\n");
        sb.append("Feijão (3 un): R$ 25.50\n");
        sb.append("Óleo de soja (1 un): R$ 6.80\n");
        sb.append("Açúcar (1 un): R$ 5.20\n");
        sb.append("Café (1 un): R$ 18.00\n");
        sb.append("Macarrão (2 un): R$ 9.00\n");
        sb.append("Farinha (1 un): R$ 6.00\n");
        sb.append("Fubá (1 un): R$ 3.50\n");
        sb.append("Molho de tomate (2 un): R$ 6.00\n");
        sb.append("Sal (1 un): R$ 2.50\n");
        sb.append("-------------------------------------------\n");
        sb.append(String.format("Total sem desconto: R$ %.2f\n", total));

        double valorFinal = total;
        if (total > 100.00) {
            double desconto = total * 0.10;
            valorFinal -= desconto;
            sb.append(String.format("Desconto (10%%): -R$ %.2f\n", desconto));
        } else {
            sb.append("Sem desconto (abaixo de R$ 100,00)\n");
        }
        sb.append("-------------------------------------------\n");
        sb.append(String.format("VALOR FINAL A SER PAGO: R$ %.2f", valorFinal));

        txtAreaDesconto.setText(sb.toString());
    }


    // TEMPERATURA
    @FXML private TextField txtTemperatura;
    @FXML private Label lblResultadoTemperatura;

    @FXML
    protected void onVerificarTemperatura() {
        try {
            double temp = Double.parseDouble(txtTemperatura.getText().trim().replace(",", "."));
            if (temp > 18) {
                lblResultadoTemperatura.setText("A temperatura em São José dos Campos está agradável!");
                lblResultadoTemperatura.setStyle("-fx-text-fill: green;");
            } else {
                lblResultadoTemperatura.setText("Está frio em São José dos Campos!");
                lblResultadoTemperatura.setStyle("-fx-text-fill: blue;");
            }
        } catch (Exception e) {
            lblResultadoTemperatura.setText("Digite uma temperatura válida!");
            lblResultadoTemperatura.setStyle("-fx-text-fill: red;");
        }
    }


    //  CAMELOS
    @FXML private TextArea txtAreaCamelos;

    @FXML
    protected void onCalcularCamelos() {
        int camelo = 36; // 35 da herança + 1 emprestado
        int irmao1 = camelo / 2;
        int irmao2 = camelo / 3;
        int irmao3 = camelo / 9;
        int total = irmao1 + irmao2 + irmao3;
        int sobra = camelo - total;

        String relatorio = "=== O ENIGMA DOS 35 CAMELOS ===\n\n" +
                "Total com o camelo emprestado: 36 camelos\n" +
                "• Irmão Mais Velho (recebe a metade): " + irmao1 + " camelos\n" +
                "• Hamed Namir (recebe um terço): " + irmao2 + " camelos\n" +
                "• Harim (recebe um nono): " + irmao3 + " camelos\n\n" +
                "Total distribuído entre os irmãos: " + total + " camelos\n" +
                "Lucro de Beremiz: " + (sobra - 1) + " camelo\n" +
                "E ao viajante é devolvido seu 1 camelo!";

        txtAreaCamelos.setText(relatorio);
    }


    //  CALCULADORA DE VIAGEM
    @FXML private TextField txtViagemDistancia;
    @FXML private TextField txtViagemPreco;
    @FXML private Label lblResultadoViagem;

    @FXML
    protected void onCalcularViagem() {
        try {
            double dist = Double.parseDouble(txtViagemDistancia.getText().trim().replace(",", "."));
            double preco = Double.parseDouble(txtViagemPreco.getText().trim().replace(",", "."));
            double gasto = (dist / 12.0) * preco;

            if (dist > 500) {
                gasto -= (gasto * 0.05); // 5% de desconto
                lblResultadoViagem.setText(String.format("Custo (com 5%% de desconto): R$ %.2f", gasto));
            } else {
                lblResultadoViagem.setText(String.format("Custo da viagem: R$ %.2f", gasto));
            }
            lblResultadoViagem.setStyle("-fx-text-fill: green;");
        } catch (Exception e) {
            lblResultadoViagem.setText("Informe valores numéricos válidos!");
            lblResultadoViagem.setStyle("-fx-text-fill: red;");
        }
    }


    // ALUGUEL DE CARRO
    @FXML private TextField txtAluguelDias;
    @FXML private TextField txtAluguelKm;
    @FXML private Label lblResultadoAluguel;

    @FXML
    protected void onCalcularAluguel() {
        try {
            int dias = Integer.parseInt(txtAluguelDias.getText().trim());
            double km = Double.parseDouble(txtAluguelKm.getText().trim().replace(",", "."));
            double diaria = 100.00;
            double total;

            if (km > 100) {
                total = (dias * diaria) + ((km - 100) * 10.00);
            } else {
                total = dias * diaria;
            }

            lblResultadoAluguel.setText(String.format("Valor total do aluguel: R$ %.2f", total));
            lblResultadoAluguel.setStyle("-fx-text-fill: green;");
        } catch (Exception e) {
            lblResultadoAluguel.setText("Informe valores válidos!");
            lblResultadoAluguel.setStyle("-fx-text-fill: red;");
        }
    }
}
