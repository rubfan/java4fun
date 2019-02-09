//1) Напишите программу, которая выводит n-ый член последовательности Фибоначчи:
//Последовательность Фибоначчи - первые 2 элемента равны 1, каждый следующий равен сумме двух предыдущих:
//1 1 2 3 5 8 13 21 34 55 ...
//Также определите сложность вашего решения
//Задачу нужно решить с рекурсией и без ее использования

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HW10_task_with_recursion {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        showNthElementOfSequence(n, 1,0,1);
    }

    private static void showNthElementOfSequence(int n, int previousNumber, int beforePreviousNumber, int nthNumber) {
        if(n > 1) {
            nthNumber = previousNumber + beforePreviousNumber;
            beforePreviousNumber = previousNumber;
            previousNumber = nthNumber;
            n--;
            showNthElementOfSequence(n, previousNumber, beforePreviousNumber, nthNumber);
        }
        else
            System.out.println(nthNumber);
    }
}
