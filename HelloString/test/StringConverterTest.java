package test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import src.StringConverter;

public class StringConverterTest {

    StringConverter sc = new StringConverter("hello world");

    @Test
    public void testConvertToAllCap() {
        assertEquals("HELLO WORLD", sc.convertToAllCap());
    }

    @Test
    public void testAlternateCharacter() {
        assertEquals("HeLlO WoRlD", sc.convertAlternateCharacter());
    }

  
}
