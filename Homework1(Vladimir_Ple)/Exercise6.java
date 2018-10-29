package javaElementary;

public class Exercise6 {
    public static void main(String[] args) {
        int a, b;
        a = Integer.parseInt(args[0]);
        b = Integer.parseInt(args[1]);
        a -= 10;
        b -= 10;
        if (a < 0) {
            a = a * -1;
        }
        if (b < 0) {
            b = b * -1;
        }
        if (a < b) {
            System.out.println("The first number nearer to ten");
        } else if (b < a) {
            System.out.println("The second number nearer to ten");
        } else if (a == b) {
            System.out.println("The both numbers near to ten");
        } else {
            System.out.println("error");
        }
    }
}
