import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalTest {

    @Test
    @DisplayName("곱하기 테스트")
    void getGop() {
        int a = 10;
        int b = -5;
        int expected = -50;

        Cal cal = new Cal();
        int actual = cal.getGop(a, b);

        assertEquals(expected, actual);
    }
}