import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MakeDecimalBinaryTest {

    @Test
    public void decimalToBinary() {
        MakeDecimalBinary makeDecimalBinary = new MakeDecimalBinary(5);
        Assert.assertEquals(101, makeDecimalBinary.decimalToBinary());
    }
}