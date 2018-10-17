import java.util.Scanner;
import java.lang.String;
class CalculatorWithParams
{
    public static void main(String[] params) 
	{
		//Входные параметры. Всегда 3!!!
		double FirstOp = Double.parseDouble(params[0]);
		double SecondOp = Double.parseDouble(params[2]);
		String Operation = String.valueOf(params[1]);
		double Result;
		//Перечень операций.!!!Модуль считаеться по 1(первому) параметру!!!
		switch(Operation)
            {
                case "abs" :
                    Result = Math.abs(FirstOp);
                    break;
                case "sqrt" :
                    Result = Math.exp(Math.log(FirstOp)/SecondOp);
                    break;
                case "pow" :
                    Result = Math.pow(FirstOp,SecondOp);
                    break;
				case "plus" :
                    Result = FirstOp + SecondOp;
                    break;
				case "minus" :
                    Result = FirstOp - SecondOp;
                    break;
				case "multiply" :
                    Result = FirstOp * SecondOp;
                    break;
				case "devide" :
                    Result = FirstOp / SecondOp;
					break;
				case "devide2" :
                    Result = FirstOp % SecondOp;
					break;
                default :
                    Result = 0;
                    break;
            }
		//Вывод результата
        System.out.print("Result > " + Result );
    }
}  
 