public class L5_Task2 {

    public static void main(String[] args) {
        int n = 4;
        int a[][] = new int[n][n];
        int k = n*n;   // quantity of elements left
        int num = 0;   // numbers in array
        int x = 0;    // index for rows
        int y = -1;   // index for cols
        int dX = 0;   // shift of rows
        int dY = 0;   // shift of cols

        do {
            while (y < (n - 1 - dY)) {
                y++;
                a[x][y] = ++num;
                k--;
                System.out.println("a[" + x + y + "]=" + a[x][y]);

            }
            System.out.println("------------");
            while (x < (n - 1 - dX)) {
                x++;
                a[x][y] = ++num;
                k--;
                System.out.println("a[" + x + y + "]=" + a[x][y]);
            }
            System.out.println("------------");
            while (y > (0 + dY)) {
                y--;
                a[x][y] = ++num;
                k--;
                System.out.println("a[" + x + y + "]=" + a[x][y]);
            }
            System.out.println("------------");
            dX++;
            while (x > (0 + dX)) {
                x--;
                a[x][y] = ++num;
                k--;
                System.out.println("a[" + x + y + "]=" + a[x][y]);
            }
            System.out.println("------------");
            dY++;
        } while (k != 0);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + "  ");
            }
            System.out.println();
        }
    }

}
