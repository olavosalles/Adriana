module org.example.atividadegui {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.datatransfer;
    requires java.desktop;


    opens org.example.atividadegui to javafx.fxml;
    exports org.example.atividadegui;
}