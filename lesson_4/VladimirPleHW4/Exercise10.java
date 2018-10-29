package com.company.VladimirPleHW4;

public class Exercise10 {
    public static void main(String[] args) {
        int arr[] = new int[8];
        arr[0] = 5;
        arr[1] = 4;
        arr[2] = 6;
        arr[3] = 8;
        arr[4] = 3;
        arr[5] = 1;
        arr[6] = 0;
        arr[7] = -23423;
        int counter = 1;
        int min = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                min = arr[i];
                System.out.println(min);
            } else if (i != 0 && arr[i] < min) {
                min = arr[i];
                System.out.println(min);
                counter++;
            }
            if (counter == 5) {
                break;
            }
        }
    }
}
