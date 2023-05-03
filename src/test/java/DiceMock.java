import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class DiceMock {

    private Dice dice;

    @Mock
    private Random mockedRandom;

    @BeforeEach
    void setup() {
        mockedRandom = mock(Random.class);
        dice = new Dice(mockedRandom);
    }

    @Test
    void testDiceRollAndKeepHighestWithMockedRandom() {
        when(mockedRandom.nextInt(6)).thenReturn(1, 2, 3, 4, 5, 6);
        Dice diceMockedRandom = new Dice(mockedRandom);
        int rollResult = diceMockedRandom.rollAndKeepHighest("4d6", 3);
        assertTrue(rollResult >= 3 && rollResult <= 18);
    }

    @Test
    void roll1d20() {
        when(mockedRandom.nextInt(20)).thenReturn(16);
        int result = dice.roll("1d20");
        assertEquals(17, result, "Correct");
    }

}
