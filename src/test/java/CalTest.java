import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalTest {

    @Test
    void getGopGop() {
        Cal cal = new Cal();
        int result = cal.getGopGop(2, 3, 4);
        assertEquals(24, result, "2 * 3 * 4 should equal 24");

        result = cal.getGopGop(1, 5, 6);
        assertEquals(30, result, "1 * 5 * 6 should equal 30");

        result = cal.getGopGop(0, 10, 20);
        assertEquals(0, result, "0 * 10 * 20 should equal 0");

        result = cal.getGopGop(-1, -2, -3);
        assertEquals(-6, result, "-1 * -2 * -3 should equal -6");
    }
}