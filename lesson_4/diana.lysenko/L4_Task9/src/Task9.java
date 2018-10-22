import java.util.Scanner;

public class Task9 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = scan.nextInt();
        System.out.println("Binary translation: " + Integer.toBinaryString(number));
    }

}
