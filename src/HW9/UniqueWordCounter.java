package HW9;

import java.util.HashMap;
import java.util.Map;

public class UniqueWordCounter {
    Map <String,Integer >  stringOfWords = new HashMap<>();
    int count;

    public int addWord(String word) {
        this.count=count;
        count=0;
        if (word !="") {
            if (stringOfWords.containsKey(word)) {
                    count++;
            } stringOfWords.put(word,count);
        }return count;
    }

    public void printToConsole() {
        System.out.println("stringOfWords = " + stringOfWords);
    }

    public void returnFrequentlyEncounteredValue () {
        for (Map.Entry<String,Integer> entry: stringOfWords.entrySet()) {

        }

    }

}
