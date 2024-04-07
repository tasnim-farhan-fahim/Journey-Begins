import java.util.Random;

public class DiceRoll {
    public static void main(String[] args) {
        @SuppressWarnings("unused")
        InnerDiceRoll innerDiceRoll = new InnerDiceRoll();
    }
    
}

class InnerDiceRoll {
    Random random;
    int number;
    InnerDiceRoll(){
        random =new Random();
        roll();
    }

    void roll(){
        number = random.nextInt(6)+1;
        System.out.println(number);
    }
}
