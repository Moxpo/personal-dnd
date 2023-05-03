import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.mockito.stubbing.OngoingStubbing;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class CharacterTest {
    private Character character;
    private Modifier modifier;

    @BeforeEach
    void setup(){
        character = new Character("test", 10, 10, 10,
                10, 10, 10);
        modifier = Mockito.mock(Modifier.class);

    }

    @Test
    void testCalculateAC(){
        when(modifier.calculate(10)).thenReturn(55);
        assertEquals(55, modifier.calculate(10));

    }


}