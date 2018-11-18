import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TriangleTest {

    @Test
    public void getPerimeter() {
        Figure triangle = new Triangle(2,2,5);
        Assert.assertEquals(9,triangle.getPerimeter());
    }
    @Test
    public void getArea(){
        Triangle triangle = new Triangle(3,4,5);
        Assert.assertEquals(6,triangle.getArea());
    }
}