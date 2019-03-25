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
        counter.findMaxValueInMap();
        counter.printToConsole();

        int expectedResult = 3;
        int actualResult = counter.findMaxValueInMap();
        if (expectedResult==actualResult ) {
            System.out.println("Test is correct.");
        } else {
            System.out.println("Test is wrong. Expected Max value in map must be: "+ expectedResult + " but, we have: " +expectedResult);
        }
    }
}
