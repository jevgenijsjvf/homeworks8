package HW7;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Palindrome {

    public boolean isPalindrome(String string) {
        System.out.println("Your phrase: " + string);
        string = string.replace(" ", "");
        string = string.toLowerCase();
        char[] stringArray = string.toCharArray();
        char[] stringArrayNew = new char[stringArray.length];
        int j = stringArray.length - 1;
        for (int i = 0; i <= stringArray.length - 1; i++) {
            char n = stringArray[i];
            stringArrayNew[j] = stringArray[i];
            stringArrayNew[j] = n;
            j--;
        }

        if (Arrays.equals(stringArray, stringArrayNew)) {
            return true;
        } else {
            return false;
        }
    }

}
