import org.junit.Test;

import static org.junit.Assert.*;

public class FibonachiTest {
    Fibonachi fibonachi = new Fibonachi(77);

    @Test
    public void fibonachiRecursion() {
        fibonachi.fibonachiRecursion();
    }

    @Test
    public void fibonachi() {
        fibonachi.fibonachi();
    }
}