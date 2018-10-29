package javaElementary;

import java.io.IOException;

public class Exercise2 {
    public static void main(String[] args) {
        int a, b, c;
        a = Integer.parseInt(args[0]);
        b = Integer.parseInt(args[1]);
        c = Integer.parseInt(args[2]);
        System.out.println("min " + findMin(a, b, c));
        System.out.println("max " + findMax(a, b, c));
    }

    public static int findMin(int a, int b, int c) {
        if (a < b) {
            if (a < c) {
                return a;
            }
        } else if (b < a) {
            if (b < c) {
                return b;
            }
        } else if (c < a) {
            if (c < b) {
                return c;
            }
        }
        System.out.println("ERROR return zero!");
        return 0;
    }

    public static int findMax(int a, int b, int c) {
        if (a > b) {
            if (a > c) {
                return a;
            }
        } else if (b > a) {
            if (b > c) {
                return b;
            }
        } else if (c > a) {
            if (c > b) {
                return c;
            }
        }
        System.out.println("ERROR return zero!");
        return 0;
    }
}
