import java.util.Random;

public class Task8 {

    public static void main(String[] args) {
        System.out.println("Lucky numbers: ");
        for (int i = 100000; i <= 999999; i++) {
            int a = i;
            if (isLucky(a)) {
                System.out.println(a);
            }
        }
    }

    public static boolean isLucky(int a) {
        int arr[] = new int[6];
        for (int j = 0; j < 6; j++) {
            arr[j] = a % 10;
            a = a / 10;
        }
        int sum1 = 0;
        int sum2 = 0;
        for (int j = 0; j < 3; j++) {
            sum1 += arr[j];
        }
        for (int j = 3; j < 6; j++) {
            sum2 += arr[j];
        }
        if (sum1 == sum2) {
            return true;
        } else {
            return false;
        }
    }




}
