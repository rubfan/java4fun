package lesson_6.VladimirPle;


import java.util.Arrays;

import static Methods.PrintArray.printArr;


public class Exercise2 {
    public static void main(String[] args) {
        int[] arr1 = new int[10];
        int[] arr2 = new int[5];
        fullArrs(arr1, arr2);
        printArr(concatenetaArrays(arr1, arr2));
    }

    private static int[] concatenetaArrays(int[] arr1, int[] arr2) {
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

    private static void fullArrs(int[] arr1, int[] arr2) {
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = (int) (Math.random() * 20 + 1);
        }
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = (int) (Math.random() * 20 + 1);
        }
    }
}
