import java.util.Scanner;

public class HomeWork2Lesson5dSpiral {

    int checkStatement;
    int ItterationOnlyOnce = 1;
    int checkPointI = 0;
    int checkPointJ = 0;
    int number = 1;
    int sizeOfArray;
    int cellsInArray;

    public int getCountCellsInArray() {
        return cellsInArray = sizeOfArray * sizeOfArray;
    }


    public int initSizeOfArray() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Write a size of matrix not bigger than 100");
        do {
            sizeOfArray = scan.nextInt();

        } while (sizeOfArray > 100 | sizeOfArray < 0);
        return sizeOfArray;
    }

    public void fillArrayFromLeftToRightStart(int[][] array) {
        for (int i = checkPointI; i < ItterationOnlyOnce; i++) {
            for (int j = checkPointJ; j < array.length; j++) {
                checkPointI = i;
                checkPointJ = j;
                array[i][j] = number;
                number++;
                cellsInArray --;
            }
        }
    }

    public void fillArrayFromUpToDown(int[][] array) {
        for (int j = checkPointJ; j == checkPointJ; j--) {
            for (int i = checkPointI + 1; i < array.length; i++) {
                checkStatement = array[i][j];
                if (checkStatement == 0) {
                    checkPointI = i;
                    checkPointJ = j;
                    array[i][j] = number;
                    number++;
                    cellsInArray --;
                } else {
                    break;
                }
            }
        }
    }

    public void fillArrayFromRightToLeft(int[][] array) {
        for (int i = checkPointI; i == checkPointI; i--) {
            for (int j = checkPointJ - 1; j >= 0; j--) {
                checkStatement = array[i][j];
                if (checkStatement == 0) {
                    checkPointI = i;
                    checkPointJ = j;
                    array[i][j] = number;
                    number++;
                    cellsInArray --;
                } else {
                    break;

                }
            }
        }
    }

    public void fillArrayFromDownToUp(int[][] array) {
            for (int j = checkPointJ; j == checkPointJ; j++) {
                for (int i = checkPointI - 1; i > - 1; i--) {
                    checkStatement = array[i][j];
                    if (checkStatement == 0) {
                        checkPointI = i;
                        checkPointJ = j;
                        array[i][j] = number;
                        number++;
                        cellsInArray --;
                    } else {
                        break;
                    }

                }
            }

        }
    public void fillArrayFromLeftToRight (int[][] array) {
        for (int i = checkPointI; i == checkPointI; i++) {
            for (int j = checkPointJ + 1; j < array.length; j++) {
                checkStatement = array[i][j];
                if (checkStatement == 0) {
                    checkPointI = i;
                    checkPointJ = j;
                    array[i][j] = number;
                    number++;
                    cellsInArray--;
                } else {
                    break;
                }
            }
        }
    }
    public void printSpiralArray (int [][] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(" ");
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + "\t");

            }

        }
    }
}