package HW9;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class UniqueWordCounter {
    Map <String,Integer >  stringOfWords = new HashMap<>();
    int value=0;


    public int addWord(String key) {
      int count=0;
        if (key=="") {

            System.out.println("Your string is Empty, they don't added to Map");
       }
        else {
             if (stringOfWords.containsKey(key)) {
                 count++;
                 value=value+count;
                   stringOfWords.put(key,value);
            } else {
                stringOfWords.put(key,value);}
        }
        return value;
    }

    public int findMaxValueInMap () {
        int maxValueInMap = (Collections.max(stringOfWords.values()));
         return maxValueInMap;
    }

    public void printToConsole() {
           for (Map.Entry<String,Integer> entry: stringOfWords.entrySet()) {
            if (entry.getValue() == findMaxValueInMap()) {
                System.out.println(entry.getKey());
            }
        }

    }



}
