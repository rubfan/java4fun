package com.company.VladimirPleHW4;

public class Exercise9 {
    public static void main(String[] args) {
        int a = 7543;
        String dv = "";
        while (a > 0) {
            dv = dv + Integer.toString(a % 2);
            a /= 2;
        }
        System.out.println(dv);
    }
}
