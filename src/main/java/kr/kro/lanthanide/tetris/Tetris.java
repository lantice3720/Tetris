package kr.kro.lanthanide.tetris;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class Tetris extends Application  {

    static Stage window;

    public static void main(String[] args) {
    launch();
}

    @Override
    public void start(Stage stage) throws IOException {
        window = stage;

        Parent root = FXMLLoader.load(getClass().getResource("menu.fxml"));
        window.setScene(new Scene(root));

        window.show();
    }
}