import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class CalculatorTest {

    private Calculator calculator;
    @Before
    public void setUp() throws Exception {
        calculator = new Calculator();
    }

    @Test
    public void emptyReturnZero() throws Exception {
        assertEquals(0, calculator.calcSum(""));
    }

    @Test
    public void xReturnX() throws Exception {
        assertEquals(1, calculator.calcSum("1"));
        assertEquals(2, calculator.calcSum("2"));
        assertEquals(3, calculator.calcSum("3"));
        assertEquals(4, calculator.calcSum("4"));
    }

    @Test
    public void oneAndZeroReturnOne() throws Exception {
        assertEquals(1+0, calculator.calcSum("1,0"));
    }

    @Test
    public void twoAndTwoReturnFour() throws Exception {
        assertEquals(2+2, calculator.calcSum("2,2"));
    }

    @Test
    public void sumTreeElement() throws Exception {
        assertEquals(2+2+5, calculator.calcSum("2,2,5"));
    }
}
