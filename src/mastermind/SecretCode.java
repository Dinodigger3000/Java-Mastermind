package mastermind;

import java.util.Random;

public class SecretCode extends Code {
    public SecretCode() {
        super(4);
        generateRandomCode(4);
    }

    private void generateRandomCode(int length) {

        Random random = new Random();
        for (int i = 0; i < length; i++) {
            code.set(i, GamePiece.values()[random.nextInt(0, 5)]);
        }
    }

    public Feedback compareCodes(Guess guess) {
        int black = 0;
        int white = 0;
        // To check if the black are in right spot(black)
        for (int i = 0; i < code.size(); i++) {
            if (code.get(i).equals(guess.code.get(i))) {
                black++;
            } else if (code.contains(guess.code.get(i))){
                white++;
            }
        }
        return new Feedback(white, black);
    }

}
