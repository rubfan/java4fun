public class Task10 {public static void main(String[] args) {
    int[] array = {2, 3, 1, 3, 4, 4, 55, 3, 2, 22, 3, 4, 46, 0,112};
    int printNamber = 5;
    sorted(array);
    Task10.printFirstMin(array, printNamber);

}
    public static void sorted(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                int max = array[j];
                if (max > array[j + 1]) {
                    int buffer = array[j + 1];
                    array[j + 1] = max;
                    array[j] = buffer;
                }

            }

        }
    }
    public static void printFirstMin(int [] array, int printNumber){
        for (int i = 0; i <printNumber; i++) {
            System.out.println(array[i] + " ;");

        }

    }
}
