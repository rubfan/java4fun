public class Task6 {
    public static void main(String[] args) {
        int[] array = {2, 3, 1, 3, 4, 4, 55, 3, 2, 22, 3, 4, 46, 0,112};
        sorted(array);
//        printArray(array);
        printMinMax(array);
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

    public static void printMinMax(int[] array) {
        System.out.println("Min = " + array[0] + ";");
        System.out.println("Max = " + array[array.length - 1] + ";");

    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);

        }
    }
}
