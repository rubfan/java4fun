

import java.util.Scanner;

public class HW3 {
    public static void main(String[] args) {
        System.out.print("Input the first number-> ");
        Scanner sc = new Scanner(System.in);
        int firstNum = sc.nextInt();

        System.out.print("Input the second number-> ");
        int secondNum = sc.nextInt();

        System.out.println("The sum of numbers is: " + sumOfNumbers(firstNum, secondNum));
    }

    public static int sumOfNumbers(int a, int b) {
        int c;
        c = a + b;
        return c;
    }
}

