public class HW10 {
    public static void main(String[] args) {
        int[] myArray = {4, 6, 3, 6, 1, 7, 9, 5, 3, 0, 3};

        bubbleSort(myArray);
        firstFiveMinValues(5, myArray);
    }

    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[i] < arr[j]) {
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
    }

    public static void firstFiveMinValues(int five, int[] arr) {
        for (int i = 0; i < five; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
