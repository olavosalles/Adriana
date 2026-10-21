package org.example;

import javafx.collections.FXCollections;
import javafx.scene.control.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class PrimaryController {

    public TextField txtBase;
    public TextField txtMultiplo;
    public Label lblMultiploResultado;

    public TextField txtLoginUsuario;
    public PasswordField txtLoginSenha;
    public Label lblLoginResultado;

    public ComboBox<String> cbProdutos;
    public TextField txtQtdCompra;
    public TextArea txtCarrinho;
    public Label lblTotalCompra;
    private double totalCompras = 0.0;
    private final double[] precos = {6.50, 13.00, 6.50, 4.50, 29.00, 4.50, 5.00, 4.00, 3.50, 2.50};
    private final String[] nomesProdutos = {
            "Arroz (1,5kg) - R$ 6.50",
            "Feijao Preto (2kg) - R$ 13.00",
            "Oleo de Soja (900ml) - R$ 6.50",
            "Acucar Refinado (1kg) - R$ 4.50",
            "Cafe Torrado e moido (500g) - R$ 29.00",
            "Macarrao espaguete (500g) - R$ 4.50",
            "Farinha de Trigo (1kg) - R$ 5.00",
            "Fuba de milho (500g) - R$ 4.00",
            "Molho de tomate (300g) - R$ 3.50",
            "Sal refinado (1kg) - R$ 2.50"
    };

    public TextField txtTemperatura;
    public TextArea txtListaTemperatura;
    public Label lblResumoTemperatura;
    private double somaTemp = 0.0;
    private int quantTemp = 0;

    public TextArea txtCamelosResultado;

    public TextField txtDistanciaViagem;
    public TextField txtPrecoGasolina;
    public Label lblViagemResultado;

    public TextField txtDiasAluguel;
    public TextField txtKmPercorrido;
    public Label lblAluguelResultado;

    public ComboBox<String> cbClasseTema;
    public TextArea txtObjetosInfo;

    public void initialize() {
        cbProdutos.setItems(FXCollections.observableArrayList(nomesProdutos));
        cbProdutos.getSelectionModel().selectFirst();

        cbClasseTema.setItems(FXCollections.observableArrayList(
                "Imagem 1",
                "Imagem 2",
                "Imagem 3",
                "Imagem 4"
        ));
        cbClasseTema.getSelectionModel().selectFirst();
    }

    public void onVerificarMultiplo() {
        try {
            int n1 = Integer.parseInt(txtBase.getText().trim());
            int n2 = Integer.parseInt(txtMultiplo.getText().trim());

            if (n2 == 0) {
                lblMultiploResultado.setText("Nao pode dividir por zero");
                return;
            }

            if (n1 % n2 == 0) {
                lblMultiploResultado.setText(n1 + " e multiplo de " + n2);
            } else {
                lblMultiploResultado.setText(n1 + " nao e multiplo de " + n2);
            }
        } catch (Exception e) {
            lblMultiploResultado.setText("Digite apenas numeros inteiros");
        }
    }

    public void onLimparMultiplo() {
        txtBase.clear();
        txtMultiplo.clear();
        lblMultiploResultado.setText("Resultado...");
    }

    public void onTentarLogin() {
        String senha = txtLoginSenha.getText();
        if ("1234".equals(senha)) {
            lblLoginResultado.setText("Acesso Permitido");
        } else {
            lblLoginResultado.setText("Acesso Negado");
        }
    }

    public void onLimparLogin() {
        txtLoginUsuario.clear();
        txtLoginSenha.clear();
        lblLoginResultado.setText("Resultado...");
    }

    public void onAdicionarAoCarrinho() {
        try {
            int index = cbProdutos.getSelectionModel().getSelectedIndex();
            int qtd = Integer.parseInt(txtQtdCompra.getText().trim());

            if (index >= 0 && qtd > 0) {
                double preco = precos[index];
                double subtotal = preco * qtd;
                totalCompras += subtotal;

                String linha = qtd + "x " + nomesProdutos[index] + " = R$ " + String.format("%.2f", subtotal) + "\n";
                txtCarrinho.appendText(linha);

                double totalFinal = totalCompras;
                if (totalCompras > 100.0) {
                    totalFinal = totalCompras - (totalCompras * 0.10);
                    lblTotalCompra.setText("Subtotal: R$ " + String.format("%.2f", totalCompras)
                            + " | Com desconto de 10%: R$ " + String.format("%.2f", totalFinal));
                } else {
                    lblTotalCompra.setText("Total: R$ " + String.format("%.2f", totalFinal));
                }
            }
        } catch (Exception e) {
            lblTotalCompra.setText("Digite uma quantidade valida");
        }
    }

    public void onLimparCarrinho() {
        totalCompras = 0.0;
        txtCarrinho.clear();
        txtQtdCompra.setText("1");
        lblTotalCompra.setText("Total: R$ 0,00");
    }

    public void onAdicionarTemperatura() {
        try {
            double t = Double.parseDouble(txtTemperatura.getText().trim().replace(",", "."));
            somaTemp += t;
            quantTemp++;

            txtListaTemperatura.appendText("Temperatura " + quantTemp + ": " + t + " C\n");
            txtTemperatura.clear();

            double media = somaTemp / quantTemp;
            if (media < 18.0) {
                lblResumoTemperatura.setText("Media: " + String.format("%.2f", media) + " C (Frio)");
            } else {
                lblResumoTemperatura.setText("Media: " + String.format("%.2f", media) + " C (Agradavel)");
            }
        } catch (Exception e) {
            lblResumoTemperatura.setText("Digite um valor valido");
        }
    }

    public void onLimparTemperaturas() {
        somaTemp = 0.0;
        quantTemp = 0;
        txtListaTemperatura.clear();
        txtTemperatura.clear();
        lblResumoTemperatura.setText("Media...");
    }

    public void onCalcularCamelos() {
        double camelos = 35 + 1;
        double irmao1 = (1.0 / 2) * camelos;
        double irmao2 = (1.0 / 3) * camelos;
        double irmao3 = (1.0 / 9) * camelos;
        double beremiz = camelos - (irmao1 + irmao2 + irmao3);

        String texto = "Total de camelos com o de Beremiz: " + (int) camelos + "\n\n"
                + "1 irmao (metade): " + (int) irmao1 + " camelos\n"
                + "Hamed Narim (terco): " + (int) irmao2 + " camelos\n"
                + "Harim (nono): " + (int) irmao3 + " camelos\n"
                + "Sobra para Beremiz: " + (int) beremiz + " camelos\n";

        txtCamelosResultado.setText(texto);
    }

    public void onCalcularViagem() {
        try {
            double km = Double.parseDouble(txtDistanciaViagem.getText().trim().replace(",", "."));
            double preco = Double.parseDouble(txtPrecoGasolina.getText().trim().replace(",", "."));
            double kml = 12.0;

            double litros = km / kml;
            double total = litros * preco;

            if (km > 500.0) {
                total = total - (total * 0.05);
                lblViagemResultado.setText("Desconto aplicado! Total: R$ " + String.format("%.2f", total));
            } else {
                lblViagemResultado.setText("Total: R$ " + String.format("%.2f", total));
            }
        } catch (Exception e) {
            lblViagemResultado.setText("Valores invalidos");
        }
    }

    public void onLimparViagem() {
        txtDistanciaViagem.clear();
        txtPrecoGasolina.clear();
        lblViagemResultado.setText("Resultado...");
    }

    public void onCalcularAluguel() {
        try {
            int dias = Integer.parseInt(txtDiasAluguel.getText().trim());
            double km = Double.parseDouble(txtKmPercorrido.getText().trim().replace(",", "."));

            double diaria = 300.0;
            double limite = 50.0;
            double adicional = 20.0;

            double total = diaria * dias;

            if (km > limite) {
                double kmExtra = km - limite;
                total += kmExtra * adicional;
            }

            lblAluguelResultado.setText("Total do aluguel: R$ " + String.format("%.2f", total));
        } catch (Exception e) {
            lblAluguelResultado.setText("Valores invalidos");
        }
    }

    public void onLimparAluguel() {
        txtDiasAluguel.clear();
        txtKmPercorrido.clear();
        lblAluguelResultado.setText("Resultado...");
    }

    public void onSimularObjetos() {
        int index = cbClasseTema.getSelectionModel().getSelectedIndex();

        PrintStream originalOut = System.out;
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try {
            PrintStream captura = new PrintStream(baos, true, StandardCharsets.UTF_8);
            System.setOut(captura);

            switch (index) {
                case 0:
                    Camisa camisa = new Camisa("Azul", "M", 89.90);
                    camisa.exibirInformacoes();
                    camisa.vestir();
                    camisa.lavar();

                    System.out.println();
                    Calca calca = new Calca("Preta", "42", 149.90);
                    calca.exibirInformacoes();
                    calca.vestir();
                    calca.lavar();

                    System.out.println();
                    Terno terno = new Terno("Cinza", "G", 499.00);
                    terno.exibirInformacoes();
                    terno.vestir();
                    terno.abotoar();
                    break;

                case 1:
                    Pessoa pessoa = new Pessoa("Masculino", "Castanho", 25);
                    pessoa.falar();
                    pessoa.pedalar();
                    pessoa.gritar();

                    System.out.println();
                    Bicicleta bike = new Bicicleta("Vermelha", "Caloi", 1850.00);
                    bike.pedalar();
                    bike.acelerar();
                    bike.frear();

                    System.out.println();
                    Arvore arvore = new Arvore("Ipe", "Verde", 8.5);
                    arvore.infArvore();
                    arvore.crescer();
                    arvore.produzirFrutos();
                    break;

                case 2:
                    Mascara mascara = new Mascara("Dourada", "Grande", "Oval");
                    mascara.colocar();
                    mascara.limpar();
                    mascara.retirar();

                    System.out.println();
                    Tribo tribo = new Tribo("Yanomami", "Amazonia", "Yanomami");
                    tribo.exibirInformacoes();
                    tribo.realizarDanca();
                    tribo.produzirMascara();

                    System.out.println();
                    Artista artista = new Artista("Katu", "Brasileiro", 38);
                    artista.exibirInformacoes();
                    artista.esculpirMascara();
                    artista.pintarMascara();
                    break;

                case 3:
                    Manga manga = new Manga("One Piece", "Aventura", 1090);
                    manga.exibirInformacoes();
                    manga.adicionarCapitulo();
                    manga.publicar();

                    System.out.println();
                    Personagem personagem = new Personagem("Luffy", 19, "Pirata");
                    personagem.exibirInformacoes();
                    personagem.atacar();
                    personagem.falar();

                    System.out.println();
                    Desenhista desenhista = new Desenhista("Oda", "Mangaka", 27);
                    desenhista.exibirExperiencia();
                    desenhista.desenhar();
                    desenhista.criarPersonagem();
                    break;
            }
        } finally {
            System.setOut(originalOut);
        }

        txtObjetosInfo.setText(baos.toString(StandardCharsets.UTF_8));
    }
}
