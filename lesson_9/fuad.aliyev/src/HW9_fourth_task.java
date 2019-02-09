//4. Напишите перевод из 10ной системы счисления в 2ную с помощью рекурсии.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HW9_fourth_task {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int decimalNumber = Integer.parseInt(bufferedReader.readLine());
        String binaryNumber = "";
        convertDecimalToBinary(decimalNumber, binaryNumber);
    }

    private static void convertDecimalToBinary(int decimalNumber, String binaryNumber) {
        if(decimalNumber != 0) {
            binaryNumber += String.valueOf(decimalNumber % 2);
            decimalNumber /= 2;
            convertDecimalToBinary(decimalNumber, binaryNumber);
        }
        else {
            binaryNumber = new StringBuilder(binaryNumber).reverse().toString();
            System.out.println(binaryNumber);
        }
    }
}
