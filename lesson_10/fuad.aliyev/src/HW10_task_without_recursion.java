//1) Напишите программу, которая выводит n-ый член последовательности Фибоначчи:
//Последовательность Фибоначчи - первые 2 элемента равны 1, каждый следующий равен сумме двух предыдущих:
//1 1 2 3 5 8 13 21 34 55 ...
//Также определите сложность вашего решения
//Задачу нужно решить с рекурсией и без ее использования

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HW10_task_without_recursion {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        System.out.println(showNthElementOfSequence(n));
    }

    private static int showNthElementOfSequence(int n) {
        int previousElement = 1;
        int beforePreviousElement = 0;
        int nthElement = 1;
        for(int i = 0; i < n - 1; i++) {
            nthElement = previousElement + beforePreviousElement;
            beforePreviousElement = previousElement;
            previousElement = nthElement;
        }
        return nthElement;
    }

}
