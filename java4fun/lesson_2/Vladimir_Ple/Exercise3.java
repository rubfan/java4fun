package javaElementary;

public class Exercise3 {
    public static void main(String[] args) {
        int a, b, c;
        a = Integer.parseInt(args[0]);
        b = Integer.parseInt(args[1]);
        c = Integer.parseInt(args[2]);
        int min = 0;
        if (a <= b) {
            if (a <= c) {
                System.out.println("min a " + a);
                min = a;
            }
        } else if (b <= a) {
            if (b <= c) {
                System.out.println("min b " + b);
                min = b;
            }
        } else if (c <= a) {
            if (c <= b) {
                System.out.println("min c " + c);
                min = c;
            }
        }
        int[] arr = new int[3];
        arr[0] = a;
        arr[1] = b;
        arr[2] = c;
        for (int i = 0; i < arr.length; i++) {
            if (min == arr[i]) {
                System.out.println(arr[i] + " ======= ");
            }
        }
    }
}
