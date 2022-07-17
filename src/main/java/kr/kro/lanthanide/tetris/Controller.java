package kr.kro.lanthanide.tetris;

import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    Text title;

    @FXML
    Button buttonPlayPrompt, buttonSettings, buttonExit, buttonMode;

    @FXML
    Pane playPrompt;

    public void promptPlay() {
        System.out.println("Starting Game");
        playPrompt.setVisible(true);
        playPrompt.requestFocus();
    }

    public void openSettings() {
        System.out.println("Showing Statics");
    }

    public void exitGame() {
        System.out.println("Terminating Process");
        Tetris.window.close();
    }

    public void changeMode() {
        System.out.println("Changing Mode");
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        playPrompt.setVisible(false);
        playPrompt.setOnKeyPressed(e -> {
            if (e.getCode() == KeyCode.ESCAPE && playPrompt.isVisible()) playPrompt.setVisible(false);
        });
    }
}