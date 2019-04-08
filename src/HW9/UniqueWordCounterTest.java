package HW9;

public class UniqueWordCounterTest {
    public static void main(String[] args) {
        UniqueWordCounterTest testRunner = new UniqueWordCounterTest();
        testRunner.test1();
    }

    public void test1() {
        UniqueWordCounter counter = new UniqueWordCounter();
        counter.addWord("apple");
        counter.addWord("apple");
        counter.addWord("mango");
        counter.addWord("apple");
        counter.addWord("apple");
        counter.printToConsole();
        System.out.println(counter.findMaxString());

        String expectedResult = "apple";
        String actualResult = counter.findMaxString();
        if (expectedResult.equals(actualResult)) {
            System.out.println("Test is correct.");
        } else {
            System.out.println("Test is wrong. Expected elements in find Max maps must be: " + expectedResult + " but, we have: " + actualResult);
        }
   }
}
