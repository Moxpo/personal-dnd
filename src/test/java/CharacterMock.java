import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class CharacterMock {
    private Character mockCharacter;
    private Modifier mockModifier;

    @BeforeEach
    void setup(){
        mockCharacter = new Character("test", 10, 10, 10,
                10, 10, 10);
        mockModifier = Mockito.mock(Modifier.class);

    }

    @Test
    void testCalculateAC(){
        when(mockModifier.calculate(10)).thenReturn(5);
        int actualAC = mockCharacter.calculateAC(mockModifier);
        int expectedAC = 10 + 5;
        assertEquals(expectedAC, actualAC);

    }

    @Test
    void testCharacterAttributes() {
        assertEquals("test", mockCharacter.getName());
        assertEquals(10, mockCharacter.getStrength());
        assertEquals(10, mockCharacter.getDexterity());
        assertEquals(10, mockCharacter.getConstitution());
        assertEquals(10, mockCharacter.getIntelligence());
        assertEquals(10, mockCharacter.getWisdom());
        assertEquals(10, mockCharacter.getCharisma());
    }






}