
public class Task_10 {

    public static void main(String[] args) {

        int n = 10;
        int[] array = new int[n];
        array number = new array();
        number.initArray(array, 1, 10);
        number.selectionSort(array);
        number.printArrayMinElement(array, 5);
    }
}

class array {

    public void initArray(int[] array, int left, int right) {

        for (int i = 0; i < array.length; i++) {

            array[i] = (int) Math.round(Math.random() * (right - left) + left);
        }
    }


    public void printArrayMinElement(int[] array, int element) {

        for (int i = 0; i < element; i++) {

            System.out.print(array[i] + ",");
        }

        System.out.println();
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
