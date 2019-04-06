package HW10.Bookz;

public class BookRepositoryService {
    public static void main(String[] args) {
        BookRepositoryService service = new BookRepositoryService();
        service.test1();


    }

    public void test1() {
        BookRepository bookRepository = new BookRepository();
        Book item = new Book("1", "Onegins", "Pushkin", 256);
        bookRepository.save(item);
        Book item1 = new Book("2", "Voina i mir", "Tolstoj", 321);
        bookRepository.save(item1);
        Book item2 = new Book("3", "Gore ot uma", "Griboedov", 121);
        bookRepository.save(item2);
        bookRepository.printToConsole();
        try {
            System.out.println("Book which you search: " + bookRepository.findById("2"));
        } catch (ItemNotFoundException e) {
            e.printStackTrace();
        }
        try {
            System.out.println("Book which you search:  " + bookRepository.findById("52"));
        } catch (ItemNotFoundException e) {
            e.printStackTrace();
        }
       try {
            bookRepository.delete("2");
        } catch (ItemNotFoundException e) {
            e.printStackTrace();
        }
       try {
            bookRepository.delete("5");
        } catch (ItemNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println();
        bookRepository.printToConsole();

        System.out.println("FindAll: " + bookRepository.findAll());
        int expectedResult = 3;
        int actualResult = bookRepository.books.size();
        if (expectedResult==actualResult) {
            System.out.println( "TEST1 correct.");
        }else {
            System.out.println("TEST1 wrong. Expected map size "+expectedResult + " but actual map size is "+actualResult);
        }

    }
    }

