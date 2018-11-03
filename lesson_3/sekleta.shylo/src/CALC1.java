public class CALC1 {
    public static void main(String[] args) {

        String operation = "addition";
        int firstOperand = 15;
        int secondOperand = 12;

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

