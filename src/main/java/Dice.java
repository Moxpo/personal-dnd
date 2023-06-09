import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Dice implements DiceInterface {
    private final Random random;
    public Dice() {
        random = new Random();
    }

    public Dice(Random random){
        this.random = random;
    }


    @Override
    public int roll(String diceSplit) {
        String[] parts = diceSplit.split("d");
        int numDice = Integer.parseInt(parts[0]);
        int numSides = Integer.parseInt(parts[1]);
        int result = 0;

        for (int i = 0; i < numDice; i++){
            result += random.nextInt(numSides) + 1;
        }
        return result;
    }



    @Override
    public int rollAndKeepHighest(String diceSplit, int numToKeep){

        if (diceSplit.isEmpty()) {
            return 0;
        }
            else {

                String[] parts = diceSplit.split("d");
                int numDice = Integer.parseInt(parts[0]);
                int numSides = Integer.parseInt(parts[1]);
                ArrayList<Integer> rolls = new ArrayList<>();

                for (int i = 0; i < numDice; i++) {
                    rolls.add(random.nextInt(numSides) + 1);
                }

                Collections.sort(rolls, Collections.reverseOrder());

                int result = 0;
                for (int i = 0; i < numToKeep; i++) {
                    result += rolls.get(i);
                }

                return result;

            }
        }


}
