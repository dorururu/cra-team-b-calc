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