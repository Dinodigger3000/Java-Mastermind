package mastermind;

import java.awt.Color;

public enum GamePiece {
    RED("Red", Color.RED),
    ORANGE("Orange", Color.ORANGE),
    YELLOW("Yellow", Color.YELLOW),
    GREEN("Green", Color.GREEN),
    BLUE("Blue", Color.BLUE),
    PINK("Pink", Color.PINK);

    public final String name;
    public final Color color;

    private GamePiece(String name, Color color) {
        this.name = name;
        this.color = color;
    }
}
