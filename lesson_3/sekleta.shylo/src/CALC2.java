import java.util.Scanner;

public class CALC2 {

    public static void main(String[] args) {
        System.out.print("Please, input first operand: ");
        Scanner sc = new Scanner(System.in);
        int firstOperand = sc.nextInt();

        System.out.print("Please, input second operand: ");
        int secondOperand = sc.nextInt();

        String operation = "addition";

        int result = calculator (firstOperand, secondOperand, operation);
        System.out.println("Result is: " + result);

    }

    public static int calculator(int firstOperand, int secondOperand, String operation) {
        int result = 0;

        if (operation.equals("multiply")) {
            result = firstOperand * secondOperand;
        }
        if (operation.equals("divide")) {
            result = firstOperand / secondOperand;
        }
        if (operation.equals("addition")) {
            result = firstOperand + secondOperand;
        }
        if (operation.equals("deduct")) {
            result = firstOperand - secondOperand;
        }
        if (operation.equals("rod")) {
            result = firstOperand % secondOperand;
        }
        if (operation.equals("module")) {
            result = Math.abs(firstOperand);
        }
        return result;
    }
}
