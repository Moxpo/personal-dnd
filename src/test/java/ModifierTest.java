
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ModifierTest {

    Modifier modifier = new Modifier();

    @Test
    public void testModifierCalculationInvalidScore() {
        int inputScore = 35;
        int expectedOutput = 0;
        assertEquals(expectedOutput, modifier.calculate(inputScore));
    }

    @Test
    void testCalculateNegativeFive() {
        assertEquals(-5, modifier.calculate(1));
    }

    @Test
    void testCalculateNegativeFour() {
        assertEquals(-4, modifier.calculate(2));
        assertEquals(-4, modifier.calculate(3));
    }

    @Test
    void testCalculateNegativeThree() {
        assertEquals(-3, modifier.calculate(4));
        assertEquals(-3, modifier.calculate(5));
    }

    @Test
    void testCalculateNegativeTwo() {
        assertEquals(-2, modifier.calculate(6));
        assertEquals(-2, modifier.calculate(7));
    }

    @Test
    void testCalculateNegativeOne() {
        assertEquals(-1, modifier.calculate(8));
        assertEquals(-1, modifier.calculate(9));
    }

    @Test
    void testCalculateZero() {
        assertEquals(0, modifier.calculate(10));
        assertEquals(0, modifier.calculate(11));
    }
    @Test
    void testCalculateOne() {
        assertEquals(1, modifier.calculate(12));
        assertEquals(1, modifier.calculate(13));
    }

    @Test
    void testCalculateTwo() {
        assertEquals(2, modifier.calculate(14));
        assertEquals(2, modifier.calculate(15));
    }

    @Test
    void testCalculateThree() {
        assertEquals(3, modifier.calculate(16));
        assertEquals(3, modifier.calculate(17));
    }

    @Test
    void testCalculateFour() {
        assertEquals(4, modifier.calculate(18));
        assertEquals(4, modifier.calculate(19));
    }

    @Test
    void testCalculateFive() {
        assertEquals(5, modifier.calculate(20));
        assertEquals(5, modifier.calculate(21));
    }

    @Test
    void testCalculateSix() {
        assertEquals(6, modifier.calculate(22));
        assertEquals(6, modifier.calculate(23));
    }

    @Test
    void testCalculateSeven() {
        assertEquals(7, modifier.calculate(24));
        assertEquals(7, modifier.calculate(25));
    }

    @Test
    void testCalculateEight() {
        assertEquals(8, modifier.calculate(26));
        assertEquals(8, modifier.calculate(27));
    }

    @Test
    void testCalculateNine() {
        assertEquals(9, modifier.calculate(28));
        assertEquals(9, modifier.calculate(29));
    }
}