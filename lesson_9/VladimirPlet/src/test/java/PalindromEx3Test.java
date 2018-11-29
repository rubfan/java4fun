import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromEx3Test {

    @Test
    public void findPalindromsTest() {
        PalindromEx3 palindromEx3 = new PalindromEx3("deleveled, evitative, cat, dog, deified");
        Assert.assertEquals("Polindroms: 3", palindromEx3.findPalindroms());
    }
}