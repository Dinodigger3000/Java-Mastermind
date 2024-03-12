package mastermind;

import java.util.ArrayList;
import java.util.List;

public class Guess extends Code {
    public Guess() {
        super(4);
        code = new ArrayList<GamePiece>();
    }

    public void setGamePiece(int position, GamePiece piece){
        code.add(position, piece);
    }

    public boolean isFull() {
        for (GamePiece piece : code) {
            if (piece == null) {
                return false;
            }
        }
        return true;
    }
}
