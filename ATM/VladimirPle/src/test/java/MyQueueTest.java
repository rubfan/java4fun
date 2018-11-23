import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class MyQueueTest {
    MyQueue queue = new MyQueue(100);

    @Test
    public void pop() {
        Assert.assertThat(queue.pop(), is(0));
    }

    @Test
    public void push() {
        Assert.assertThat(queue.push(25), is(true));
        Assert.assertThat(queue.pop(), is(25));
        Assert.assertThat(queue.pop(), is(0));
    }
}