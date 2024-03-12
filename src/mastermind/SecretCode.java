package mastermind;

import java.util.Random;

public class SecretCode extends Code{
    public SecretCode(){
        super(4);
        generateRandomCode(4);
    }
    private void generateRandomCode(int length) {

        Random random = new Random();  
        for (int i = 0; i <length; i++) {
            code.set(i, GamePiece.values()[random.nextInt(0,5)]);      
        }
    }

}
