package lesson4.book;

public class BookTest {

    public static void main(String[] args) {
        Book book = new Book("Some book", -1);
        System.out.println(book.getName());
        System.out.println(book.getPageCount());

        Book thinkingInJava = new Book("Thinking in java", 1050, "727253-262626-646464hfhf");
    }

}
