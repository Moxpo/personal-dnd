import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ModifierTest {

    @Test
    public void testModifierCalculation() {
        Modifier modifier = new Modifier();
        int inputScore = 14;
        int expectedOutput = 2;
        assertEquals(expectedOutput, modifier.calculate(inputScore));
    }

    @Test
    public void testModifierCalculationInvalidScore() {
        Modifier modifier = new Modifier();
        int inputScore = 35;
        int expectedOutput = 0;
        assertEquals(expectedOutput, modifier.calculate(inputScore));
    }








}