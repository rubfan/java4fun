import java.util.Scanner;

public class Calc3 {

    public static void main(String[] args) {

        float secondOperand = 0;
        float firstOperand = 0;
        float result = 0;

        String operation = args[0];
        firstOperand = Float.parseFloat(args[1]);
        if (!operation.equals("abs")) {
            secondOperand = Float.parseFloat(args[2]);
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
