package kr.kro.lanthanide.tetris;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Tetris extends Application {

    static Stage window;
    static Scene scene;

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws IOException {
        window = stage;

        switchScene("menu.fxml");



        window.show();
    }

    public static void switchScene(String location) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Tetris.class.getResource(location));
        scene = new Scene(fxmlLoader.load());
        scene.setOnKeyPressed(e -> {
            SceneController sceneController = fxmlLoader.getController();
            sceneController.onKeyPressed(e);
        });

        window.setScene(scene);
    }
}