import java.util.Scanner;

public class HW5Pascal {
    public static void main(String[] args) {
        System.out.println("Task 1. Enter size of triangle");
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt(), n = m * 2 - 1;
        int pascal[][] = new int[n][m];
        PascalTriangle(pascal, n, m);
        ArrayDisplay(pascal, n, m);
    }

    private static void PascalTriangle(int[][] array, int n, int m) {
        array[n / 2][0] = 1;
        int a, b;
        for (int i = 1; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (j != 0) a = array[j - 1][i - 1];
                else a = 0;
                if (j != n - 1) b = array[j + 1][i - 1];
                else b = 0;
                array[j][i] = a + b;
            }
        }
    }

    private static void ArrayDisplay(int[][] array, int n, int m) {
        for (int i = 0; i < m; i++) {
            System.out.println(" ");
            for (int j = 0; j < n; j++)
                System.out.print(array[j][i] + "");
    }
}
}