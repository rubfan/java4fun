import java.util.Arrays;

public class L5_Task1 {

    public static void main(String[] args) {
        // Pascal`s triangle

        int n = 6; // rows and depth of the triangle

        int p_tr[][] = pascalTriangle(n);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < p_tr[0].length; j++) {
                if (p_tr[i][j] == 0) {
                    System.out.print("  ");
                } else {
                    System.out.print(p_tr[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

    private static int[][] pascalTriangle(int n) {
        int m = 2*n-1; // columns
        int[][] p_tr = new int[n][m];

        for (int[] row : p_tr) {
            Arrays.fill(row, 0); // fill with 0
        }

        int v = (int) Math.ceil((double)m/2) - 1;
        p_tr[0][v] = 1;              // vertex of the triangle;

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if ((j != 0) && (j != m - 1)) {
                    p_tr[i][j] = p_tr[i-1][j-1] + p_tr[i-1][j+1];
                } else if (j == 0) {
                    p_tr[i][j] = p_tr[i-1][j+1];
                } else {
                    p_tr[i][j] = p_tr[i-1][j-1];
                }
            }
        }
        return p_tr;
    }

}
