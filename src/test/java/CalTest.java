import static org.junit.jupiter.api.Assertions.*;

class CalTest {
    @Test
    public void getZegopTest(){ 
        int testVal = 10;
        int returnV = getZegop(testVal);
        assertEqual(100, returnV);
    }
}