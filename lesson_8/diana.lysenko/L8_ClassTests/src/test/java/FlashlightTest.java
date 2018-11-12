import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class FlashlightTest {

    private Flashlight flashlight;

    private String name_fl;
    private int batteries;

    @Parameters()
    public static Collection fl() {
        return Arrays.asList(new Object[][]{
                {"fl0", 0},
                {"fl1", 1},
                {"fl2", 2},
                {"fl3", 3}
        });
    }

    @Before
    public void init() {
        flashlight = new Flashlight(name_fl, batteries);
    }

    public FlashlightTest(String name, int btr) {
        this.name_fl = name;
        this.batteries = btr;
    }

    @Test
    public void whiteLightONTest() {
        if (batteries >= 1) {
            flashlight.whiteLightON();
            assertTrue(flashlight.whiteLight);
        } else {
            assertFalse(flashlight.whiteLight);
        }
    }

    @Test
    public void whiteLightOFFTest() {
        assertFalse(flashlight.whiteLight);
    }

    @Test
    public void redLightONTest() {
        if (batteries >= 2) {
            flashlight.redLightON();
            assertTrue(flashlight.redLight);
        } else {
            assertFalse(flashlight.redLight);
        }
    }

    @Test
    public void redLightOFFTest() {
        assertFalse(flashlight.redLight);
    }

    @Test
    public void blinkONTest() {
        if (batteries >= 3) {
            flashlight.blinkON();
            assertTrue(flashlight.blink);
        } else {
            assertFalse(flashlight.blink);
        }
    }

    @Test
    public void blinkOFFTest() {
        assertFalse(flashlight.blink);
    }
}
