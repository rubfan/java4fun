package javaElementary;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise4 {
    public static void main(String[] args) throws IOException {
        /*BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(bufferedReader.readLine());*/
        int a = Integer.parseInt(args[0]);
        if (a % 2 == 0) {
            System.out.println("The number is even");
        } else if (a % 2 != 0) {
            System.out.println("The number is odd");
        } else
            System.out.println("Error");
    }
}
