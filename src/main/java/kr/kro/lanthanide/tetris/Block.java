package kr.kro.lanthanide.tetris;


import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

public class Block {

    private int[] pos = new int[2];
    private Color color = new Color(0,0,0,0);

    public Block(int x, int y, Color color) {
        if (x >= 0 && y >= 0 && color != null) {
            pos[0] = x;
            pos[1] = y;
            this.color = color;
        }
    }

    public void setPos(int x, int y) {
        if (x >= 0 && y >= 0) {
            pos[0] = x;
            pos[1] = y;
        }
    }

    public int[] getPos() {
        return pos;
    }

    public void setColor(Color color) {
        if (color != null) this.color = color;
    }

    /**
     * Draws block to provided scene.
     *
     * @param gc where Block will paint
     * @param unit How many px does Block have
     */
    public void render(GraphicsContext gc, int unit) {
        if (gc == null) return;

        System.out.println("rendering block");
        gc.setFill(color);
        gc.setStroke(color);
        gc.fillRect(unit*pos[0], unit*pos[1], unit, unit);
    }
}
