package com.company.VladimirPleHW4;

import static com.company.VladimirPleHW4.Exercise5.fullArr;

public class Exercise6 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        fullArr(arr);
        System.out.println("min " + findMinElement(arr));
        System.out.println("max " + findMaxElement(arr));


    }

    private static Integer findMaxElement(int[] arr) {
        Integer max = new Integer(0);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    private static Integer findMinElement(int[] arr) {
        Integer min = new Integer(0);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}
