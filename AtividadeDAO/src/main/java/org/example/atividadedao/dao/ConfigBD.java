package org.example.atividadedao.dao;

import java.io.InputStream;
import java.util.Properties;

public class ConfigBD {
    private String url;
    private String user;
    private String password;

    public ConfigBD() {
        loadProperties();
    }

    private void loadProperties() {
        try (InputStream input = getClass().getClassLoader().getResourceAsStream("db.properties")) {
            if (input == null) {
                // Configuração padrão de fallback caso o arquivo não seja encontrado
                this.url = "jdbc:sqlite:atividadedao.db";
                return;
            }

            Properties prop = new Properties();
            prop.load(input);

            this.url = prop.getProperty("db.url", "jdbc:sqlite:atividadedao.db");
            this.user = prop.getProperty("db.user", "");
            this.password = prop.getProperty("db.password", "");
        } catch (Exception e) {
            e.printStackTrace();
            this.url = "jdbc:sqlite:atividadedao.db";
        }
    }

    public String getUrl() {
        return url;
    }

    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }
}

