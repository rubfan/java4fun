//7) Найти сумму всех четных и сумму всех нечетных элементов массива

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HW4_seventh_task {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int array[] = new int[5];
        System.out.println("Enter array:");
        for(int i = 0; i < array.length; i++)
            array[i] = Integer.parseInt(bufferedReader.readLine());
        System.out.println("Sum of odd numbers: " + sumOfOddNumbersInArray(array));
        System.out.println("Sum of even numbers: " + sumOfEvenNumbersInArray(array));
    }

    private static int sumOfOddNumbersInArray(int array[]) {
        int sum = 0;
        for(int i = 0; i < array.length; i++)
            if(array[i] % 2 != 0)
                sum += array[i];
        return sum;
    }

    private static int sumOfEvenNumbersInArray(int array[]) {
        int sum = 0;
        for(int i = 0; i < array.length ; i++)
            if(array[i] % 2 == 0)
             sum += array[i];
        return sum;
    }
}
