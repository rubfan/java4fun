//6) Найти минимальный и максимальный элемент массива

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HW4_sixth_task {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter array:");
        int array[] = new int[5];
        for(int i = 0; i < array.length; i++)
            array[i] = Integer.parseInt(bufferedReader.readLine());
        System.out.println("Max number is " + maxNumberOfArray(array));
        System.out.println("Min number is " + minNumberOfArray(array));
    }

    private static int maxNumberOfArray(int array[]) {
        int max = array[0];
        for(int i = 0; i < array.length; i++)
            if(array[i] >= max)
                max = array[i];
        return max;
    }

    private static int minNumberOfArray(int array[]) {
        int min = array[0];
        for(int i = 0; i < array.length; i++)
            if(array[i] <= min)
                min = array[i];
        return min;
    }
}
