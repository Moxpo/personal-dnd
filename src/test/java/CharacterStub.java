import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class CharacterStub {

    @Test
    public void testCalculateStrengthWithStubModifier() {

        Modifier stubModifier = Mockito.mock(Modifier.class);
        when(stubModifier.calculate(10)).thenReturn(5);
        Character character = new Character("withStub", 10, 10, 10, 10, 10, 10);

        int stubStrength = stubModifier.calculate(character.getStrength());
        int expectedAC = 5;
        assertEquals(expectedAC, stubStrength);
    }



    @Test
    void testStrengthWithoutStubModifier(){
        Modifier modifier = new Modifier();
        Character character = new Character("withoutStub", 10, 10, 10, 10, 10, 10);

        int noStubStrength = modifier.calculate(character.getStrength());
        int expectedOutput = 0;
        assertEquals(expectedOutput, noStubStrength);
    }

}