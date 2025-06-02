import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalTest {

    @Test
    void getSum_both_positive() {
        Cal cal = new Cal();
        int input1 = 3;
        int input2 = 4;
        int expected = 7;

        int actual = cal.getSum(input1, input2);

        assertEquals(expected, actual);
    }

    @Test
    void getSum_both_negative() {
        Cal cal = new Cal();
        int input1 = -3;
        int input2 = -4;
        int expected = -7;

        int actual = cal.getSum(input1, input2);

        assertEquals(expected, actual);
    }

    @Test
    void getSum_both_zero() {
        Cal cal = new Cal();
        int input1 = 0;
        int input2 = 0;
        int expected = 0;

        int actual = cal.getSum(input1, input2);

        assertEquals(expected, actual);
    }


}