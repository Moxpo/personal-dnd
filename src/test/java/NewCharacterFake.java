

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.io.BufferedReader;
import java.io.IOException;

class NewCharacterFake {



    @Test
    void testCreateCharacterFromFile() throws IOException {
        String fakeFileContent = "fakeUser,9,10,11,12,13,14\n";

        BufferedReader fakeReader = Mockito.mock(BufferedReader.class);

        when(fakeReader.readLine())
                .thenReturn(fakeFileContent)
                .thenReturn(null);

        Character createdCharacter = NewCharacter.createCharacter("fakeUser", null);


        assertEquals("fakeUser", createdCharacter.getName());
        assertEquals(9, createdCharacter.getStrength());
        assertEquals(10, createdCharacter.getDexterity());
        assertEquals(11, createdCharacter.getConstitution());
        assertEquals(12, createdCharacter.getIntelligence());
        assertEquals(13, createdCharacter.getWisdom());
        assertEquals(14, createdCharacter.getCharisma());
    }
}
