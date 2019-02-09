//9) Перевести число в двоичную систему счисления

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HW4_ninth_task {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter decimal number:");
        int number = Integer.parseInt(bufferedReader.readLine());
        System.out.println("Number in binary format:");
        System.out.println(convertDecimalToBinary(number));
    }

    private static int convertDecimalToBinary(int decimalNumber) {
        String reversedBinaryNumber = "";
        while(decimalNumber != 0) {
            Integer buf = decimalNumber % 2;
            reversedBinaryNumber += Integer.toString(buf);
            decimalNumber /= 2;
        }
        int binaryNumber = Integer.parseInt(reverseString(reversedBinaryNumber));
        return binaryNumber;
    }

    private static String reverseString(String string) {
        String reversedString = "";
        for(int i = string.length() - 1; i >= 0; i--) {
            reversedString += string.charAt(i);
        }
        return reversedString;
    }
}
