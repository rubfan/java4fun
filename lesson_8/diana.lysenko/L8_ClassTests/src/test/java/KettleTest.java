import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.*;
import java.util.*;

@RunWith(Parameterized.class)
public class KettleTest {

    Kettle kettle;
    private float capacity;
    private String material;
    private float volume;

    @Parameterized.Parameters(name= "{index}: {0}, {1}, {2}")
    public static Collection kttls() {
        return Arrays.asList(new Object[][]{
                {5, "plastic", 6}, // capacity, material, volume of water
                {0, "steel", 0},
                {1, "glass", 1},
                {20, "paper", 10}
        });
    }

    @Before
    public void init() {
        kettle = new Kettle(capacity, material);
    }

    public KettleTest(float cpct, String mtrl, float vlm) {
        this.capacity = cpct;
        this.material = mtrl;
        this.volume = vlm;
    }

    @Test
    public void pourWaterTest() {
        kettle.pourWater(volume);
        if (volume > kettle.getCapacity()) {
            assertEquals(0, kettle.getWaterIn(),0);
        } else {
            assertEquals(volume, kettle.getWaterIn(),0);
        }
    }

    @Test
    public void boilWaterTest() {
        kettle.pourWater(volume);
        kettle.boilWater();
        if (kettle.getWaterIn() != 0) {
            assertTrue(kettle.isBoiled());
        } else {
            assertFalse(kettle.isBoiled());
        }
    }

}
