package HW9;


public class LibraryService {
    public static void main(String[] args) {
        LibraryService testRunner = new LibraryService();
        testRunner.test1();

    }

    public void test1() {
        Book book = new Book("vasilijs.f.", "Гредущие мечты");
        Library library = new Library();
        library.createBook(book);
        Book book1 = new Book("Пушкин", "Евгений Онегин");
        library.createBook(book1);
        Book book2 = new Book("Толстой", "Война и Мир");
        library.createBook(book2);
        Book book3 = new Book("Пушкин", "Жених");
        library.createBook(book3);
        System.out.println(library.getBooks());
        library.removeBook(book);
        System.out.println(library.getBooks());
        System.out.println();
        System.out.println(library.findByTitle("Война и Мир"));
        System.out.println(library.findByAuthor("Пушкин"));
        System.out.println();
        System.out.println("****************Test*****************************");
        int expectedResultOfListSize = 3;
        int actualResultOfListSize = library.getBooks().size();
        if (expectedResultOfListSize == actualResultOfListSize) {
            System.out.println("TEST CORRECT.List size are " + actualResultOfListSize + ".");
        } else {
            System.out.println("Test wrong. Expected size " + expectedResultOfListSize + ", but actual size " + actualResultOfListSize);
        }
    }
}
