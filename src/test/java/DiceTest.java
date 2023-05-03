import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
/*
class DiceTest {

    private Dice dice;

    @Mock
    private Dice mockedDice;

    @Mock
    private Random mockedRandom;

    @BeforeEach
    void setup(){
        mockedRandom = mock(Random.class);
        mockedDice = mock(Dice.class);
        dice = new Dice(mockedRandom);
    }

    @Test
    void roll1d20() {
        when(mockedRandom.nextInt(20)).thenReturn(16);
        int result = dice.roll("1d20");
        assertEquals(17, result, "Correct");
    }



    @Test
    void testRollAndKeepHighestWithFakeRandom(){
        Dice diceFakeRandom = new Dice(new fakeRandom());

    }

}
*/