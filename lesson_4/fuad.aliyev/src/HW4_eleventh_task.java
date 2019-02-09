//11) Write  a program to repeatedly add all the digits until the result has only one digit of a given non-negative number:
//The digital root of 555555 = 5 + 5 + 5 + 5 + 5 + 5 = 30 = 3 + 0 = 3

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number:");
        int number = Integer.parseInt(bufferedReader.readLine());
        convert(number);
    }

    private static void convert(int number) {
        int sum = 0;
        if(number > 9)
            while(number != 0) {
                sum += (number % 10);
                number /= 10;
                if(number == 0) {
                    System.out.println(sum);
                    convert(sum);
                }
            }
    }
}
