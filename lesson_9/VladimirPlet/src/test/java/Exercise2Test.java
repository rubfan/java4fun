
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class Exercise2Test {

    @Test
    public void cutSentense() {
        Exercise2 exercise2 = new Exercise2();
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("aaa");
        arr.add("bbb");
        arr.add("ccc");
        String st = "aaa bbb ccc";
        exercise2.cutSentense(st);
        Assert.assertEquals(arr, exercise2.strArr);
    }

    @Test
    public void cutWords() {
        Exercise2 exercise2 = new Exercise2();
        Assert.assertEquals("d2f", exercise2.cutWords("dbcf"));
        Assert.assertEquals("cat", exercise2.cutWords("cat"));
    }
}