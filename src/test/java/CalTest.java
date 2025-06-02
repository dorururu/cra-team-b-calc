import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalTest {
    @Test
    public void getZegopTest(){ 
        int testVal = 10;
        int returnV = getZegop(testVal);
        assertEqual(100, returnV);
    }
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