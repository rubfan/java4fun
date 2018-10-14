
import java.util.Scanner;

public class SimpleCalc {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        boolean more = true;
        while(more){

            System.out.println("Input the operation please (+,-,*,/,%,abs):");
            String operation = in.nextLine();

            System.out.println("Input the first argument (integer):");
            int arg1 = in.nextInt();

            System.out.println("Input the second argument (integer):");
            int arg2 = in.nextInt();

            System.out.println("Result: " + calculate(operation, arg1, arg2));

            System.out.println("Do you want to continue? [Y/n]");

            // to consume an extra new-line character:
            in.nextLine();

            more = in.nextLine().matches("[Yy]");
        }
    }

    private static int calculate(String operation, int arg1, int arg2){
        int result = 0;
        switch (operation){
            case "+":
                result = arg1 + arg2;
                break;
            case "-":
                result = arg1 - arg2;
                break;
            case "*":
                result = arg1 * arg2;
                break;
            case "/":
            case "\\":
                result = arg1 / arg2;
                break;
            case "%":
                result = arg1 % arg2;
                break;
            case "abs":
                result = Math.abs(arg1);
                break;
        }
        return result;
    }
}
