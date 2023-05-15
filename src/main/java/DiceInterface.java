public interface DiceInterface {
        int roll(String diceSplit);

        int rollAndKeepHighest(String diceSplit, int numToKeep);
}
