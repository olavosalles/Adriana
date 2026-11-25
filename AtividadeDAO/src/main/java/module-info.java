module org.example.atividadedao {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.datatransfer;
    requires java.desktop;
    requires java.sql;

    opens org.example.atividadedao to javafx.fxml;
    opens org.example.atividadedao.model to javafx.fxml, javafx.base;
    opens org.example.atividadedao.controller to javafx.fxml;

    exports org.example.atividadedao;
    exports org.example.atividadedao.model;
    exports org.example.atividadedao.controller;
    exports org.example.atividadedao.dao;
}
