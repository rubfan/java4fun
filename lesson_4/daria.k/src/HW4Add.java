import java.util.Scanner;

public class HW4Add /*Task 11*/ {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Task 11. Please enter the number: ");
        int number = scan.nextInt();
        int result = 0;
        while (number > 0 || result > 9) {
            if (number == 0) {
                number = result;
                result = 0;
            }
            result += number % 10;
            number /= 10;
        }
        System.out.println(result);
    }
}
