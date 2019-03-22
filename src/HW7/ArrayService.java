package HW7;

import java.util.*;

public class ArrayService {



    public int[] create(int n) {
        int[] array = new int[n];
        System.out.print("Created ");
        return new int[n];
    }

    public void fillArrayWithRandomNumbers(int a[]) {
        Random random = new Random();
        for (int i = 0; i <= a.length - 1; i++) {
            a[i] = random.nextInt(101);
        }
        System.out.print("Filled ");
    }

    public void printArrayToConsole(int a[]) {
                System.out.println("arrays: " + Arrays.toString(a));

    }

    public int sumInArray(int a[]) {
        int sum = 0;
        for (int i = 0; i <= a.length - 1; i++) {
            sum = sum + a[i];
        }
        System.out.println("Addition is: " + sum);
        return sum;
    }

    public void sortArray(int a[]) {
        for (int i = 0; i < a.length; i++) {
            int min = a[i];
            int min_index = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < min) {
                    min = a[j];
                    min_index = j;
                }
            }
            if (i != min_index) {
                int current = a[i];
                a[i] = a[min_index];
                a[min_index] = current;
            }
        }
        System.out.print("Sorted ");
    }

    public void swap(int a[]) {
        for (int i = 0; i < a.length / 2; i++) {
            int j = a[i];
            a[i] = a[a.length - 1 - i];
            a[a.length - 1 - i] = j;

        }
        System.out.print("Swaped ");
    }
}