package org.example.noticiasmontero;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class GestionUsuarios extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("GestionUsuarios.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 650, 575);
        stage.setTitle("Noticias Montero");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private AnchorPane rootPane;

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

    @FXML
    private void openSignUpWindow() {
        try {
            // Cargar el contenido de la ventana de registro
            FXMLLoader loader = new FXMLLoader(getClass().getResource("signup.fxml"));
            AnchorPane registroPane = loader.load();

            // Reemplazar el contenido de la ventana actual con el de registro
            rootPane.getChildren().setAll(registroPane);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void openForgotPassWindow() {
        try {
            // Cargar el contenido de la ventana de registro
            FXMLLoader loader = new FXMLLoader(getClass().getResource("forgotPass.fxml"));
            AnchorPane registroPane = loader.load();

            // Reemplazar el contenido de la ventana actual con el de registro
            rootPane.getChildren().setAll(registroPane);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
