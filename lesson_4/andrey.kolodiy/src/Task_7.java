public class Task_7 {

    public static void main(String[] args) {

        int n = 10;
        int[] array = new int[n];
        array number = new array();
        number.initArray(array, 1, 10);
        number.printArray(array);
        System.out.println("Sum even numbers : " + number.sumEven(array));
        System.out.println("Sum not even numbers : " + number.sumNotEven(array));
    }
}

class array {

    public void initArray(int[] array, int left, int right) {

        for (int i = 0; i < array.length; i++) {

            array[i] = (int) Math.round(Math.random() * (right - left) + left);
        }
    }

    public int sumEven(int[] array) {

        int sum = 0;

        for (int i = 0; i < array.length; i++) {

            if ((array[i] % 2) == 0)

                sum += array[i];
        }
        return sum;
    }

    public int sumNotEven(int[] array) {

        int sum = 0;

        for (int i = 0; i < array.length; i++) {

            if ((array[i] % 2) != 0)

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
