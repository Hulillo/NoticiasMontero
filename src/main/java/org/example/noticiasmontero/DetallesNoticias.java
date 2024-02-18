package org.example.noticiasmontero;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class DetallesNoticias extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("DetallesNoticias.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 650, 600);
        stage.setTitle("Noticias Montero!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

    @FXML
    private AnchorPane rootPane;
    @FXML
    private void openLoginWindow() {
        try {
            // Cargar el contenido de la ventana de login
            FXMLLoader loader = new FXMLLoader(getClass().getResource("inicio.fxml"));
            AnchorPane inicioPane = loader.load();

            // Reemplazar el contenido de la ventana actual con el de login
            rootPane.getChildren().setAll(inicioPane);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}