import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Calculator {
    public static void main(String[] args) throws IOException {
        System.out.println("You have these operations:" +
                "add, minus, multiply, divide, remainder, abs");
        String operation;
        double firstOperand;
        double secondOperand;
        if (args.length > 0) {
            operation = args[0];
            firstOperand = Double.parseDouble(args[1]);
            secondOperand = Double.parseDouble(args[2]);
        } else {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Input operation:");
            operation = reader.readLine();
            System.out.println("Input first number:");
            firstOperand = Double.parseDouble(reader.readLine());
            System.out.println("Input second number:");
            secondOperand = Double.parseDouble(reader.readLine());
        }
        calculate(operation, firstOperand, secondOperand);
    }

    public static void calculate(String operation, double firstOperand, double secondOperand) {
        double result = 0;
        switch (operation) {
            case "add":
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
        System.out.println("Result is a " + result);
    }

}
