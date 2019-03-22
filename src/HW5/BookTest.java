package HW5;

public class BookTest {
    public static void main(String[]args) {
        Book bible = new Book("People", "Bible", 250);
        BookTest testRunner =new BookTest();
        System.out.println(bible);
        testRunner.test1();
        testRunner.test2();
        }

    public void test1() {
        Book bible = new Book("People", "Bible", 250);
        String expectedResult = "Bible";
        String actualResult = bible.getTitle();

        if (actualResult.equals(expectedResult)) {
            System.out.println("TEST1. Bible = Bible");
        } else {
            System.out.println("TEST1. bible != bible");
        }
    }

    public void test2() {
        Book bible = new Book("People", "Bible", 250);
        String expectedResult = "bible";
        String actualResult = bible.getTitle();

        if (actualResult.equals(expectedResult)) {
            System.out.println("TEST2. Bible = Bible");
        } else {
            System.out.println("Test2. bible != Bible");
        }
    }
}
