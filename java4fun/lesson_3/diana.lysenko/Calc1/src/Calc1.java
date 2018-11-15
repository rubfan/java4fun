public class Calc1 {

    public static void main(String[] args) {
        /* Available operations:
            sum
            minus
            multiply
            divide
            remainder
            abs
         */
        String operation = "remainder";
        int firstOperand = 21;
        int secondOperand = 10;
        int result = 0;
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
        System.out.println("Equal " + result);
    }

}
