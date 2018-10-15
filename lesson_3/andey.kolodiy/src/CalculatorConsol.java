import java.util.Scanner;

public class CalculatorScaner {

    public static void main(String[] params) {


        //String operation = " division "; // options operations: " addition ", " multiplication ", " division ", " minus "
        // " remainder of the division ", " finding the number modulus ".


        Scanner sc = new Scanner(System.in);
        System.out.printf("enter option: ");
        params[0] = sc.nextLine();
        String operations = params[0];

        Scanner sc1 = new Scanner(System.in);
        System.out.printf("enter first Operand: ");
        params[1] = sc1.nextLine();
        int firstOperand = Integer.parseInt(params[1]);

        Scanner sc2 = new Scanner(System.in);
        System.out.printf("enter second operand: ");
        params[2] = sc2.nextLine();
        int secondOperand = Integer.parseInt(params[2]);


        double equally = 0;  // DON TOUCH.!!!!

        if (operations.equals("addition")) {
            equally = firstOperand + secondOperand;
            System.out.println(firstOperand + " + " + secondOperand + " = " + equally);
        }

        if (operations.equals("minus")) {
            equally = (double) firstOperand - (double) secondOperand;
            System.out.println(firstOperand + " - " + secondOperand + " = " + equally);
        }

        if (operations.equals("multiplication")) {
            equally = firstOperand * secondOperand;
            System.out.println(firstOperand + " * " + secondOperand + " = " + equally);
        }
        if (operations.equals("division")) {
            equally = (double) firstOperand / (double) secondOperand;
            System.out.println(firstOperand + " / " + secondOperand + " = " + equally);
        }
        if (operations.equals("finding_the_number_modulus")) {
            equally = Math.abs(firstOperand);
            System.out.println(firstOperand + " |MOD| " + " = " + equally);
        }
        if (operations.equals("remainder_of_the_division")) {
            equally = firstOperand % secondOperand;
            System.out.println(firstOperand + " / " + secondOperand + " the remainder " + equally);
        }
    }

}

