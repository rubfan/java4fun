import java.util.Scanner;

public class HW5Spiral {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Task 2. Enter size of matrix (N, M)");
        System.out.println("N:");
        int n = scan.nextInt();
        System.out.println("M:");
        int m = scan.nextInt();
        int array[][] = new int[n][m];
        Spiral(array, n, m);
        ArrayDisplay(array, n, m);
    }

    private static void Spiral(int[][] array, int n, int m) {
        int number = n * m, a = 0, b = n - 1;
        int num = 1;
        for (int i = 1; i <= n; i++) {
            array[i - 1][a] = num;
            num++;
        }
        int counter = 1;
        while (num < number) {
            for (int i = 1; i <= (m - counter); i++) {
                a++;
                array[b][a] = num;
                num++;
            }
            for (int i = 1; i <= (n - counter); i++) {
                b--;
                array[b][a] = num;
                num++;
            }
            counter++;
            for (int i = 1; i <= (m - counter); i++) {
                a--;
                array[b][a] = num;
                num++;
            }
            for (int i = 1; i <= (n - counter); i++) {
                b++;
                array[b][a] = num;
                num++;
            }
            counter++;
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

