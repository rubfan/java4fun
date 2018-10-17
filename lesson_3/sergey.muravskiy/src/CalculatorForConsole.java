import java.util.Scanner;
import java.lang.String;

public class CalculatorForConsole {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double Result, FirstOp, SecondOp;
        System.out.println("You can use only next operations [+, -, *, /, %, abs, sqrt, pow]!");
        while(true)
        {
            //Операнды и операция
            String Operation = "";
            System.out.print("Input the first operand > ");
            FirstOp = in.nextDouble();
            System.out.print("Input operation > ");
            Operation = in.next();
            //Список операций
            switch (Operation) {
                case "+":
                    System.out.print("Input the second operand > ");
                    SecondOp = in.nextDouble();
                    Result = FirstOp + SecondOp;
                    break;
                case "-":
                    System.out.print("Input the second operand > ");
                    SecondOp = in.nextDouble();
                    Result = FirstOp - SecondOp;
                    break;
                case "*":
                    System.out.print("Input the second operand > ");
                    SecondOp = in.nextDouble();
                    Result = FirstOp * SecondOp;
                    break;
                case "/":
                    System.out.print("Input the second operand > ");
                    SecondOp = in.nextDouble();
                    Result = FirstOp / SecondOp;
                    break;
                case "%":
                    System.out.print("Input the second operand > ");
                    SecondOp = in.nextDouble();
                    Result = FirstOp % SecondOp;
                    break;
                case "abs":
                    Result = Math.abs(FirstOp);
                    break;
                case "sqrt":
                    System.out.print("Input the second operand > ");
                    SecondOp = in.nextDouble();
                    Result = Math.exp(Math.log(FirstOp) / SecondOp);
                    break;
                case "pow":
                    System.out.print("Input the second operand > ");
                    SecondOp = in.nextDouble();
                    Result = Math.pow(FirstOp, SecondOp);
                    break;
                default:
                    Result = 0;
                    break;
            }
            //Вывод результатов
            System.out.println("Result > " + Result );
            //Проверка на продолжение и окончание работы
            System.out.print("Continue? [Yes/No] > ");
            String ChoiseMake = in.next();
            if (ChoiseMake.equals("Yes"))
                {
                    continue;
                }
            else
                {
                    break;
                }
        }
    }
}
