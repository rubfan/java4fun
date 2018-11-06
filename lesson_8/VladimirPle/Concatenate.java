package lesson_8.VladimirPle;

import java.util.Arrays;

public class Concatenate {
    int[]arr1;
    int[] arr2;

    public Concatenate( int[] arr1, int[] arr2) {
        this.arr1 = arr1;
        this.arr2 = arr2;
    }

    public int[] concatenetaArrays() {
        int[] finishArr = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            finishArr[i] = arr1[i];
        }
        int j = 0;
        for (int i = arr1.length; i < finishArr.length; i++) {
            finishArr[i] = arr2[j];
            j++;
        }
        Arrays.sort(finishArr);

        return finishArr;
    }
}
