import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    WaterBottle waterBottle;

    @Before
    public void before() {
        waterBottle = new WaterBottle();
    }

    @Test
    public void hasVolume() {
        assertEquals(100, waterBottle.getVolume());
    }

    @Test
    public void hasDrunk(){
        waterBottle.drinkWater();
        assertEquals(90, waterBottle.getVolume());
    }

    @Test
    public void isEmpty(){
        waterBottle.emptyBottle();
        assertEquals(0, waterBottle.getVolume());
    }

    @Test
    public void canFill(){
        waterBottle.emptyBottle();
        assertEquals(0, waterBottle.getVolume());
        waterBottle.refillBottle();
        assertEquals(100, waterBottle.getVolume());
    }
}


