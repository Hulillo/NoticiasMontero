package org.example.noticiasmontero;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class CrearNoticias extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(CrearNoticias.class.getResource("CrearNoticias.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 668, 600);
        stage.setWidth(668);
        stage.setHeight(600);
        stage.setTitle("Noticias Montero");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
