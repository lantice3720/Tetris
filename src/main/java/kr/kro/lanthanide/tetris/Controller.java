package kr.kro.lanthanide.tetris;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    public void playGame() {
        System.out.println("Starting Game");
    }

    public void showStatics() {
        System.out.println("Showing Statics");
    }

    public void exitGame() {
        System.out.println("Terminating Process");
        Tetris.window.close();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        System.out.println("Loading Data...");

    }
}