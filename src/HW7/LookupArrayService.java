package HW7;

public class LookupArrayService {

    //private int valueIndex;

//    public int getValueIndex() {
//        return valueIndex;
//    }

    public int findMax(int[] array) {
        int max;
       if (array.length == 0) {
            System.out.println("Array is empty");
            return 0;
        } else {
            max = array[0];
            for (int i = 0; i < array.length; i++) {
                if (array[i] > max) {
                    max = array[i];
                }
            }
        }
        return max;
    }

    public int findMin(int[] array) {
        int min;
      if (array.length == 0) {
            System.out.println("Array is empty");
            return 0;
        } else {
            min = array[0];
            for (int i = 0; i < array.length; i++) {
                if (array[i]<min) {
                    min = array[i];
                }
            }
        }
        return min;
    }

    public int indexOfMax(int[] array) {
        int index;
        int max;
        int maxNumberIndex = 0;
        if (array.length == 0) {
            System.out.println("Array is empty");
            return -1;
        } else {
            index =0;
            max = array[0];
            for (int i = 0; i < array.length; i++) {
                if (array[i] > max) {
                    max = array[i];
                    maxNumberIndex = index;
                }index++;
            }
        }
        return maxNumberIndex;
    }

    public int indexOfMin(int[] array) {
        int index;
        int min;
        int minNumberIndex = 0;
        if (array.length == 0) {
            System.out.println("Array is empty");
            return -1;
        } else {
            index =0;
            min = array[0];
            for (int i = 0; i < array.length; i++) {
                if (array[i] < min) {
                    min = array[i];
                    minNumberIndex = index;
                }index++;
            }
        }
        return minNumberIndex;
    }

    public int indexOf (int[] array, int value) {
        int valueIndex=0;
        int index;
        if (array.length == 0) {
            System.out.println("Array is empty");
            return -1;
        } else {
            index =0;
            System.out.println("Entered valus: "+value);
            for (int i = 0; i < array.length; i++) {
                if (array[i] == value) {
                    valueIndex = index;
              }index++;
            }
        }
        return valueIndex;
    }
}
