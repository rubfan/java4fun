public class HomeWork2Lesson6 {
    public static void main(String[] args) {

        int[] firstArray = {1, 3, 5, 7, 9};
        int[] secondArray = {2, 4, 6, 8, 10};

        HomeWork2Lesson6 t2 = new HomeWork2Lesson6();
       int[] Array = t2.mergeArraysSorted(firstArray,secondArray);
        t2.printArray(Array);

    }

    public int[] mergeArraysSorted(int[] firstArray, int[] secondArray) {
        int sizeOfThirdArray = firstArray.length + secondArray.length;
        int[] Array = new int[sizeOfThirdArray];
        int firstArrayMinIndex = 0, firstArrayCounter = 0;
        int secondArrayMinIndex = 0, secondArrayCounter = 0;

        for (int i = 0; i < Array.length; i++) {
            for (int j = firstArrayCounter; j < firstArray.length; j++) {
                Array[i] = firstArray[j];
                firstArrayCounter ++;
                i++;
                break;
            }
            for (int q = secondArrayCounter; q < secondArray.length; q++) {
                Array[i] = secondArray[q];
                secondArrayCounter ++;
                break;
            }
        }

        return Array;
    }

    public void printArray (int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);

        }
    }
}

