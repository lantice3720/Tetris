package kr.kro.lanthanide.tetris;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
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

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("menu.fxml"));
        Parent root = fxmlLoader.load();
        menu = new Scene(root);

        window.setScene(menu);

        window.show();

        Controller controller = fxmlLoader.getController();

        menu.setOnKeyPressed(controller::onKeyPressed);
    }
}