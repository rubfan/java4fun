package javaElementary;

public class Exercise5 {
    public static void main(String[] args) {
        int a, b;
        a = Integer.parseInt(args[0]);
        b = Integer.parseInt(args[1]);
        if (a % b == 0) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
