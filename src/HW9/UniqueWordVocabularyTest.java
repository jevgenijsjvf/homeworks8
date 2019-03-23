package HW9;

public class UniqueWordVocabularyTest {
    public static void main(String[] args) {
        UniqueWordVocabularyTest testRunner = new UniqueWordVocabularyTest();
       testRunner.test();
    }

    public void test(){
        UniqueWordVocabulary vocab = new UniqueWordVocabulary();
        vocab.addWord("first book");
        vocab.addWord("");
        vocab.addWord("third book");
        vocab.addWord("fourth book");
        vocab.printToConsole();
        int actualCount = vocab.getUniqueWords();
        int expextedCount = 3;
        if (actualCount==expextedCount) {
            System.out.println("TEST CORRECT. ");
        }else {
            System.out.println("TEST NOT CORRECT. Set size is " + actualCount + " but must be " +expextedCount);
        }
    }
}
