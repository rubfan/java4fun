import java.util.Scanner;

public class HW4Binary /*Task 9*/ {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Task 9. Translate number to binary system. \nPlease, enter the number: ");
        int number = scan.nextInt();
        String result = "";
        int a;
        while (number != 0) {
            a = number % 2;
            result = a + result;
            number = number / 2;
        }
        System.out.println("Result: " + result);
    }
}
