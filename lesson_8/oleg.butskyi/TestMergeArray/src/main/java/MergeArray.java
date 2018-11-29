public class MergeArray {

    public int[] mergeArraysSorted(int[] firstArray, int[] secondArray) {
        int sizeOfThirdArray = firstArray.length + secondArray.length;
        int[] Array = new int[sizeOfThirdArray];
        int firstArrayMinIndex = 0, firstArrayCounter = 0;
        int secondArrayMinIndex = 0, secondArrayCounter = 0;

        for (int i = 0; i < Array.length; i++) {
            for (int j = firstArrayCounter; j < firstArray.length; j++) {
                Array[i] = firstArray[j];
                firstArrayCounter++;
                i++;
                break;
            }
            for (int q = secondArrayCounter; q < secondArray.length; q++) {
                Array[i] = secondArray[q];
                secondArrayCounter++;
                break;
            }
        }
        return Array;

    }
}