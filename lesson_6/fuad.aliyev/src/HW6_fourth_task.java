//4) Есть массив с числами упорядоченными по возрастанию, нужно определить есть ли в этом массиве 2 числа, сумма которых равна "sum".

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter sum:");
        int sum = Integer.parseInt(bufferedReader.readLine());
        int array[] = {1, 5, 7, 9, 12};
        System.out.println(check(array, sum));
    }

    private static boolean check(int array[], int sum) {
        boolean sumIsEqualToTwelve = false;
        loop:
        for(int i = 0; i < array.length; i++)
            for(int j = i + 1; j < array.length; j++) {
                if((array[i] + array[j]) == sum) {
                    sumIsEqualToTwelve = true;
                    break loop;
                }
                else
                    sumIsEqualToTwelve = false;
                }
        return sumIsEqualToTwelve;
    }
}
