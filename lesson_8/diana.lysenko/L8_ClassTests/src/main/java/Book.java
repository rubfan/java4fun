import java.awt.*;

public class Book {

    private String name;
    private String author;
    private int pages;
    private int year;
    private Image cover;
    public boolean isBought;
    public boolean isRead;
    public String shelf;

    public Book(String bname, String bauthor) {
        this.name = bname;
        this.author = bauthor;
        isBought = false;
        isRead = false;
    }

    public void buyBook() {
        if (!isBought) {
            isBought = true;
        } else {
            System.out.println("You`ve already bought this book!");
        }
    }

    public void readBook() {
        isRead = true;
    }

    public void putOnTheShelf(String shlf) {
        shelf = shlf;
    }

    public String getName() {
        return name;
    }

    /*public void setName(String name) {
        this.name = name;
    }*/

    public String getAuthor() {
        return author;
    }

    /*public void setAuthor(String author) {
        this.author = author;
    }*/

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Image getCover() {
        return cover;
    }

    public void setCover(Image cover) {
        this.cover = cover;
    }

}
