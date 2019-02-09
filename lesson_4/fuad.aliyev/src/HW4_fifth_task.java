//5) Найти сумму первых n элементов массива

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HW4_fifth_task {

    public static void main(String[] args) throws IOException {
        int [] array = new int[10];
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter n:");
        int n = Integer.parseInt(bufferedReader.readLine());
        if(n < array.length) {
            System.out.println("Enter array of numbers:");
            for(int i = 0; i < array.length; i++)
                array[i] = Integer.parseInt(bufferedReader.readLine());
            System.out.println(addNElementsOfArray(n, array));
        }
        else
            System.out.println("Can't be done, because array is shorter than n");
    }

    private static int addNElementsOfArray(int n, int[] array) {
        int sum = 0;
        for(int i = 0; i < n; i++) {
            sum += array[i];
        }
        return sum;
    }
}
