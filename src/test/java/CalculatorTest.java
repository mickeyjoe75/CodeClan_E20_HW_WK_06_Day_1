import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class CalculatorTest {

    private Calculator newMath;

    @Before
    public void before(){
        newMath = new Calculator(1,1);
    }


    @Test
    public void doSum(){
        assertEquals(2, newMath.doSum());
    }

    @Test
    public void doSubtract(){
        assertEquals(0, newMath.doSubract());
    }

    @Test
    public void doMultiply(){
        assertEquals(1, newMath.doMultiply());
    }

    @Test
    public void doDivide(){
        assertEquals(1, newMath.doDivide());
    }








}
