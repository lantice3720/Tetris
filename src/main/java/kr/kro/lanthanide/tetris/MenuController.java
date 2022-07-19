package kr.kro.lanthanide.tetris;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MenuController implements Initializable, SceneController {

    @FXML
    Text title;

    @FXML
    Button buttonPlayPrompt, buttonSettings, buttonExit, buttonMode, buttonTheme, buttonPlayStart;

    @FXML
    Pane playPrompt, setting;

    public void promptPlay() {
        System.out.println("Prompting Game");
        playPrompt.setVisible(true);
    }

    public void startPlay() throws IOException {
        System.out.println("Starting Game");
        playPrompt.setVisible(false);
        Tetris.switchScene("game.fxml");
    }

    public void openSettings() {
        System.out.println("Opening Settings");
        setting.setVisible(true);
    }

    public void exitGame() {
        System.out.println("Terminating Process");
        Platform.exit();
    }

    public void changeMode() {
        System.out.println("Changing Mode");
    }

    public void changeTheme() {
        System.out.println("Changing Theme");
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        playPrompt.setVisible(false);
        setting.setVisible(false);
    }

    public void onKeyPressed(KeyEvent e) {
        switch (e.getCode()) {
            case ESCAPE -> {
                playPrompt.setVisible(false);
                setting.setVisible(false);
            }
        }
    }
}