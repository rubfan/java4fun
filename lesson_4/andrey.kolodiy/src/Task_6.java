public class Task_6 {

    public static void main(String[] args) {

        int n = 10;
        int[] array = new int[n];
        array number = new array();
        number.initArray(array, 1, 10);
        number.printArray(array);
        number.selectionSort(array);
        number.printArrayMinMax(array, n);


    }
}

class array {

    public void initArray(int[] array, int left, int right) {

        for (int i = 0; i < array.length; i++) {

            array[i] = (int) Math.round(Math.random() * (right - left) + left);
        }
    }

    public void printArray(int[] array) {

        for (int i = 0; i < array.length; i++) {

            System.out.print(array[i] + ",");
        }
        System.out.println();
    }

    public void printArrayMinMax(int[] array, int n) {

        System.out.println("Min number : " + array[0] + " , " + " Max number : " + array[n - 1]);
    }

    public void selectionSort(int[] array) {

        for (int i = 0; i < array.length; i++) {

            int min = array[i];
            int min_i = i;

            for (int j = i + 1; j < array.length; j++) {

                if (array[j] < min) {
                    min = array[j];
                    min_i = j;
                }
            }

            if (i != min_i) {
                int tmp = array[i];
                array[i] = array[min_i];
                array[min_i] = tmp;
            }
        }
    }
}
