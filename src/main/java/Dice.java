import java.util.Random;

public class Dice {
    private final Random random;

    public Dice() {
        random = new Random();
    }

    public int roll(String diceSplit){
        String[] parts = diceSplit.split("d");
        int numDice = Integer.parseInt(parts[0]);
        int numSides = Integer.parseInt(parts[1]);
        int result = 0;

        for (int i = 0; i < numDice; i++){
            result += random.nextInt(numSides) + 1;
        }

        return result;

    }
}
