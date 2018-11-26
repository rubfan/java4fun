public class Task_5 {

    public static void main(String[] args) {

        int n = 10;
        int[] array = new int[n];
        array number = new array();
        number.initArray(array, 1, 10);
        number.printArray(array);
        System.out.println(number.sumNNumbers(array, 4));
    }
}

class array {

    public void initArray(int[] array, int left, int right) {

        for (int i = 0; i < array.length; i++) {

            array[i] = (int) Math.round(Math.random() * (right - left) + left);
        }
    }

    public int sumNNumbers(int[] array, int N) {
        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += array[i];
        }
        return sum;
    }

    public void printArray(int[] array) {

        for (int i = 0; i < array.length; i++) {

            System.out.print(array[i] + ",");
        }
        System.out.println();
    }
}
