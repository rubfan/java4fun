import java.util.*;
import java.lang.*;

public class App11 
{

    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Input Number > ");
        String Str ="";
        Str = in.nextLine();
        int FinalSumm =0;

        /*Цикл вызова метода сложения символов числа(SummOfNumbers())
        для проверки если результат больше чем число из одного символа*/
        while(ConvertToChar(Str).length>1)
        {
            FinalSumm = SummOfNumbers(Str);
            String NewStr = String.valueOf(FinalSumm);
            Str = NewStr;

        }

        System.out.print("Result of summing > " + FinalSumm);

    }

    //Метод преобразования строки в массив символов
    public static char[] ConvertToChar(String Str)
    {
        char[] StrArr = Str.toCharArray();
        return StrArr;
    }

    //Метод сложения символов числа
    public static int SummOfNumbers(String Str)
    {
        int Summ = 0;
        char[] StrArr = ConvertToChar(Str);

        for(int i=0;i< StrArr.length;i++)
        {
            int y = Character.getNumericValue(StrArr[i]);
            Summ+=y;
        }

        return Summ;
    }

}

