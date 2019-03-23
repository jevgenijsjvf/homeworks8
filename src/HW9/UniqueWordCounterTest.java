package HW9;

public class UniqueWordCounterTest {
    public static void main(String[] args) {
        UniqueWordCounter counter = new UniqueWordCounter();
        counter.addWord("apple");
        counter.addWord("apple");
        counter.addWord("mango");
        counter.printToConsole();
        counter.returnFrequentlyEncounteredValue();
    }
}
