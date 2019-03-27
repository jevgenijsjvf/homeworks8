package HW9;

import java.util.HashMap;
import java.util.Map;

public class UniqueWordCounter {
    private Map<String, Integer> stringOfWords = new HashMap<>();
    int value = 1;


    public int addWord(String key) {
        if (key.isEmpty()) {
            System.out.println("Your string is Empty, they don't added to Map");
        } else {
            if (stringOfWords.containsKey(key)) {
                int x = stringOfWords.get(key);
                x++;
                stringOfWords.put(key, x);
            } else {
                stringOfWords.put(key, value);
            }
        }
        return value;
    }

    public int findMaxValueInMap() {
        int max = 0;
        for (int value : stringOfWords.values()) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }

    public void printToConsole() {
        System.out.println(stringOfWords);

        for (Map.Entry<String, Integer> entry : stringOfWords.entrySet()) {
            if (entry.getValue() == findMaxValueInMap()) {
                System.out.println("Max value in map is: " + entry.getKey());
            }

        }

    }


}
