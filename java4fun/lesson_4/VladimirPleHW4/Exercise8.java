package com.company.VladimirPleHW4;

import java.util.ArrayList;

public class Exercise8 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        //Init arr
        for (int i = 100000; i <= 999999; i++) {
            arr.add(i);
        }
        for (int i = 0; i < arr.size(); i++) {
            int a, b, c, d, e, f;
            int sum1 = 0, sum2 = 0;

            a = arr.get(i) / 100000;
            b = arr.get(i) / 10000 % 10;
            c = arr.get(i) / 1000 % 10;
            d = arr.get(i) / 100 % 10;
            e = arr.get(i) / 10 % 10;
            f = arr.get(i) % 10;
            sum1 += a + b + c;
            sum2 += d + e + f;
            if (sum1 == sum2) {
                System.out.println(arr.get(i));
            }
        }
    }
}
