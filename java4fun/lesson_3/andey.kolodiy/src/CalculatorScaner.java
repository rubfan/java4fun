import java.util.Scanner;

public class CalculatorScaner {

    public static void main(String[] args) {


        //String operation = " division "; // options operations: " addition ", " multiplication ", " division ", " minus "
        // " remainder of the division ", " finding the number modulus ".


        Scanner sc = new Scanner(System.in);
        System.out.printf("enter option: ");
        String operations = sc.nextLine();

        Scanner sc1 = new Scanner(System.in);
        System.out.printf("enter first Operand: ");
        int firstOperand = sc1.nextInt();

        Scanner sc2 = new Scanner(System.in);
        System.out.printf("enter second operand: ");
        int secondOperand = sc2.nextInt();


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

