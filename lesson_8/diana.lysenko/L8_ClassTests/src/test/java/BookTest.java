import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class BookTest {
    private Book book;

    private String name;
    private String author;

    @Before
    public void init() {
        book = new Book("The Picture of Dorian Gray", "Oscar Wilde");
    }

    @Test
    public void buyBookTest() {
        book.buyBook();
        assertTrue(book.isBought);
    }

    @Test
    public void readBookTest() {
        book.readBook();
        assertTrue(book.isRead);
    }

    @Test
    public void ShelfTest() {
        String shlf = "Shelf 1";
        book.putOnTheShelf(shlf);
        assertEquals(shlf,book.shelf);
    }



}
