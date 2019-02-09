import java.util.*;
import java.lang.*;

public class App8 
{

    public static void main(String[] args)
    {
        String Str = "";
        for (int i = 100000; i < 1000000; i++)
        {
            Str = String.valueOf(i);
            Str = Compare(Str);
            if(Str.equals("Lucky"))System.out.println(Str + " " + i);

        }
    }

    //Метод сравнения суммы первых 3 и последних 3 чисел
    public static String Compare(String Str)
    {
        String Lucky = "Lucky";
        String Unlucky = "Unlucky";
        SummOfLast(Str);
        SummOfFirst(Str);
        if(SummOfLast(Str) == SummOfFirst(Str)) return Lucky ;
        else return Unlucky;
    }

    //Метод нахождения суммы 3 первых чисел
    public static int SummOfFirst(String Str)
    {
        int SummFirst = 0;

        char[] StrArr = ConvertToChar(Str);

        for(int i=0;i< StrArr.length-3;i++)
        {
            int y = Character.getNumericValue(StrArr[i]);
            SummFirst+=y;
        }

        return SummFirst;
    }

    //Метод нахождения суммы 3 последних чисел
    public static int SummOfLast(String Str)
    {

        int SummLast = 0;
        char[] StrArr = ConvertToChar(Str);
        for(int i=3;i< StrArr.length;i++)
        {
            int y = Character.getNumericValue(StrArr[i]);
            SummLast+=y;
        }
        return SummLast;
    }

    //Метод преобразования строки в массив символов
    public static char[] ConvertToChar(String Str)
    {
        char[] StrArr = Str.toCharArray();
        return StrArr;
    }
}
