import java.util.Scanner;

public class HW4Mins /*Task10*/ {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Array length (min 5 elements): ");
        int length = scan.nextInt();
        int array[] = new int[length];
        System.out.println("Enter elements: ");
        for (int i = 0; i < length; i++) {
            array[i] = scan.nextInt();
        }
        System.out.println("Task 10. First 5 minimal elements");
        Tenth(array, length);
    }

    public static void Tenth(int array[], int length) {
        int j1 = 0;
        int min1 = array[j1];
        for (int i = 0; i < length; i++) {
            if (array[i] < min1) {
                min1 = array[i];
                j1 = i;
            }
        }
        int j2;
        if (j1 == 0) j2 = 1;
        else j2 = 0;
        int min2 = array[j2];
        for (int i = 0; i != j1 && i < length; i++) {
            if (array[i] < min2) {
                min2 = array[i];
                j2 = i;
            }
        }
        int j3 = 0;
        while (j3 == j1 || j3 == j2) {
            j3++;
        }
        int min3 = array[j3];
        for (int i = 0; i != j1 && i != j2 && i < length; i++) {
            if (array[i] < min3) {
                min3 = array[i];
                j3 = i;
            }
        }
        int j4 = 0;
        while (j4 == j1 || j4 == j2 || j4 == j3) {
            j4++;
        }
        int min4 = array[j4];
        for (int i = 0; i != j1 && i != j2 && i != j3 && i < length; i++) {
            if (array[i] < min4) {
                min4 = array[i];
                j4 = i;
            }
        }
        int j5 = 0;
        while (j5 == j1 || j5 == j2 || j5 == j3 || j5 == j4) {
            j5++;
        }
        int min5 = array[j5];
        for (int i = 0; i != j1 && i != j2 && i != j3 && i != j4 && i < length; i++) {
            if (array[i] < min5) {
                min5 = array[i];
            }
        }

        System.out.println(min1 + " " + min2 + " " + min3 + " " + min4 + " " + min5);
    }
}
