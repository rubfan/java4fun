import java.util.Scanner;

public class CalculatorOlega {

    public static void main(String[] params) {

        Scanner scan = new Scanner(System.in);
        System.out.printf("Input operation " + "multiply, addition, deduct, rod, mod, divide : ");
        String operation = scan.nextLine();

        Scanner scan2 = new Scanner(System.in);
        System.out.printf("Input first operand : ");
        int firstOperand = scan2.nextInt();


        Scanner scan3 = new Scanner(System.in);
        System.out.printf("Input second operand : ");
        int secondOperand = scan.nextInt(); 

        System.out.println("Result is :" + getResult(firstOperand, secondOperand, operation));
    }


    public static int getResult (int firstOperand, int secondOperand, String operation ){
        int result = 0;
        if (operation.equals("divide"))    result = firstOperand / secondOperand;
        if (operation.equals("multiply"))  result = firstOperand * secondOperand;
        if (operation.equals("addition"))  result = firstOperand + secondOperand;
        if (operation.equals("deduct"))    result = firstOperand - secondOperand;
        if (operation.equals("rod"))       result = firstOperand % secondOperand;
        if (operation.equals("mod"))       result = Math.abs(firstOperand);
        return result;
    }


}
