package ourLesson;

public class BookTest {
    public static void main(String[] args) {
        Book firstBook = new Book();
        firstBook.setAuthor("Jevgenijs");
        firstBook.setTitle("JavaGuru");
        firstBook.setPageCount(1001);
        firstBook.setYear(2019);
        System.out.println("Author: " + firstBook.getAuthor());
        System.out.println("Title: " + firstBook.getTitle());
        System.out.println("Pages: " + firstBook.getPageCount());
        System.out.println("Year: " + firstBook.getYear());

    }
}
