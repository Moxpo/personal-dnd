import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class DiceTest {

    private Dice dice;

    @Mock
    private Dice mockedDice;

    @Mock
    private Random mockedRandom;

    @BeforeEach
    void Before(){
        mockedRandom = mock(Random.class);
        mockedDice = mock(Dice.class);
        dice = new Dice(mockedRandom);
    }


/*  OLD TESTS

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

*/
    @Test
    void roll1d20() {
        when(mockedRandom.nextInt(20)).thenReturn(16);
        // Set the mock to return 16 when nextInt(20) is called
        int result = dice.roll("1d20");
        assertEquals(17, result, "Correct");
        // Expecting 17 because nextInt(20) returns 16, and we add 1 in roll() method
    }
}