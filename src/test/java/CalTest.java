import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalTest {

    @Test
    void getSum() {
        Cal cal = new Cal();
        int input1 = 3;
        int input2 = 4;
        int expected = 7;

        int actual = cal.getSum(input1, input2);

        assertEquals(expected, actual);
    }
}