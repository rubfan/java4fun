public class Calculator {

    public static void main(String[] args) {

        String operation = " division "; // options operations: " addition ", " multiplication ", " division ", " minus "
                                       // " remainder of the division ", " finding the number modulus ".

        int firstOperand = 5;
        int secondOperand = 12;

        double equally = 0;  // DON TOUCH.!!!!

        if (operation == " addition "){
            equally = firstOperand + secondOperand;
            System.out.printf(firstOperand + " + " + secondOperand + " = " + equally );
        }

        if (operation == " minus "){
           equally = (double) firstOperand - (double)secondOperand;
            System.out.printf(firstOperand + " - " + secondOperand + " = " + equally );
        }

        if (operation == " multiplication "){
            equally = firstOperand * secondOperand;
            System.out.printf(firstOperand + " * " + secondOperand + " = " + equally );
        }
        if (operation == " division "){
            equally = (double) firstOperand / (double)secondOperand;
            System.out.printf(firstOperand + " / " + secondOperand + " = " + equally );
        }
        if (operation == " finding the number modulus "){
            equally = Math.abs(firstOperand);
            System.out.printf(firstOperand + " |MOD| " + " = " + equally );
        }
        if (operation == " remainder of the division "){
            equally = firstOperand % secondOperand;
            System.out.printf(firstOperand + " / " + secondOperand + " the remainder " + equally );
        }
    }

}
