import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiceTest {

    private Dice dice;

    @BeforeEach
    void Before(){
        dice = new Dice();

    }

    @org.junit.jupiter.api.Test
    void roll1d6() {
        int result = dice.roll("1d6");
        assertTrue(result >= 1 && result <= 6, "The result is correct");
    }

    @org.junit.jupiter.api.Test
    void rollAndKeepHighest_4d4_lessthan9() {
        int result = dice.rollAndKeepHighest("4d4", 2);
        assertTrue((result <=8), "Less than 9");
    }



}