//3. Определить является ли слово палиндромом, т.е. читается одинаково, слева направо и справа налево.
//Определить количество таких слов в тексте, в котором все слова введены через запятую.
//Пример ввода:
//deleveled, evitative, cat, dog, deified
//Результат:
//There are 3 palindromes in the text
//PS: используйте метод split c параметром "," и потом метод trim, чтобы удалить лишние пробелы слева и справа

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HW9_third_task {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String unsplittedString = bufferedReader.readLine();
        String splittedStrings[] = unsplittedString.split(",");
        int count = 0;
        for(String splittedString: splittedStrings) {
            if(checkIfWordIsPalindrome(splittedString.trim()))
                count++;
        }
        System.out.println("There are " + count + " palindromes in the text");
    }

    private static boolean checkIfWordIsPalindrome(String word) {
        StringBuilder reversedWord = new StringBuilder(word).reverse();
        if(word.equals(reversedWord.toString()))
            return true;
        else
           return false;
    }
}
