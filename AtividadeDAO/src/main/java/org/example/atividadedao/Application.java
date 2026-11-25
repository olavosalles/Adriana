package org.example.atividadedao;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Application extends javafx.application.Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Application.class.getResource("dao_view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 760, 650);
        stage.setTitle("Sistema MVC + DAO - Imagens 1, 2, 3 e 4");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

