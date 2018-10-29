package com.company.VladimirPleHW4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise5 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Be careful array's length = 9 Input n: ");
        int n = Integer.parseInt(bufferedReader.readLine());
        int[] arr = new int[9];
        fullArr(arr);
        Integer sum = new Integer(0);
        for (int i = 0; i < n; i++) {
            sum+=arr[i];
        }
        System.out.println(sum);
    }

    public static void fullArr(int[] arr) {
        Integer a = new Integer(2);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = a;
            a *= 2;
        }
    }
}
