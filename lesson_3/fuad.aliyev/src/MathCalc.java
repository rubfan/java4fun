import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MathCalc {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input first operand:");
        int firstOperand = Integer.parseInt(bufferedReader.readLine());
        System.out.println("Input operation:");
        String operation = bufferedReader.readLine();
        System.out.println("Input second operand:");
        int secondOperand = Integer.parseInt(bufferedReader.readLine());
        System.out.print("Result: ");
        if(operation.equals("+")) System.out.println(add(firstOperand, secondOperand));
        else if(operation.equals("-")) System.out.println(subtract(firstOperand, secondOperand));
        else if(operation.equals("*")) System.out.println(multiply(firstOperand, secondOperand));
        else if(operation.equals("/")) System.out.println(divide(firstOperand,secondOperand));
        else if(operation.equals("%")) System.out.println(modulo(firstOperand,secondOperand));
        else if(operation.equals("abs")) {
            System.out.print(absoluteValue(firstOperand) + " ");
            System.out.println(absoluteValue(secondOperand));
        }
        else System.out.println("Our calc doesn't support this arithmetical operation");
    }

    private static int add(int firstOperand, int secondOperand) {
        return firstOperand + secondOperand;
    }

    private static int subtract(int firstOperand, int secondOperand) {
        return firstOperand - secondOperand;
    }

    private static int multiply(int firstOperand, int secondOperand) {
        return firstOperand * secondOperand;
    }

    private static double divide(int firstOperand, int secondOperand) {
        return firstOperand / secondOperand;
    }

    private static int modulo(int firstOperand, int secondOperand) {
        return firstOperand % secondOperand;
    }

    private static int absoluteValue(int operand) {
        return Math.abs(operand);
    }
}
