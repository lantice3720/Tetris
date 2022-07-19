package kr.kro.lanthanide.tetris;

public class Tetromino {

    private Block[] blocks = new Block[5];
    private String name;

    /**
     * Constructor for Tetromino
     * blockSet need to be [I, J, L, O, S, T, Z]
     *
     * @param name
     * @param blockSet
     */
    public Tetromino(String name, String blockSet) {
        if (name != null) this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null) this.name = name;
    }
}
