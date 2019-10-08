import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void calculator(){
        calculator = new Calculator();
    }

    @Test
    public void add(){
        assertEquals(10, calculator.add(5, 5));
    }

    @Test
    public void subtract(){
        assertEquals(3, calculator.subtract(7, 4));
    }

    @Test
    public void divide(){
        assertEquals(3, calculator.divide(15, 5));
    }

    @Test
    public void multiply(){
        assertEquals(30, calculator.multiply(10, 3));
    }

}
