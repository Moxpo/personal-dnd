
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ModifierTest {

    Modifier modifier = new Modifier();

    @Test
    public void testModifierCalculation() {
        int inputScore = 14;
        int expectedOutput = 2;
        assertEquals(expectedOutput, modifier.calculate(inputScore));
    }

    @Test
    public void testModifierCalculationInvalidScore() {
        int inputScore = 35;
        int expectedOutput = 0;
        assertEquals(expectedOutput, modifier.calculate(inputScore));
    }








}