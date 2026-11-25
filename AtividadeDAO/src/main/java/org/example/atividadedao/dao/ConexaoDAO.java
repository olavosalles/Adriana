package org.example.atividadedao.dao;

import org.example.atividadedao.model.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ConexaoDAO {
    private final ConfigBD config;

    public ConexaoDAO() {
        this.config = new ConfigBD();
        criarTabelasSeNaoExistirem();
    }

    private Connection getConexao() throws SQLException {
        if (config.getUser() != null && !config.getUser().trim().isEmpty()) {
            return DriverManager.getConnection(config.getUrl(), config.getUser(), config.getPassword());
        }
        return DriverManager.getConnection(config.getUrl());
    }

    private void criarTabelasSeNaoExistirem() {
        // Criação automática compatível com SQLite e PostgreSQL
        String[] ddl = {
            "CREATE TABLE IF NOT EXISTS camisa (id INTEGER PRIMARY KEY AUTOINCREMENT, cor TEXT, tamanho TEXT, preco REAL)",
            "CREATE TABLE IF NOT EXISTS calca (id INTEGER PRIMARY KEY AUTOINCREMENT, cor TEXT, tamanho TEXT, preco REAL)",
            "CREATE TABLE IF NOT EXISTS terno (id INTEGER PRIMARY KEY AUTOINCREMENT, cor TEXT, tamanho TEXT, preco REAL)",
            "CREATE TABLE IF NOT EXISTS pessoa (id INTEGER PRIMARY KEY AUTOINCREMENT, sexo TEXT, cor_cabelo TEXT, idade INTEGER)",
            "CREATE TABLE IF NOT EXISTS bicicleta (id INTEGER PRIMARY KEY AUTOINCREMENT, cor TEXT, marca TEXT, preco REAL)",
            "CREATE TABLE IF NOT EXISTS arvore (id INTEGER PRIMARY KEY AUTOINCREMENT, especie TEXT, cor_folha TEXT, tamanho REAL)",
            "CREATE TABLE IF NOT EXISTS mascara (id INTEGER PRIMARY KEY AUTOINCREMENT, cor TEXT, tamanho TEXT, formato TEXT)",
            "CREATE TABLE IF NOT EXISTS tribo (id INTEGER PRIMARY KEY AUTOINCREMENT, nome TEXT, regiao TEXT, lingua TEXT)",
            "CREATE TABLE IF NOT EXISTS artista (id INTEGER PRIMARY KEY AUTOINCREMENT, nome TEXT, nacionalidade TEXT, idade INTEGER)",
            "CREATE TABLE IF NOT EXISTS manga (id INTEGER PRIMARY KEY AUTOINCREMENT, titulo TEXT, genero TEXT, numero_capitulos INTEGER)",
            "CREATE TABLE IF NOT EXISTS personagem (id INTEGER PRIMARY KEY AUTOINCREMENT, nome TEXT, idade INTEGER, tipo TEXT)",
            "CREATE TABLE IF NOT EXISTS desenhista (id INTEGER PRIMARY KEY AUTOINCREMENT, nome TEXT, especialidade TEXT, anos_experiencia INTEGER)"
        };

        try (Connection con = getConexao(); Statement stmt = con.createStatement()) {
            for (String sql : ddl) {
                try {
                    // Para Postgres adaptar AUTOINCREMENT caso necessário
                    if (config.getUrl().contains("postgresql")) {
                        sql = sql.replace("INTEGER PRIMARY KEY AUTOINCREMENT", "SERIAL PRIMARY KEY")
                                 .replace("REAL", "DOUBLE PRECISION");
                    }
                    stmt.execute(sql);
                } catch (SQLException ignored) {
                }
            }
        } catch (SQLException e) {
            System.err.println("Aviso ao conectar/criar tabelas: " + e.getMessage());
        }
    }

    // ================= IMAGEM 1 =================
    public void inserirCamisa(Camisa c) throws SQLException {
        String sql = "INSERT INTO camisa (cor, tamanho, preco) VALUES (?, ?, ?)";
        try (Connection con = getConexao(); PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, c.getCor());
            ps.setString(2, c.getTamanho());
            ps.setDouble(3, c.getPreco());
            ps.executeUpdate();
        }
    }

    public List<Camisa> listarCamisas() throws SQLException {
        List<Camisa> lista = new ArrayList<>();
        String sql = "SELECT * FROM camisa";
        try (Connection con = getConexao(); Statement stmt = con.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                lista.add(new Camisa(rs.getInt("id"), rs.getString("cor"), rs.getString("tamanho"), rs.getDouble("preco")));
            }
        }
        return lista;
    }

    public void deletarCamisa(int id) throws SQLException {
        deletarGenerico("camisa", id);
    }

    public void atualizarCamisa(Camisa c) throws SQLException {
        String sql = "UPDATE camisa SET cor = ?, tamanho = ?, preco = ? WHERE id = ?";
        try (Connection con = getConexao(); PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, c.getCor());
            ps.setString(2, c.getTamanho());
            ps.setDouble(3, c.getPreco());
            ps.setInt(4, c.getId());
            ps.executeUpdate();
        }
    }

    public void inserirCalca(Calca c) throws SQLException {
        String sql = "INSERT INTO calca (cor, tamanho, preco) VALUES (?, ?, ?)";
        try (Connection con = getConexao(); PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, c.getCor());
            ps.setString(2, c.getTamanho());
            ps.setDouble(3, c.getPreco());
            ps.executeUpdate();
        }
    }

    public List<Calca> listarCalcas() throws SQLException {
        List<Calca> lista = new ArrayList<>();
        String sql = "SELECT * FROM calca";
        try (Connection con = getConexao(); Statement stmt = con.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                lista.add(new Calca(rs.getInt("id"), rs.getString("cor"), rs.getString("tamanho"), rs.getDouble("preco")));
            }
        }
        return lista;
    }

    public void deletarCalca(int id) throws SQLException {
        deletarGenerico("calca", id);
    }

    public void atualizarCalca(Calca c) throws SQLException {
        String sql = "UPDATE calca SET cor = ?, tamanho = ?, preco = ? WHERE id = ?";
        try (Connection con = getConexao(); PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, c.getCor());
            ps.setString(2, c.getTamanho());
            ps.setDouble(3, c.getPreco());
            ps.setInt(4, c.getId());
            ps.executeUpdate();
        }
    }

    public void inserirTerno(Terno t) throws SQLException {
        String sql = "INSERT INTO terno (cor, tamanho, preco) VALUES (?, ?, ?)";
        try (Connection con = getConexao(); PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, t.getCor());
            ps.setString(2, t.getTamanho());
            ps.setDouble(3, t.getPreco());
            ps.executeUpdate();
        }
    }

    public List<Terno> listarTernos() throws SQLException {
        List<Terno> lista = new ArrayList<>();
        String sql = "SELECT * FROM terno";
        try (Connection con = getConexao(); Statement stmt = con.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                lista.add(new Terno(rs.getInt("id"), rs.getString("cor"), rs.getString("tamanho"), rs.getDouble("preco")));
            }
        }
        return lista;
    }

    public void deletarTerno(int id) throws SQLException {
        deletarGenerico("terno", id);
    }

    public void atualizarTerno(Terno t) throws SQLException {
        String sql = "UPDATE terno SET cor = ?, tamanho = ?, preco = ? WHERE id = ?";
        try (Connection con = getConexao(); PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, t.getCor());
            ps.setString(2, t.getTamanho());
            ps.setDouble(3, t.getPreco());
            ps.setInt(4, t.getId());
            ps.executeUpdate();
        }
    }

    // ================= IMAGEM 2 =================
    public void inserirPessoa(Pessoa p) throws SQLException {
        String sql = "INSERT INTO pessoa (sexo, cor_cabelo, idade) VALUES (?, ?, ?)";
        try (Connection con = getConexao(); PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, p.getSexo());
            ps.setString(2, p.getCorCabelo());
            ps.setInt(3, p.getIdade());
            ps.executeUpdate();
        }
    }

    public List<Pessoa> listarPessoas() throws SQLException {
        List<Pessoa> lista = new ArrayList<>();
        String sql = "SELECT * FROM pessoa";
        try (Connection con = getConexao(); Statement stmt = con.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                lista.add(new Pessoa(rs.getInt("id"), rs.getString("sexo"), rs.getString("cor_cabelo"), rs.getInt("idade")));
            }
        }
        return lista;
    }

    public void deletarPessoa(int id) throws SQLException {
        deletarGenerico("pessoa", id);
    }

    public void atualizarPessoa(Pessoa p) throws SQLException {
        String sql = "UPDATE pessoa SET sexo = ?, cor_cabelo = ?, idade = ? WHERE id = ?";
        try (Connection con = getConexao(); PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, p.getSexo());
            ps.setString(2, p.getCorCabelo());
            ps.setInt(3, p.getIdade());
            ps.setInt(4, p.getId());
            ps.executeUpdate();
        }
    }

    public void inserirBicicleta(Bicicleta b) throws SQLException {
        String sql = "INSERT INTO bicicleta (cor, marca, preco) VALUES (?, ?, ?)";
        try (Connection con = getConexao(); PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, b.getCor());
            ps.setString(2, b.getMarca());
            ps.setDouble(3, b.getPreco());
            ps.executeUpdate();
        }
    }

    public List<Bicicleta> listarBicicletas() throws SQLException {
        List<Bicicleta> lista = new ArrayList<>();
        String sql = "SELECT * FROM bicicleta";
        try (Connection con = getConexao(); Statement stmt = con.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                lista.add(new Bicicleta(rs.getInt("id"), rs.getString("cor"), rs.getString("marca"), rs.getDouble("preco")));
            }
        }
        return lista;
    }

    public void deletarBicicleta(int id) throws SQLException {
        deletarGenerico("bicicleta", id);
    }

    public void atualizarBicicleta(Bicicleta b) throws SQLException {
        String sql = "UPDATE bicicleta SET cor = ?, marca = ?, preco = ? WHERE id = ?";
        try (Connection con = getConexao(); PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, b.getCor());
            ps.setString(2, b.getMarca());
            ps.setDouble(3, b.getPreco());
            ps.setInt(4, b.getId());
            ps.executeUpdate();
        }
    }

    public void inserirArvore(Arvore a) throws SQLException {
        String sql = "INSERT INTO arvore (especie, cor_folha, tamanho) VALUES (?, ?, ?)";
        try (Connection con = getConexao(); PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, a.getEspecie());
            ps.setString(2, a.getCorFolha());
            ps.setDouble(3, a.getTamanho());
            ps.executeUpdate();
        }
    }

    public List<Arvore> listarArvores() throws SQLException {
        List<Arvore> lista = new ArrayList<>();
        String sql = "SELECT * FROM arvore";
        try (Connection con = getConexao(); Statement stmt = con.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                lista.add(new Arvore(rs.getInt("id"), rs.getString("especie"), rs.getString("cor_folha"), rs.getDouble("tamanho")));
            }
        }
        return lista;
    }

    public void deletarArvore(int id) throws SQLException {
        deletarGenerico("arvore", id);
    }

    public void atualizarArvore(Arvore a) throws SQLException {
        String sql = "UPDATE arvore SET especie = ?, cor_folha = ?, tamanho = ? WHERE id = ?";
        try (Connection con = getConexao(); PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, a.getEspecie());
            ps.setString(2, a.getCorFolha());
            ps.setDouble(3, a.getTamanho());
            ps.setInt(4, a.getId());
            ps.executeUpdate();
        }
    }

    // ================= IMAGEM 3 =================
    public void inserirMascara(Mascara m) throws SQLException {
        String sql = "INSERT INTO mascara (cor, tamanho, formato) VALUES (?, ?, ?)";
        try (Connection con = getConexao(); PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, m.getCor());
            ps.setString(2, m.getTamanho());
            ps.setString(3, m.getFormato());
            ps.executeUpdate();
        }
    }

    public List<Mascara> listarMascaras() throws SQLException {
        List<Mascara> lista = new ArrayList<>();
        String sql = "SELECT * FROM mascara";
        try (Connection con = getConexao(); Statement stmt = con.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                lista.add(new Mascara(rs.getInt("id"), rs.getString("cor"), rs.getString("tamanho"), rs.getString("formato")));
            }
        }
        return lista;
    }

    public void deletarMascara(int id) throws SQLException {
        deletarGenerico("mascara", id);
    }

    public void atualizarMascara(Mascara m) throws SQLException {
        String sql = "UPDATE mascara SET cor = ?, tamanho = ?, formato = ? WHERE id = ?";
        try (Connection con = getConexao(); PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, m.getCor());
            ps.setString(2, m.getTamanho());
            ps.setString(3, m.getFormato());
            ps.setInt(4, m.getId());
            ps.executeUpdate();
        }
    }

    public void inserirTribo(Tribo t) throws SQLException {
        String sql = "INSERT INTO tribo (nome, regiao, lingua) VALUES (?, ?, ?)";
        try (Connection con = getConexao(); PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, t.getNome());
            ps.setString(2, t.getRegiao());
            ps.setString(3, t.getLingua());
            ps.executeUpdate();
        }
    }

    public List<Tribo> listarTribos() throws SQLException {
        List<Tribo> lista = new ArrayList<>();
        String sql = "SELECT * FROM tribo";
        try (Connection con = getConexao(); Statement stmt = con.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                lista.add(new Tribo(rs.getInt("id"), rs.getString("nome"), rs.getString("regiao"), rs.getString("lingua")));
            }
        }
        return lista;
    }

    public void deletarTribo(int id) throws SQLException {
        deletarGenerico("tribo", id);
    }

    public void atualizarTribo(Tribo t) throws SQLException {
        String sql = "UPDATE tribo SET nome = ?, regiao = ?, lingua = ? WHERE id = ?";
        try (Connection con = getConexao(); PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, t.getNome());
            ps.setString(2, t.getRegiao());
            ps.setString(3, t.getLingua());
            ps.setInt(4, t.getId());
            ps.executeUpdate();
        }
    }

    public void inserirArtista(Artista a) throws SQLException {
        String sql = "INSERT INTO artista (nome, nacionalidade, idade) VALUES (?, ?, ?)";
        try (Connection con = getConexao(); PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, a.getNome());
            ps.setString(2, a.getNacionalidade());
            ps.setInt(3, a.getIdade());
            ps.executeUpdate();
        }
    }

    public List<Artista> listarArtistas() throws SQLException {
        List<Artista> lista = new ArrayList<>();
        String sql = "SELECT * FROM artista";
        try (Connection con = getConexao(); Statement stmt = con.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                lista.add(new Artista(rs.getInt("id"), rs.getString("nome"), rs.getString("nacionalidade"), rs.getInt("idade")));
            }
        }
        return lista;
    }

    public void deletarArtista(int id) throws SQLException {
        deletarGenerico("artista", id);
    }

    public void atualizarArtista(Artista a) throws SQLException {
        String sql = "UPDATE artista SET nome = ?, nacionalidade = ?, idade = ? WHERE id = ?";
        try (Connection con = getConexao(); PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, a.getNome());
            ps.setString(2, a.getNacionalidade());
            ps.setInt(3, a.getIdade());
            ps.setInt(4, a.getId());
            ps.executeUpdate();
        }
    }

    // ================= IMAGEM 4 =================
    public void inserirManga(Manga m) throws SQLException {
        String sql = "INSERT INTO manga (titulo, genero, numero_capitulos) VALUES (?, ?, ?)";
        try (Connection con = getConexao(); PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, m.getTitulo());
            ps.setString(2, m.getGenero());
            ps.setInt(3, m.getNumeroCapitulos());
            ps.executeUpdate();
        }
    }

    public List<Manga> listarMangas() throws SQLException {
        List<Manga> lista = new ArrayList<>();
        String sql = "SELECT * FROM manga";
        try (Connection con = getConexao(); Statement stmt = con.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                lista.add(new Manga(rs.getInt("id"), rs.getString("titulo"), rs.getString("genero"), rs.getInt("numero_capitulos")));
            }
        }
        return lista;
    }

    public void deletarManga(int id) throws SQLException {
        deletarGenerico("manga", id);
    }

    public void atualizarManga(Manga m) throws SQLException {
        String sql = "UPDATE manga SET titulo = ?, genero = ?, numero_capitulos = ? WHERE id = ?";
        try (Connection con = getConexao(); PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, m.getTitulo());
            ps.setString(2, m.getGenero());
            ps.setInt(3, m.getNumeroCapitulos());
            ps.setInt(4, m.getId());
            ps.executeUpdate();
        }
    }

    public void inserirPersonagem(Personagem p) throws SQLException {
        String sql = "INSERT INTO personagem (nome, idade, tipo) VALUES (?, ?, ?)";
        try (Connection con = getConexao(); PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, p.getNome());
            ps.setInt(2, p.getIdade());
            ps.setString(3, p.getTipo());
            ps.executeUpdate();
        }
    }

    public List<Personagem> listarPersonagens() throws SQLException {
        List<Personagem> lista = new ArrayList<>();
        String sql = "SELECT * FROM personagem";
        try (Connection con = getConexao(); Statement stmt = con.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                lista.add(new Personagem(rs.getInt("id"), rs.getString("nome"), rs.getInt("idade"), rs.getString("tipo")));
            }
        }
        return lista;
    }

    public void deletarPersonagem(int id) throws SQLException {
        deletarGenerico("personagem", id);
    }

    public void atualizarPersonagem(Personagem p) throws SQLException {
        String sql = "UPDATE personagem SET nome = ?, idade = ?, tipo = ? WHERE id = ?";
        try (Connection con = getConexao(); PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, p.getNome());
            ps.setInt(2, p.getIdade());
            ps.setString(3, p.getTipo());
            ps.setInt(4, p.getId());
            ps.executeUpdate();
        }
    }

    public void inserirDesenhista(Desenhista d) throws SQLException {
        String sql = "INSERT INTO desenhista (nome, especialidade, anos_experiencia) VALUES (?, ?, ?)";
        try (Connection con = getConexao(); PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, d.getNome());
            ps.setString(2, d.getEspecialidade());
            ps.setInt(3, d.getAnosExperiencia());
            ps.executeUpdate();
        }
    }

    public List<Desenhista> listarDesenhistas() throws SQLException {
        List<Desenhista> lista = new ArrayList<>();
        String sql = "SELECT * FROM desenhista";
        try (Connection con = getConexao(); Statement stmt = con.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                lista.add(new Desenhista(rs.getInt("id"), rs.getString("nome"), rs.getString("especialidade"), rs.getInt("anos_experiencia")));
            }
        }
        return lista;
    }

    public void deletarDesenhista(int id) throws SQLException {
        deletarGenerico("desenhista", id);
    }

    public void atualizarDesenhista(Desenhista d) throws SQLException {
        String sql = "UPDATE desenhista SET nome = ?, especialidade = ?, anos_experiencia = ? WHERE id = ?";
        try (Connection con = getConexao(); PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, d.getNome());
            ps.setString(2, d.getEspecialidade());
            ps.setInt(3, d.getAnosExperiencia());
            ps.setInt(4, d.getId());
            ps.executeUpdate();
        }
    }

    private void deletarGenerico(String tabela, int id) throws SQLException {
        String sql = "DELETE FROM " + tabela + " WHERE id = ?";
        try (Connection con = getConexao(); PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, id);
            ps.executeUpdate();
        }
    }
}

