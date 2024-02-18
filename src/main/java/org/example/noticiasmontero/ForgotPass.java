package org.example.noticiasmontero;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class ForgotPass extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Login.class.getResource("forgotPass.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        stage.setTitle("Noticias Montero");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private AnchorPane rootPane;

    @FXML
    private void openLoginWindow() {
        try {
            // Cargar el contenido de la ventana de login
            FXMLLoader loader = new FXMLLoader(getClass().getResource("login.fxml"));
            AnchorPane loginPane = loader.load();

            // Reemplazar el contenido de la ventana actual con el de login
            rootPane.getChildren().setAll(loginPane);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void openInicioWindow() {
        try {
            // Cargar el contenido de la ventana de login
            FXMLLoader loader = new FXMLLoader(getClass().getResource("inicio.fxml"));
            AnchorPane loginPane = loader.load();

            // Reemplazar el contenido de la ventana actual con el de login
            rootPane.getChildren().setAll(loginPane);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
