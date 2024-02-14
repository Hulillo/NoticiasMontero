package org.example.noticiasmontero;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class CrearNoticias extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        // Cargar el archivo FXML
        FXMLLoader fxmlLoader = new FXMLLoader(CrearNoticias.class.getResource("CrearNoticias.fxml"));

        // Crear la escena
        Scene scene = new Scene(fxmlLoader.load(), 668, 600);

        // Ajustar el ancho y alto de la ventana
        stage.setWidth(668);
        stage.setHeight(600);

        // Configurar el título de la ventana
        stage.setTitle("Noticias Montero");

        // Configurar la escena en la ventana y mostrarla
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
