package kr.kro.lanthanide.tetris;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Tetris extends Application {

    static Stage window;
    static Scene menu;

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws IOException {
        window = stage;

        Parent root = FXMLLoader.load(getClass().getResource("menu.fxml"));
        menu = new Scene(root);

        window.setScene(menu);

        window.show();
    }
}