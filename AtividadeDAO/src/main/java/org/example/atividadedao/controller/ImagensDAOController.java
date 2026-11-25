package org.example.atividadedao.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import org.example.atividadedao.dao.ConexaoDAO;
import org.example.atividadedao.model.*;

import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class ImagensDAOController implements Initializable {

    private final ConexaoDAO dao = new ConexaoDAO();

    // ================= IMAGEM 1 (Vestuário) =================
    @FXML private TextField txtCamisaCor;
    @FXML private TextField txtCamisaTamanho;
    @FXML private TextField txtCamisaPreco;

    @FXML private TextField txtCalcaCor;
    @FXML private TextField txtCalcaTamanho;
    @FXML private TextField txtCalcaPreco;

    @FXML private TextField txtTernoCor;
    @FXML private TextField txtTernoTamanho;
    @FXML private TextField txtTernoPreco;

    @FXML private ListView<String> listImagem1;
    @FXML private Label lblStatusImagem1;

    // ================= IMAGEM 2 (Parque / Natureza) =================
    @FXML private TextField txtPessoaSexo;
    @FXML private TextField txtPessoaCabelo;
    @FXML private TextField txtPessoaIdade;

    @FXML private TextField txtBikeCor;
    @FXML private TextField txtBikeMarca;
    @FXML private TextField txtBikePreco;

    @FXML private TextField txtArvoreEspecie;
    @FXML private TextField txtArvoreFolha;
    @FXML private TextField txtArvoreTamanho;

    @FXML private ListView<String> listImagem2;
    @FXML private Label lblStatusImagem2;

    // ================= IMAGEM 3 (Cultura / Tribo / Máscara) =================
    @FXML private TextField txtMascaraCor;
    @FXML private TextField txtMascaraTamanho;
    @FXML private TextField txtMascaraFormato;

    @FXML private TextField txtTriboNome;
    @FXML private TextField txtTriboRegiao;
    @FXML private TextField txtTriboLingua;

    @FXML private TextField txtArtistaNome;
    @FXML private TextField txtArtistaNacionalidade;
    @FXML private TextField txtArtistaIdade;

    @FXML private ListView<String> listImagem3;
    @FXML private Label lblStatusImagem3;

    // ================= IMAGEM 4 (Mangá / Arte) =================
    @FXML private TextField txtMangaTitulo;
    @FXML private TextField txtMangaGenero;
    @FXML private TextField txtMangaCaps;

    @FXML private TextField txtPersonagemNome;
    @FXML private TextField txtPersonagemIdade;
    @FXML private TextField txtPersonagemTipo;

    @FXML private TextField txtDesenhistaNome;
    @FXML private TextField txtDesenhistaEsp;
    @FXML private TextField txtDesenhistaExp;

    @FXML private ListView<String> listImagem4;
    @FXML private Label lblStatusImagem4;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        atualizarImagem1();
        atualizarImagem2();
        atualizarImagem3();
        atualizarImagem4();

        // Configura ouvintes para preencher os campos automaticamente ao clicar na lista
        configurarSelecaoListas();
    }

    private void configurarSelecaoListas() {
        listImagem1.getSelectionModel().selectedItemProperty().addListener((obs, oldVal, newVal) -> {
            if (newVal != null) preencherCamposImagem1(newVal);
        });

        listImagem2.getSelectionModel().selectedItemProperty().addListener((obs, oldVal, newVal) -> {
            if (newVal != null) preencherCamposImagem2(newVal);
        });

        listImagem3.getSelectionModel().selectedItemProperty().addListener((obs, oldVal, newVal) -> {
            if (newVal != null) preencherCamposImagem3(newVal);
        });

        listImagem4.getSelectionModel().selectedItemProperty().addListener((obs, oldVal, newVal) -> {
            if (newVal != null) preencherCamposImagem4(newVal);
        });
    }

    // Preenche campos da Imagem 1 a partir da string selecionada
    private void preencherCamposImagem1(String item) {
        // Exemplo: Camisa [ID: 1, Cor: Azul, Tamanho: M, Preço: R$ 89.90]
        if (item.startsWith("Camisa")) {
            txtCamisaCor.setText(extrairValor(item, "Cor: "));
            txtCamisaTamanho.setText(extrairValor(item, "Tamanho: "));
            txtCamisaPreco.setText(extrairValor(item, "Preço: R$ ").replace(",", "."));
            lblStatusImagem1.setText("Camisa ID " + extrairId(item) + " carregada nos campos para edição.");
        } else if (item.startsWith("Calça")) {
            txtCalcaCor.setText(extrairValor(item, "Cor: "));
            txtCalcaTamanho.setText(extrairValor(item, "Tamanho: "));
            txtCalcaPreco.setText(extrairValor(item, "Preço: R$ ").replace(",", "."));
            lblStatusImagem1.setText("Calça ID " + extrairId(item) + " carregada nos campos para edição.");
        } else if (item.startsWith("Terno")) {
            txtTernoCor.setText(extrairValor(item, "Cor: "));
            txtTernoTamanho.setText(extrairValor(item, "Tamanho: "));
            txtTernoPreco.setText(extrairValor(item, "Preço: R$ ").replace(",", "."));
            lblStatusImagem1.setText("Terno ID " + extrairId(item) + " carregado nos campos para edição.");
        }
    }

    private void preencherCamposImagem2(String item) {
        if (item.startsWith("Pessoa")) {
            txtPessoaSexo.setText(extrairValor(item, "Sexo: "));
            txtPessoaCabelo.setText(extrairValor(item, "Cabelo: "));
            txtPessoaIdade.setText(extrairValor(item, "Idade: ").replace(" anos", ""));
            lblStatusImagem2.setText("Pessoa ID " + extrairId(item) + " carregada nos campos para edição.");
        } else if (item.startsWith("Bicicleta")) {
            txtBikeMarca.setText(extrairValor(item, "Marca: "));
            txtBikeCor.setText(extrairValor(item, "Cor: "));
            txtBikePreco.setText(extrairValor(item, "Preço: R$ ").replace(",", "."));
            lblStatusImagem2.setText("Bicicleta ID " + extrairId(item) + " carregada nos campos para edição.");
        } else if (item.startsWith("Árvore")) {
            txtArvoreEspecie.setText(extrairValor(item, "Espécie: "));
            txtArvoreFolha.setText(extrairValor(item, "Folhas: "));
            txtArvoreTamanho.setText(extrairValor(item, "Altura: ").replace(" m", "").replace(",", "."));
            lblStatusImagem2.setText("Árvore ID " + extrairId(item) + " carregada nos campos para edição.");
        }
    }

    private void preencherCamposImagem3(String item) {
        if (item.startsWith("Máscara")) {
            txtMascaraCor.setText(extrairValor(item, "Cor: "));
            txtMascaraTamanho.setText(extrairValor(item, "Tamanho: "));
            txtMascaraFormato.setText(extrairValor(item, "Formato: "));
            lblStatusImagem3.setText("Máscara ID " + extrairId(item) + " carregada nos campos para edição.");
        } else if (item.startsWith("Tribo")) {
            txtTriboNome.setText(extrairValor(item, "Nome: "));
            txtTriboRegiao.setText(extrairValor(item, "Região: "));
            txtTriboLingua.setText(extrairValor(item, "Língua: "));
            lblStatusImagem3.setText("Tribo ID " + extrairId(item) + " carregada nos campos para edição.");
        } else if (item.startsWith("Artista")) {
            txtArtistaNome.setText(extrairValor(item, "Nome: "));
            txtArtistaNacionalidade.setText(extrairValor(item, "Nacionalidade: "));
            txtArtistaIdade.setText(extrairValor(item, "Idade: ").replace(" anos", ""));
            lblStatusImagem3.setText("Artista ID " + extrairId(item) + " carregado nos campos para edição.");
        }
    }

    private void preencherCamposImagem4(String item) {
        if (item.startsWith("Mangá")) {
            txtMangaTitulo.setText(extrairValor(item, "Título: "));
            txtMangaGenero.setText(extrairValor(item, "Gênero: "));
            txtMangaCaps.setText(extrairValor(item, "Capítulos: "));
            lblStatusImagem4.setText("Mangá ID " + extrairId(item) + " carregado nos campos para edição.");
        } else if (item.startsWith("Personagem")) {
            txtPersonagemNome.setText(extrairValor(item, "Nome: "));
            txtPersonagemIdade.setText(extrairValor(item, "Idade: ").replace(" anos", ""));
            txtPersonagemTipo.setText(extrairValor(item, "Tipo: "));
            lblStatusImagem4.setText("Personagem ID " + extrairId(item) + " carregado nos campos para edição.");
        } else if (item.startsWith("Desenhista")) {
            txtDesenhistaNome.setText(extrairValor(item, "Nome: "));
            txtDesenhistaEsp.setText(extrairValor(item, "Especialidade: "));
            txtDesenhistaExp.setText(extrairValor(item, "Experiência: ").replace(" anos", ""));
            lblStatusImagem4.setText("Desenhista ID " + extrairId(item) + " carregado nos campos para edição.");
        }
    }

    private String extrairValor(String texto, String chave) {
        int idx = texto.indexOf(chave);
        if (idx == -1) return "";
        int inicio = idx + chave.length();
        int fim = texto.indexOf(",", inicio);
        if (fim == -1) fim = texto.indexOf("]", inicio);
        if (fim == -1) return texto.substring(inicio).trim();
        return texto.substring(inicio, fim).trim();
    }

    // ---------------- AÇÕES IMAGEM 1 ----------------
    @FXML
    public void onSalvarCamisa() {
        try {
            String cor = txtCamisaCor.getText().trim();
            String tam = txtCamisaTamanho.getText().trim();
            double preco = Double.parseDouble(txtCamisaPreco.getText().trim().replace(",", "."));
            Camisa c = new Camisa(cor, tam, preco);
            dao.inserirCamisa(c);
            lblStatusImagem1.setText(c.vestir() + " " + c.lavar() + " Cadastrada no BD!");
            atualizarImagem1();
        } catch (Exception e) {
            lblStatusImagem1.setText("Erro ao salvar Camisa: " + e.getMessage());
        }
    }

    @FXML
    public void onAtualizarCamisa() {
        String item = listImagem1.getSelectionModel().getSelectedItem();
        if (item == null || !item.startsWith("Camisa")) {
            lblStatusImagem1.setText("Selecione uma Camisa na lista para atualizar!");
            return;
        }
        try {
            int id = extrairId(item);
            String cor = txtCamisaCor.getText().trim();
            String tam = txtCamisaTamanho.getText().trim();
            double preco = Double.parseDouble(txtCamisaPreco.getText().trim().replace(",", "."));
            Camisa c = new Camisa(id, cor, tam, preco);
            dao.atualizarCamisa(c);
            lblStatusImagem1.setText("Camisa ID " + id + " atualizada com sucesso!");
            atualizarImagem1();
        } catch (Exception e) {
            lblStatusImagem1.setText("Erro ao atualizar Camisa: " + e.getMessage());
        }
    }

    @FXML
    public void onSalvarCalca() {
        try {
            String cor = txtCalcaCor.getText().trim();
            String tam = txtCalcaTamanho.getText().trim();
            double preco = Double.parseDouble(txtCalcaPreco.getText().trim().replace(",", "."));
            Calca c = new Calca(cor, tam, preco);
            dao.inserirCalca(c);
            lblStatusImagem1.setText(c.vestir() + " " + c.lavar() + " Cadastrada no BD!");
            atualizarImagem1();
        } catch (Exception e) {
            lblStatusImagem1.setText("Erro ao salvar Calça: " + e.getMessage());
        }
    }

    @FXML
    public void onAtualizarCalca() {
        String item = listImagem1.getSelectionModel().getSelectedItem();
        if (item == null || !item.startsWith("Calça")) {
            lblStatusImagem1.setText("Selecione uma Calça na lista para atualizar!");
            return;
        }
        try {
            int id = extrairId(item);
            String cor = txtCalcaCor.getText().trim();
            String tam = txtCalcaTamanho.getText().trim();
            double preco = Double.parseDouble(txtCalcaPreco.getText().trim().replace(",", "."));
            Calca c = new Calca(id, cor, tam, preco);
            dao.atualizarCalca(c);
            lblStatusImagem1.setText("Calça ID " + id + " atualizada com sucesso!");
            atualizarImagem1();
        } catch (Exception e) {
            lblStatusImagem1.setText("Erro ao atualizar Calça: " + e.getMessage());
        }
    }

    @FXML
    public void onSalvarTerno() {
        try {
            String cor = txtTernoCor.getText().trim();
            String tam = txtTernoTamanho.getText().trim();
            double preco = Double.parseDouble(txtTernoPreco.getText().trim().replace(",", "."));
            Terno t = new Terno(cor, tam, preco);
            dao.inserirTerno(t);
            lblStatusImagem1.setText(t.vestir() + " " + t.abotoar() + " Cadastrado no BD!");
            atualizarImagem1();
        } catch (Exception e) {
            lblStatusImagem1.setText("Erro ao salvar Terno: " + e.getMessage());
        }
    }

    @FXML
    public void onAtualizarTerno() {
        String item = listImagem1.getSelectionModel().getSelectedItem();
        if (item == null || !item.startsWith("Terno")) {
            lblStatusImagem1.setText("Selecione um Terno na lista para atualizar!");
            return;
        }
        try {
            int id = extrairId(item);
            String cor = txtTernoCor.getText().trim();
            String tam = txtTernoTamanho.getText().trim();
            double preco = Double.parseDouble(txtTernoPreco.getText().trim().replace(",", "."));
            Terno t = new Terno(id, cor, tam, preco);
            dao.atualizarTerno(t);
            lblStatusImagem1.setText("Terno ID " + id + " atualizado com sucesso!");
            atualizarImagem1();
        } catch (Exception e) {
            lblStatusImagem1.setText("Erro ao atualizar Terno: " + e.getMessage());
        }
    }

    @FXML
    public void onDeletarSelecionadoImagem1() {
        String item = listImagem1.getSelectionModel().getSelectedItem();
        if (item == null) return;
        try {
            int id = extrairId(item);
            if (item.startsWith("Camisa")) dao.deletarCamisa(id);
            else if (item.startsWith("Calça")) dao.deletarCalca(id);
            else if (item.startsWith("Terno")) dao.deletarTerno(id);
            lblStatusImagem1.setText("Item ID " + id + " excluído do BD!");
            atualizarImagem1();
        } catch (Exception e) {
            lblStatusImagem1.setText("Erro ao deletar: " + e.getMessage());
        }
    }

    private void atualizarImagem1() {
        try {
            ObservableList<String> itens = FXCollections.observableArrayList();
            for (Camisa c : dao.listarCamisas()) itens.add(c.exibirInformacoes());
            for (Calca c : dao.listarCalcas()) itens.add(c.exibirInformacoes());
            for (Terno t : dao.listarTernos()) itens.add(t.exibirInformacoes());
            listImagem1.setItems(itens);
        } catch (SQLException e) {
            lblStatusImagem1.setText("Erro ao carregar dados: " + e.getMessage());
        }
    }

    // ---------------- AÇÕES IMAGEM 2 ----------------
    @FXML
    public void onSalvarPessoa() {
        try {
            String sexo = txtPessoaSexo.getText().trim();
            String cabelo = txtPessoaCabelo.getText().trim();
            int idade = Integer.parseInt(txtPessoaIdade.getText().trim());
            Pessoa p = new Pessoa(sexo, cabelo, idade);
            dao.inserirPessoa(p);
            lblStatusImagem2.setText(p.falar() + " " + p.pedalar() + " Salvo no BD!");
            atualizarImagem2();
        } catch (Exception e) {
            lblStatusImagem2.setText("Erro ao salvar Pessoa: " + e.getMessage());
        }
    }

    @FXML
    public void onAtualizarPessoa() {
        String item = listImagem2.getSelectionModel().getSelectedItem();
        if (item == null || !item.startsWith("Pessoa")) {
            lblStatusImagem2.setText("Selecione uma Pessoa na lista para atualizar!");
            return;
        }
        try {
            int id = extrairId(item);
            String sexo = txtPessoaSexo.getText().trim();
            String cabelo = txtPessoaCabelo.getText().trim();
            int idade = Integer.parseInt(txtPessoaIdade.getText().trim());
            Pessoa p = new Pessoa(id, sexo, cabelo, idade);
            dao.atualizarPessoa(p);
            lblStatusImagem2.setText("Pessoa ID " + id + " atualizada com sucesso!");
            atualizarImagem2();
        } catch (Exception e) {
            lblStatusImagem2.setText("Erro ao atualizar Pessoa: " + e.getMessage());
        }
    }

    @FXML
    public void onSalvarBicicleta() {
        try {
            String cor = txtBikeCor.getText().trim();
            String marca = txtBikeMarca.getText().trim();
            double preco = Double.parseDouble(txtBikePreco.getText().trim().replace(",", "."));
            Bicicleta b = new Bicicleta(cor, marca, preco);
            dao.inserirBicicleta(b);
            lblStatusImagem2.setText(b.pedalar() + " " + b.acelerar() + " Salva no BD!");
            atualizarImagem2();
        } catch (Exception e) {
            lblStatusImagem2.setText("Erro ao salvar Bicicleta: " + e.getMessage());
        }
    }

    @FXML
    public void onAtualizarBicicleta() {
        String item = listImagem2.getSelectionModel().getSelectedItem();
        if (item == null || !item.startsWith("Bicicleta")) {
            lblStatusImagem2.setText("Selecione uma Bicicleta na lista para atualizar!");
            return;
        }
        try {
            int id = extrairId(item);
            String cor = txtBikeCor.getText().trim();
            String marca = txtBikeMarca.getText().trim();
            double preco = Double.parseDouble(txtBikePreco.getText().trim().replace(",", "."));
            Bicicleta b = new Bicicleta(id, cor, marca, preco);
            dao.atualizarBicicleta(b);
            lblStatusImagem2.setText("Bicicleta ID " + id + " atualizada com sucesso!");
            atualizarImagem2();
        } catch (Exception e) {
            lblStatusImagem2.setText("Erro ao atualizar Bicicleta: " + e.getMessage());
        }
    }

    @FXML
    public void onSalvarArvore() {
        try {
            String esp = txtArvoreEspecie.getText().trim();
            String folha = txtArvoreFolha.getText().trim();
            double tam = Double.parseDouble(txtArvoreTamanho.getText().trim().replace(",", "."));
            Arvore a = new Arvore(esp, folha, tam);
            dao.inserirArvore(a);
            lblStatusImagem2.setText(a.crescer() + " " + a.produzirFrutos() + " Salva no BD!");
            atualizarImagem2();
        } catch (Exception e) {
            lblStatusImagem2.setText("Erro ao salvar Árvore: " + e.getMessage());
        }
    }

    @FXML
    public void onAtualizarArvore() {
        String item = listImagem2.getSelectionModel().getSelectedItem();
        if (item == null || !item.startsWith("Árvore")) {
            lblStatusImagem2.setText("Selecione uma Árvore na lista para atualizar!");
            return;
        }
        try {
            int id = extrairId(item);
            String esp = txtArvoreEspecie.getText().trim();
            String folha = txtArvoreFolha.getText().trim();
            double tam = Double.parseDouble(txtArvoreTamanho.getText().trim().replace(",", "."));
            Arvore a = new Arvore(id, esp, folha, tam);
            dao.atualizarArvore(a);
            lblStatusImagem2.setText("Árvore ID " + id + " atualizada com sucesso!");
            atualizarImagem2();
        } catch (Exception e) {
            lblStatusImagem2.setText("Erro ao atualizar Árvore: " + e.getMessage());
        }
    }

    @FXML
    public void onDeletarSelecionadoImagem2() {
        String item = listImagem2.getSelectionModel().getSelectedItem();
        if (item == null) return;
        try {
            int id = extrairId(item);
            if (item.startsWith("Pessoa")) dao.deletarPessoa(id);
            else if (item.startsWith("Bicicleta")) dao.deletarBicicleta(id);
            else if (item.startsWith("Árvore")) dao.deletarArvore(id);
            lblStatusImagem2.setText("Item ID " + id + " excluído do BD!");
            atualizarImagem2();
        } catch (Exception e) {
            lblStatusImagem2.setText("Erro ao deletar: " + e.getMessage());
        }
    }

    private void atualizarImagem2() {
        try {
            ObservableList<String> itens = FXCollections.observableArrayList();
            for (Pessoa p : dao.listarPessoas()) itens.add(p.exibirInformacoes());
            for (Bicicleta b : dao.listarBicicletas()) itens.add(b.exibirInformacoes());
            for (Arvore a : dao.listarArvores()) itens.add(a.exibirInformacoes());
            listImagem2.setItems(itens);
        } catch (SQLException e) {
            lblStatusImagem2.setText("Erro ao carregar dados: " + e.getMessage());
        }
    }

    // ---------------- AÇÕES IMAGEM 3 ----------------
    @FXML
    public void onSalvarMascara() {
        try {
            String cor = txtMascaraCor.getText().trim();
            String tam = txtMascaraTamanho.getText().trim();
            String formato = txtMascaraFormato.getText().trim();
            Mascara m = new Mascara(cor, tam, formato);
            dao.inserirMascara(m);
            lblStatusImagem3.setText(m.colocar() + " " + m.limpar() + " Salva no BD!");
            atualizarImagem3();
        } catch (Exception e) {
            lblStatusImagem3.setText("Erro ao salvar Máscara: " + e.getMessage());
        }
    }

    @FXML
    public void onAtualizarMascara() {
        String item = listImagem3.getSelectionModel().getSelectedItem();
        if (item == null || !item.startsWith("Máscara")) {
            lblStatusImagem3.setText("Selecione uma Máscara na lista para atualizar!");
            return;
        }
        try {
            int id = extrairId(item);
            String cor = txtMascaraCor.getText().trim();
            String tam = txtMascaraTamanho.getText().trim();
            String formato = txtMascaraFormato.getText().trim();
            Mascara m = new Mascara(id, cor, tam, formato);
            dao.atualizarMascara(m);
            lblStatusImagem3.setText("Máscara ID " + id + " atualizada com sucesso!");
            atualizarImagem3();
        } catch (Exception e) {
            lblStatusImagem3.setText("Erro ao atualizar Máscara: " + e.getMessage());
        }
    }

    @FXML
    public void onSalvarTribo() {
        try {
            String nome = txtTriboNome.getText().trim();
            String regiao = txtTriboRegiao.getText().trim();
            String lingua = txtTriboLingua.getText().trim();
            Tribo t = new Tribo(nome, regiao, lingua);
            dao.inserirTribo(t);
            lblStatusImagem3.setText(t.realizarDanca() + " Salva no BD!");
            atualizarImagem3();
        } catch (Exception e) {
            lblStatusImagem3.setText("Erro ao salvar Tribo: " + e.getMessage());
        }
    }

    @FXML
    public void onAtualizarTribo() {
        String item = listImagem3.getSelectionModel().getSelectedItem();
        if (item == null || !item.startsWith("Tribo")) {
            lblStatusImagem3.setText("Selecione uma Tribo na lista para atualizar!");
            return;
        }
        try {
            int id = extrairId(item);
            String nome = txtTriboNome.getText().trim();
            String regiao = txtTriboRegiao.getText().trim();
            String lingua = txtTriboLingua.getText().trim();
            Tribo t = new Tribo(id, nome, regiao, lingua);
            dao.atualizarTribo(t);
            lblStatusImagem3.setText("Tribo ID " + id + " atualizada com sucesso!");
            atualizarImagem3();
        } catch (Exception e) {
            lblStatusImagem3.setText("Erro ao atualizar Tribo: " + e.getMessage());
        }
    }

    @FXML
    public void onSalvarArtista() {
        try {
            String nome = txtArtistaNome.getText().trim();
            String nac = txtArtistaNacionalidade.getText().trim();
            int idade = Integer.parseInt(txtArtistaIdade.getText().trim());
            Artista a = new Artista(nome, nac, idade);
            dao.inserirArtista(a);
            lblStatusImagem3.setText(a.esculpirMascara() + " Salvo no BD!");
            atualizarImagem3();
        } catch (Exception e) {
            lblStatusImagem3.setText("Erro ao salvar Artista: " + e.getMessage());
        }
    }

    @FXML
    public void onAtualizarArtista() {
        String item = listImagem3.getSelectionModel().getSelectedItem();
        if (item == null || !item.startsWith("Artista")) {
            lblStatusImagem3.setText("Selecione um Artista na lista para atualizar!");
            return;
        }
        try {
            int id = extrairId(item);
            String nome = txtArtistaNome.getText().trim();
            String nac = txtArtistaNacionalidade.getText().trim();
            int idade = Integer.parseInt(txtArtistaIdade.getText().trim());
            Artista a = new Artista(id, nome, nac, idade);
            dao.atualizarArtista(a);
            lblStatusImagem3.setText("Artista ID " + id + " atualizado com sucesso!");
            atualizarImagem3();
        } catch (Exception e) {
            lblStatusImagem3.setText("Erro ao atualizar Artista: " + e.getMessage());
        }
    }

    @FXML
    public void onDeletarSelecionadoImagem3() {
        String item = listImagem3.getSelectionModel().getSelectedItem();
        if (item == null) return;
        try {
            int id = extrairId(item);
            if (item.startsWith("Máscara")) dao.deletarMascara(id);
            else if (item.startsWith("Tribo")) dao.deletarTribo(id);
            else if (item.startsWith("Artista")) dao.deletarArtista(id);
            lblStatusImagem3.setText("Item ID " + id + " excluído do BD!");
            atualizarImagem3();
        } catch (Exception e) {
            lblStatusImagem3.setText("Erro ao deletar: " + e.getMessage());
        }
    }

    private void atualizarImagem3() {
        try {
            ObservableList<String> itens = FXCollections.observableArrayList();
            for (Mascara m : dao.listarMascaras()) itens.add(m.exibirInformacoes());
            for (Tribo t : dao.listarTribos()) itens.add(t.exibirInformacoes());
            for (Artista a : dao.listarArtistas()) itens.add(a.exibirInformacoes());
            listImagem3.setItems(itens);
        } catch (SQLException e) {
            lblStatusImagem3.setText("Erro ao carregar dados: " + e.getMessage());
        }
    }

    // ---------------- AÇÕES IMAGEM 4 ----------------
    @FXML
    public void onSalvarManga() {
        try {
            String tit = txtMangaTitulo.getText().trim();
            String gen = txtMangaGenero.getText().trim();
            int caps = Integer.parseInt(txtMangaCaps.getText().trim());
            Manga m = new Manga(tit, gen, caps);
            dao.inserirManga(m);
            lblStatusImagem4.setText(m.publicar() + " " + m.adicionarCapitulo() + " Salvo no BD!");
            atualizarImagem4();
        } catch (Exception e) {
            lblStatusImagem4.setText("Erro ao salvar Mangá: " + e.getMessage());
        }
    }

    @FXML
    public void onAtualizarManga() {
        String item = listImagem4.getSelectionModel().getSelectedItem();
        if (item == null || !item.startsWith("Mangá")) {
            lblStatusImagem4.setText("Selecione um Mangá na lista para atualizar!");
            return;
        }
        try {
            int id = extrairId(item);
            String tit = txtMangaTitulo.getText().trim();
            String gen = txtMangaGenero.getText().trim();
            int caps = Integer.parseInt(txtMangaCaps.getText().trim());
            Manga m = new Manga(id, tit, gen, caps);
            dao.atualizarManga(m);
            lblStatusImagem4.setText("Mangá ID " + id + " atualizado com sucesso!");
            atualizarImagem4();
        } catch (Exception e) {
            lblStatusImagem4.setText("Erro ao atualizar Mangá: " + e.getMessage());
        }
    }

    @FXML
    public void onSalvarPersonagem() {
        try {
            String nome = txtPersonagemNome.getText().trim();
            int idade = Integer.parseInt(txtPersonagemIdade.getText().trim());
            String tipo = txtPersonagemTipo.getText().trim();
            Personagem p = new Personagem(nome, idade, tipo);
            dao.inserirPersonagem(p);
            lblStatusImagem4.setText(p.atacar() + " " + p.falar() + " Salvo no BD!");
            atualizarImagem4();
        } catch (Exception e) {
            lblStatusImagem4.setText("Erro ao salvar Personagem: " + e.getMessage());
        }
    }

    @FXML
    public void onAtualizarPersonagem() {
        String item = listImagem4.getSelectionModel().getSelectedItem();
        if (item == null || !item.startsWith("Personagem")) {
            lblStatusImagem4.setText("Selecione um Personagem na lista para atualizar!");
            return;
        }
        try {
            int id = extrairId(item);
            String nome = txtPersonagemNome.getText().trim();
            int idade = Integer.parseInt(txtPersonagemIdade.getText().trim());
            String tipo = txtPersonagemTipo.getText().trim();
            Personagem p = new Personagem(id, nome, idade, tipo);
            dao.atualizarPersonagem(p);
            lblStatusImagem4.setText("Personagem ID " + id + " atualizado com sucesso!");
            atualizarImagem4();
        } catch (Exception e) {
            lblStatusImagem4.setText("Erro ao atualizar Personagem: " + e.getMessage());
        }
    }

    @FXML
    public void onSalvarDesenhista() {
        try {
            String nome = txtDesenhistaNome.getText().trim();
            String esp = txtDesenhistaEsp.getText().trim();
            int exp = Integer.parseInt(txtDesenhistaExp.getText().trim());
            Desenhista d = new Desenhista(nome, esp, exp);
            dao.inserirDesenhista(d);
            lblStatusImagem4.setText(d.desenhar() + " " + d.criarPersonagem() + " Salvo no BD!");
            atualizarImagem4();
        } catch (Exception e) {
            lblStatusImagem4.setText("Erro ao salvar Desenhista: " + e.getMessage());
        }
    }

    @FXML
    public void onAtualizarDesenhista() {
        String item = listImagem4.getSelectionModel().getSelectedItem();
        if (item == null || !item.startsWith("Desenhista")) {
            lblStatusImagem4.setText("Selecione um Desenhista na lista para atualizar!");
            return;
        }
        try {
            int id = extrairId(item);
            String nome = txtDesenhistaNome.getText().trim();
            String esp = txtDesenhistaEsp.getText().trim();
            int exp = Integer.parseInt(txtDesenhistaExp.getText().trim());
            Desenhista d = new Desenhista(id, nome, esp, exp);
            dao.atualizarDesenhista(d);
            lblStatusImagem4.setText("Desenhista ID " + id + " atualizado com sucesso!");
            atualizarImagem4();
        } catch (Exception e) {
            lblStatusImagem4.setText("Erro ao atualizar Desenhista: " + e.getMessage());
        }
    }

    @FXML
    public void onDeletarSelecionadoImagem4() {
        String item = listImagem4.getSelectionModel().getSelectedItem();
        if (item == null) return;
        try {
            int id = extrairId(item);
            if (item.startsWith("Mangá")) dao.deletarManga(id);
            else if (item.startsWith("Personagem")) dao.deletarPersonagem(id);
            else if (item.startsWith("Desenhista")) dao.deletarDesenhista(id);
            lblStatusImagem4.setText("Item ID " + id + " excluído do BD!");
            atualizarImagem4();
        } catch (Exception e) {
            lblStatusImagem4.setText("Erro ao deletar: " + e.getMessage());
        }
    }

    private void atualizarImagem4() {
        try {
            ObservableList<String> itens = FXCollections.observableArrayList();
            for (Manga m : dao.listarMangas()) itens.add(m.exibirInformacoes());
            for (Personagem p : dao.listarPersonagens()) itens.add(p.exibirInformacoes());
            for (Desenhista d : dao.listarDesenhistas()) itens.add(d.exibirInformacoes());
            listImagem4.setItems(itens);
        } catch (SQLException e) {
            lblStatusImagem4.setText("Erro ao carregar dados: " + e.getMessage());
        }
    }

    private int extrairId(String texto) {
        int idx = texto.indexOf("ID: ");
        if (idx != -1) {
            int fim = texto.indexOf(",", idx);
            if (fim != -1) {
                return Integer.parseInt(texto.substring(idx + 4, fim).trim());
            }
        }
        return 0;
    }
}
