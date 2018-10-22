import java.util.Scanner;

public class HW4Arrays /*Tasks 5-7*/ {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Array length: ");
        int length = scan.nextInt();
        int array[] = new int[length];
        System.out.println("Enter elements: ");
        for (int i = 0; i < length; i++) {
            array[i] = scan.nextInt();
        }
        System.out.println("Task 5. How many elements to summarize?");
        int n = scan.nextInt();
        Fifth(array, n);
        System.out.println("Task 6. Minimum and maximum");
        Sixth(array, length);
        System.out.println("Task 7. Sums of even and odd");
        Seventh(array, length);
    }

    public static void Fifth(int array[], int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + array[i];
        }
        System.out.println("Sum = " + sum);
    }

    public static void Sixth(int array[], int length) {
        int min = array[0], max = array[0];
        for (int i = 1; i < length; i++) {
            if (array[i] < min) min = array[i];
            if (array[i] > max) max = array[i];
        }
        System.out.println("Min = " + min + "; Max = " + max);
    }

    public static void Seventh(int array[], int length) {
        int sumodd = 0, sumeven = 0;
        for (int i = 0; i < length; i++) {
            if ((array[i] % 2) == 0) sumeven += array[i];
            else sumodd += array[i];
        }
        System.out.println("Sum of even = " + sumeven + "; Sum of odd = " + sumodd);
    }


}

