public class HomeWork2Lesson5AppSpiral {
    public static void main(String[] args) {

        HomeWork2Lesson5dSpiral spiralFillArray = new HomeWork2Lesson5dSpiral();

        int sizeOfArray = spiralFillArray.initSizeOfArray();
        int [][] array = new int[sizeOfArray][sizeOfArray];
        spiralFillArray.getCountCellsInArray();

        spiralFillArray.fillArrayFromLeftToRightStart(array);

        while (spiralFillArray.cellsInArray > 0){

            spiralFillArray.fillArrayFromUpToDown(array);
            spiralFillArray.fillArrayFromRightToLeft(array);
            spiralFillArray.fillArrayFromDownToUp(array);
            spiralFillArray.fillArrayFromLeftToRight(array);
        }

        spiralFillArray.printSpiralArray(array);

    }
}
