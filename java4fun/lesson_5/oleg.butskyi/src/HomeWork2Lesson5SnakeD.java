import java.util.Scanner;

public class HomeWork2Lesson5Snake {
    int scannedSize;
    final int NEED_DIVITE_FOR_IF_BY_2 = 2;
    private int temp = 1;

    public int scanAndCheck () {

        Scanner scan = new Scanner(System.in);
        System.out.println("Write a size of matrix not bigger than 100");
        do {
            scannedSize = scan.nextInt();

        } while (scannedSize > 100 | scannedSize < 0);
        return scannedSize;
    }

    public void fillTheArray(int [][] array) {

        for (int i = 0; i < array[0].length; i++) {

            if (i % NEED_DIVITE_FOR_IF_BY_2 == 0){
                for (int j = 0; j < array[1].length; j++) {
                    array [i] [j] = temp;
                    temp++;

                }
            }else{
                for (int j = array[1].length - 1; j > -1; j--) {
                    array [i] [j] = temp;
                    temp++;
                }
            }
        }

    }

    public void printTheArray(int [][] array) {
        for (int i = 0; i < array[0].length; i++) {

            for (int j = 0; j < array[1].length; j++) {
                System.out.print(array[i][j] + ", ");
            }
            System.out.println();
        }
    }
}
