
import org.junit.jupiter.api.DisplayName;
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
    @DisplayName("MinusTest")
    void getMinus() {
                Cal cal = new Cal();
                int expect = 3;
                int result = cal.getMinus(4,1);
                assertEquals(expect,result);
    }
  


    @Test
    void getDivide() {
        Cal c = new Cal();
        int expected = 3;

        int actual = c.getDivide(6,2);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("곱곱 테스트")
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
  
   @Test
    void getSum() {
        Cal cal = new Cal();
        int input1 = 3;
        int input2 = 4;
        int expected = 7;

        int actual = cal.getSum(input1, input2);

        assertEquals(expected, actual); 
    }

    @Test
    void getSumSum() {
        // arrange
        Cal cal = new Cal();
        int expected = 10;

        // act
        int actual = cal.getSumSum(10, 3, 2);

        // assert
        assertEquals(expected, actual); 
    }


}