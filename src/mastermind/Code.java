package mastermind;

import java.util.ArrayList;
import java.util.List;

public abstract class Code {

   protected List<GamePiece> code;

    public Code(int size) {
        code = new ArrayList<GamePiece>();
        for (int i = 0; i < size; i++) {
            code.add(null);
        }
    }

    @Override
    public String toString() {
        return code.get(0).name + ", " + code.get(1).name + ", " + code.get(2).name + ", " + code.get(3).name;

    }
}

