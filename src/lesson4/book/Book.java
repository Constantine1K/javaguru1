package lesson4.book;

public class Book {

    private int pageCount;
    private String author;
    private String isbn;
    private String name;

    public Book(String name, int pageCount){
        setName(name);
        setPageCount(pageCount);
    }

    public Book(int pageCount, String author){
        setPageCount(pageCount);
        setAuthor(author);
    }

    public Book(String name, int pageCount, String isbn){
        setName(name);
        setPageCount(pageCount);
        setIsbn(isbn);
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        if (pageCount > 0) {
            this.pageCount = pageCount;
        }
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() > 150) {
            name = name.substring(0, 150);
        }
        this.name = name;
    }
}
