import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class RectangleTest {

    @Test
    public void getPerimeter() {
        Rectangle rectangle = new Rectangle(5, 9);
        Assert.assertEquals(28, rectangle.getPerimeter());
    }

    @Test
    public void getArea(){
        Rectangle rectangle = new Rectangle(5,10);
        Assert.assertEquals(50,rectangle.getArea());
    }
}