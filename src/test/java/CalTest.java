import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalTest {

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
}