
import org.junit.Assert;
import org.junit.Test;


public class changeMailTest {

    @Test
    public void changingTest() {
        ChangeMail changeMail = new ChangeMail("person@gmail.com");
        Assert.assertEquals("person[ at ]gmail[ dot ]com", changeMail.changing());
    }
}
