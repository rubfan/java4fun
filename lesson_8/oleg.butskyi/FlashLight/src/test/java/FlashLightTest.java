import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)

public class FlashLightTest {
    private FlashLight TFlashLight;
    int setbattery;

    @Parameterized.Parameters
    public static Collection setbattery() {
        return Arrays.asList(new Object[][]{{0}, {1}, {2}, {3}, {4}});
    }

    public FlashLightTest(int setbattery) {
        this.setbattery = setbattery;
    }

    @Before
    public void init() {
        TFlashLight = new FlashLight();
    }


    @Test
    public void TestFlashlightWhitelight() {
        TFlashLight.setBattery(setbattery);
        if (setbattery > 0) {
            TFlashLight.setWhiteLightON();
            Assert.assertTrue(TFlashLight.isWhiteLight());
            Assert.assertFalse(TFlashLight.isBlinkMode());
            Assert.assertFalse(TFlashLight.isRedLight());
            Assert.assertFalse(TFlashLight.isAllOFF());
        } else {
            TFlashLight.setAllOFF();
            Assert.assertFalse(TFlashLight.isWhiteLight());
            Assert.assertFalse(TFlashLight.isBlinkMode());
            Assert.assertFalse(TFlashLight.isRedLight());
            Assert.assertTrue(TFlashLight.isAllOFF());
        }
    }

    @Test
    public void TestFlashlightRedLight() {
        TFlashLight.setBattery(setbattery);
        if (setbattery > 1) {
            TFlashLight.setRedLightON();
            Assert.assertFalse(TFlashLight.isWhiteLight());
            Assert.assertFalse(TFlashLight.isBlinkMode());
            Assert.assertTrue(TFlashLight.isRedLight());
            Assert.assertFalse(TFlashLight.isAllOFF());
        } else {
            TFlashLight.setAllOFF();
            Assert.assertFalse(TFlashLight.isWhiteLight());
            Assert.assertFalse(TFlashLight.isBlinkMode());
            Assert.assertFalse(TFlashLight.isRedLight());
            Assert.assertTrue(TFlashLight.isAllOFF());
        }
    }

    @Test
    public void TestFlashlightBlinkMode() {
        TFlashLight.setBattery(setbattery);
        if (setbattery > 2) {
            TFlashLight.setBlinkModeON();
            Assert.assertFalse(TFlashLight.isWhiteLight());
            Assert.assertTrue(TFlashLight.isBlinkMode());
            Assert.assertFalse(TFlashLight.isRedLight());
            Assert.assertFalse(TFlashLight.isAllOFF());
        } else {
            TFlashLight.setAllOFF();
            Assert.assertFalse(TFlashLight.isWhiteLight());
            Assert.assertFalse(TFlashLight.isBlinkMode());
            Assert.assertFalse(TFlashLight.isRedLight());
            Assert.assertTrue(TFlashLight.isAllOFF());
        }
    }

    @Test
    public void TestFlashlighAllOff() {
        TFlashLight.setBattery(setbattery);
        TFlashLight.setAllOFF();
        Assert.assertFalse(TFlashLight.isWhiteLight());
        Assert.assertFalse(TFlashLight.isBlinkMode());
        Assert.assertFalse(TFlashLight.isRedLight());
        Assert.assertTrue(TFlashLight.isAllOFF());
    }
}
