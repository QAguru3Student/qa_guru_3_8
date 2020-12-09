import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimpleTests {
    @Test
    void successTest(){
        assertEquals(2 * 2, 4);
    }

    @Test
    void negativeTest(){
        assertEquals(2 * 2, 5);
    }
}
