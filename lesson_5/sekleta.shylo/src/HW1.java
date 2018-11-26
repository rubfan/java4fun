public class HW1 {
  public static void main(String[] args) {
    createPascalTriangle(13);
  }

  public static int[][] createPascalTriangle(int n) {
    int[][] array = new int[n + 1][n + 1];

      if(n > 0) {
        for(int i = 0; i < array.length; i++) {
          getFormTriangle(array, i);

            for(int j = 0; j < array[0].length; j++) {
              if(j > i) {
                break;
              }
              if((i > j) && (j > 0)) {
                array[i][j] = array[i - 1][j - 1] + array[i - 1][j];
              } else {
                array[i][j] = 1;
                }
                  System.out.print(array[i][j] + "   ");
            }
              System.out.println();
         }
       } else {
         System.out.println("Negative number");
     }
      return array;
  }

  public static void getFormTriangle(int[][] array, int i) {
    for(int k = i; k < array.length; k++) {
      System.out.print("  ");
    }
  }
}
