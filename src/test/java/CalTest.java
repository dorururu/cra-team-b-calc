import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalTest {

    @Test
    void getDivide() {
        Cal c = new Cal();
        int expected = 3;

        int actual = c.getDivide(6,2);

        assertEquals(expected, actual);
    }
}