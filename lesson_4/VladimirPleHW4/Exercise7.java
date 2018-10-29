package com.company.VladimirPleHW4;

import static com.company.VladimirPleHW4.Exercise5.fullArr;

public class Exercise7 {
    public static void main(String[] args) {
        int[] arr = new int[20];
        fullArr(arr);
        Integer even = new Integer(0);
        Integer odd = new Integer(0);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                even += arr[i];
            } else if (arr[i] % 2 != 0) {
                odd += arr[i];
            } else {
                System.out.println("Error");
            }
        }
        System.out.println("even" + " " + even);
        System.out.println("odd" + " " + odd);
    }
}
