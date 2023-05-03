
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import java.util.Random;
import static org.junit.jupiter.api.Assertions.*;

class DiceTest {

    private static Dice dice;

    @BeforeAll
    static void setup() {
        dice = new Dice();
    }

    @Test
    void testDiceRoll() {
        int rollResult = dice.roll("1d6");
        assertTrue(rollResult >= 1 && rollResult <= 6);
    }

    @Test
    void testDiceRollAndKeepHighestBoundary() {
        Dice diceRealRandom = new Dice(new Random());
        int rollResult = diceRealRandom.rollAndKeepHighest("4d6", 3);
        assertTrue(rollResult >= 3 && rollResult <= 18);
    }

    @Test
    public void testDiceRollAndKeepHighestInvalidInput() {
        int rollResult = dice.rollAndKeepHighest("", 3);
        int expectedOutput = 0;
        assertEquals(expectedOutput, rollResult);
    }


}
