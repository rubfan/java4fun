//1. Напишите программу, которая заменяет символы в почтовом адресе пользователя:
//@ заменяется на [ at ]
//. заменяется на [ dot ]
//Пример ввода:
//person@gmail.com
//Результат:
//person[ at ]gmail[ dot ].com

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HW9_first_task {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String email = bufferedReader.readLine();
        System.out.println(formatSymbolToAt(formatSymbolToDot(email)));
    }

    private static String formatSymbolToAt(String emailWithAtSymbol) {
        String emailWithoutAtSymbol = emailWithAtSymbol.replace("@", "[ at ]");
        return  emailWithoutAtSymbol;
    }

    private static String formatSymbolToDot(String emailWithDotSymbol) {
        String emailWithoutDotSymbol = emailWithDotSymbol.replace(".", "[ dot ]");
        return emailWithoutDotSymbol;
    }
}
