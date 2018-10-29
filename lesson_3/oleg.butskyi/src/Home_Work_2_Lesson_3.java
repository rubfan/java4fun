import java.util.Scanner;

        public class Home_Work_2_Lesson_3 {

            public static void main(String[] params) {

                Scanner scan = new Scanner(System.in);
                System.out.println("Input operation\n " + "-multiply \n -addition\n -deduct\n -rod\n -mod\n -divide");
                String Operation = scan.nextLine();
                System.out.println("Input first operand");
                int firstOperand = scan.nextInt();
                System.out.println("Input second operand");
                int secondOperand = scan.nextInt();
                scan.close();

        System.out.println("Result is :" + getResult(firstOperand, secondOperand, Operation));
    }


    public static int getResult (int firstOperand, int secondOperand, String operation ){
        int result = 0;
        if (operation.equals("divide"))    result = firstOperand / secondOperand;
        if (operation.equals("multiply"))  result = firstOperand * secondOperand;
        if (operation.equals("addition"))  result = firstOperand + secondOperand;
        if (operation.equals("deduct"))    result = firstOperand - secondOperand;
        if (operation.equals("rod"))       result = firstOperand % secondOperand;
        if (operation.equals("mod"))       result = Math.abs(firstOperand);
        return result;
    }


}

