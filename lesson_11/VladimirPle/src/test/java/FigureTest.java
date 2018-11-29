import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FigureTest  {

    @Test
    public void getPerimeter() {
        Figure figure = new Figure(5);
        Assert.assertEquals(20,figure.getPerimeter());
    }

    @Test
    public void getArea(){
        Figure figure = new Figure(5);
        Assert.assertEquals(25,figure.getArea());
    }
}