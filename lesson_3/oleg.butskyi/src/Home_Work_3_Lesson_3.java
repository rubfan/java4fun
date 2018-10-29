import java.util.Scanner;

public class Home_Work_3_Lesson_3 {

    public static void main(String[] params) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Input operation " + "multiply, addition, deduct, rod, mod, divide");
        params[0] = scan.nextLine();
        System.out.println("Input first operand");
        params[1] = scan.nextLine();
        System.out.println("Input second operand");
        params[2] = scan.nextLine();
        scan.close();
        String operation = params[0];
        int firstOperand = Integer.parseInt(params[1]);
        int secondOperand = Integer.parseInt(params[2]);

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
