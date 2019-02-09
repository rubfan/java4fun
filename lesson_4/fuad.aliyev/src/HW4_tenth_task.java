//10) Вывести первые 5 минимальных элементов массива

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HW4_tenth_task {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int array[] = new int[10];
        for(int i = 0; i < array.length; i++)
            array[i] = Integer.parseInt(bufferedReader.readLine());
	    array = sortArray(array);
        for(int i = 0; i < 5; i++)
		    System.out.println(array[i]);
    }

    private static int[] sortArray(int array[]) {
        int buf;
        for(int i = 0; i < array.length; i++) {
            int min = i;
            for(int j = i + 1; j < array.length; j++) {
                if(array[j] < array[min])
                    min = j;
            }
            buf = array[i];
            array[i] = array[min];
            array[min] = buf;
        }
        return array;
    }
}
