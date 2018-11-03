public class HW6 {

    public static void main(String[] args) {
        int myArray[] = {3, 5, 7, 12, 4, 8, 20, 76, 1};

        bubbleSortForMin(myArray);
        System.out.println("Min element of the array is " + myArray[0]);

        bubbleSortForMax(myArray);
        System.out.println("Max element of the array is " + myArray[0]);
    }

    public static void bubbleSortForMin(int[] arr) {

        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
    }

    public static void bubbleSortForMax(int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] < arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
    }
}
