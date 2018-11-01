import java.util.Random;

public class Task7 {

    public static void main(String[] args) {
        int num[] = initArray(1, 30, 5);
        System.out.print("Array: ");
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
        System.out.println();
        int sum_even = sumEvenNumbers(num);
        int sum_uneven = sumUnevenNumbers(num);
        System.out.println("Sum even numbers = " + sum_even +
                " Sum uneven numbers = " + sum_uneven);
    }

    public static int[] initArray(int min, int max, int quantity) {
        int arr[] = new int[quantity];
        Random r = new Random();
        for (int i = 0; i < quantity; i++) {
            arr[i] = r.ints(min, (max + 1)).findFirst().getAsInt();
        }
        return arr;
    }

    public static int sumEvenNumbers(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] % 2) == 0) {
                sum += arr[i];
            }
        }
        return sum;
    }

    public static int sumUnevenNumbers(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] % 2) != 0) {
                sum += arr[i];
            }
        }
        return sum;
    }

}
