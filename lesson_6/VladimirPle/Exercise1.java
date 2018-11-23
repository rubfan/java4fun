package lesson_6.VladimirPle;

import java.util.Arrays;

public class Exercise1 {
    public static void main(String[] args) {
        //O(n^2)
        int[] arr = {2, 3, 1, 4, 3, 6, 5, 7};
        int counter = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
                counter++;
            }
            int tmp = arr[i];
            arr[i] = arr[min];
            arr[min] = tmp;
            counter++;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("counter: " + counter);
    }
}
