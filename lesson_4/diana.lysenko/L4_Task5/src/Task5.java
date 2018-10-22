import java.util.Random;
import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {
        int num[] = initArray(1, 100, 20);
        System.out.print("Array: ");
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
        Scanner in = new Scanner(System.in);
        System.out.println();
        System.out.print("How many digits to summarize? ");
        int n = in.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += num[i];
        }
        System.out.println("Sum = " + sum);
    }

    public static int[] initArray(int min, int max, int quantity) {
        int arr[] = new int[quantity];
        Random r = new Random();
        for (int i = 0; i < quantity; i++) {
            arr[i] = r.nextInt((max - min) + 1) + min;
        }
        return arr;
    }
}
