import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TipsWithPolimorphismTest {
    TipsWithPolimorphism tipsWithPolimorphism = new TipsWithPolimorphism(1000);

    @Test
    public void getTips() {
        Assert.assertEquals(1000, (int) tipsWithPolimorphism.getTips(new Terrible()));
    }

    @Test
    public void getTips1() {
        Assert.assertEquals(1050, (int) tipsWithPolimorphism.getTips(new Poor()));
    }

    @Test
    public void getTips2() {
        Assert.assertEquals(1100, (int) tipsWithPolimorphism.getTips(new Good()));
    }

    @Test
    public void getTips3() {
        Assert.assertEquals(1150, (int) tipsWithPolimorphism.getTips(new Great()));
    }

    @Test
    public void getTips4() {
        Assert.assertEquals(1200, (int) tipsWithPolimorphism.getTips(new Exellent()));
    }
}