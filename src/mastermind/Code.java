package mastermind;

import java.util.List;

public abstract class Code {

    List<GamePiece> code;

    public Code() {
        
    }

    @Override
    public String toString() {
        return code.get(0).name + ", " + code.get(1).name + ", " + code.get(2).name + ", " + code.get(3).name;

    }
}

