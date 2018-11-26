import java.util.Random;

public class Task6 {

    public static void main(String[] args) {
        int num[] = initArray(1, 100, 5);
        System.out.print("Array: ");
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
        System.out.println();
        int min = num[1];
        int max = num[1];
        for (int i = 1; i < num.length; i++) {
            if (num[i] < min) {
                min = num[i];
            }
            if (num[i] > max) {
                max = num[i];
            }
        }
        System.out.println("Min = " + min + "  Max = " + max);
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
