package HW9;

import java.util.HashSet;

import java.util.Set;

public class UniqueWordVocabulary {
    Set<String> vocabular = new HashSet<>();

    public void addWord(String word) {
    if (word!="") {
        vocabular.add(word);
    } else {
        System.out.println("Name not entered, this value no fixed in Set.");
    }
  }

public int getUniqueWords() {
        int count=vocabular.size();
        return count;
}

public void printToConsole () {
    System.out.println(vocabular);
    System.out.println("Books count in vocabulary: " + getUniqueWords());
}
}
