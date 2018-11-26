package com.company.VladimirPleHW4;

import java.util.ArrayList;

public class Exercise11 {
    public static void main(String[] args) {
        int a = 555555;
        someMethod(a);
    }

    private static void someMethod(int a) {
        int number = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        while (true) {
            number = a % 10;
            a /= 10;
            arr.add(number);
            if (a == 0) {
                break;
            }
        }
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
        }
        if (sum >= 0 && sum < 10) {
            System.out.println(sum);
        } else {
            someMethod(sum);
        }
    }
}
