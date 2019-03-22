package HW4;

public class SignComparator {
    public String compare (int x) {
        if (x>0) {
            return "Number is positive";
        } else if (x<0) {
            return "Number is negative";
        } else {
            return "Number is equal to zero";
        }
    }
}
