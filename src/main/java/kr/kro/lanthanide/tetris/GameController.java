package kr.kro.lanthanide.tetris;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class GameController implements Initializable, SceneController {

    @FXML
    Pane paneNext, paneSub, paneHold, paneExit;

    @FXML
    Canvas canvasMain;

    @FXML
    Button buttonExit, buttonNo, buttonYes;

    GraphicsContext gc;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        paneExit.setVisible(false);

        gc = canvasMain.getGraphicsContext2D();

        Block block = new Block(1, 1, Color.GREEN);
        block.render(gc, 35);
    }

    public void onKeyPressed(KeyEvent e) {
        switch (e.getCode()) {
            case ESCAPE -> {
                paneExit.setVisible(false);
            }
        }
    }

    public void exitGame() throws IOException {
        Tetris.switchScene("menu.fxml");
    }

    public void exitPrompt() {
        paneExit.setVisible(true);
    }

    public void closeExitPrompt() {
        paneExit.setVisible(false);
    }
}
