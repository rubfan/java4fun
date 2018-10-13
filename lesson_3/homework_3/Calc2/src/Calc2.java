import java.util.Scanner;

public class Calc2 {

    public static void main(String[] args) {
        /* Available operations:
            sum
            minus
            multiply
            divide
            remainder
            abs
         */
        Scanner scan = new Scanner(System.in);
        float secondOperand = 0;
        float firstOperand = 0;
        float result = 0;
        System.out.print("Enter operation:  ");
        String operation = scan.next();
        System.out.print("Enter first number:  ");
        firstOperand = scan.nextFloat();
        if (!operation.equals("abs")) {
            System.out.print("Enter second number:  ");
            secondOperand = scan.nextFloat();
        }
        switch (operation) {
            case "sum":
                result = firstOperand + secondOperand;
                break;
            case "minus":
                result = firstOperand - secondOperand;
                break;
            case "multiply":
                result = firstOperand * secondOperand;
                break;
            case "divide":
                result = firstOperand / secondOperand;
                break;
            case "remainder":
                result = firstOperand % secondOperand;
                break;
            case "abs":
                result = Math.abs(firstOperand);
                break;
        }
        System.out.println("Equals " + result);
    }

}
