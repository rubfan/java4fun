//2. i18n используется для обозначения слова internationalization, где 18 означает количество букв между первой и последней в этом слове, такое можно встретить в среде разработчиков. Например, для слова localization используется сокращение l10n.
//Напишите функцию, которая преобразует слова введенные из консоли через пробел в сокращенную форму. Слова длиной меньше 4х оставить без изменений.
//Пример ввода:
//internationalization localization cat elephant monitor
//Результат:
//i18n l10n cat e6t m5r
//PS: напишите функцию, которая сокращает слово, в основной функции используйте метод сплит, который поместит слова в массив и для каждого из них вызовет вашу функцию

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HW9_second_task {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String unsplittedString = bufferedReader.readLine();
        String splittedStrings[] = unsplittedString.split(" ");
        for(String splittedString: splittedStrings) {
            splittedString = formatString(splittedString);
            System.out.println(splittedString);
        }

    }

    private static String formatString(String string) {
        if(string.length() > 3) {
            String substring = string.substring(1, string.length() - 1);
            string = string.replace(substring, String.valueOf(string.length() - 2));
        }
        return string;
    }
}

