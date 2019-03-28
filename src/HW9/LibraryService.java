package HW9;


public class LibraryService {
    public static void main(String[] args) {
        LibraryService testRunner= new LibraryService();
        testRunner.test1();

    }

    public void test1() {
        Book book = new Book("vasilijs.f.", "Гредущие мечты");
        Library library = new Library();
        library.createBook(book);
        Book book1 = new Book("Пушкип", "Евгений Онегин");
        library.createBook(book1);
        Book book2 = new Book("Толстой", "Война и Мир");
        library.createBook(book2);
        Book book3 = new Book("Пушкип", "Жених");
        library.createBook(book3);
        System.out.println(library.getBooks());
        library.removeBookFFromLibrary(book);
        System.out.println(library.getBooks());
        System.out.println();
        library.findBookInLibraryByTitle("Война и Мир");
        library.findBookInLibraryByAuthor("Пушкип");
        System.out.println();
        int expectedResultOfListSize  =3;
        int actualResulOfListSize = library.getBooks().size();
        if (expectedResultOfListSize==actualResulOfListSize) {
            System.out.println("TEST CORRECT.List size are " +actualResulOfListSize+".");
        } else {
            System.out.println("Test wrong. Expected size "+expectedResultOfListSize + ", but actual size "+actualResulOfListSize);
        }
    }
}
