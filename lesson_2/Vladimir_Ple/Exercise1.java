package javaElementary;

public class Exercise1 {
    public static void main(String[] args) {
        int a, b, c;
        a = Integer.parseInt(args[0]);
        b = Integer.parseInt(args[1]);
        c = Integer.parseInt(args[2]);
        if (a < b) {
            if (a < c) {
                System.out.println("min a " + a);
            }
        } else if (b < a) {
            if (b < c) {
                System.out.println("min b " + b);
            }
        } else if (c < a) {
            if (c < b) {
                System.out.println("min c " + c);
            }
        }
    }
}
