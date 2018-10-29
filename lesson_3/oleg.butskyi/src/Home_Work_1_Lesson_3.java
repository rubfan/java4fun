

    public class Home_Work_1_Lesson_3 {

        public static void main(String[] args) {

            String Operation ="divide";
            int firstOperand = 50;
            int secondOperand = 2;
            System.out.println("Result is :" + getResult(firstOperand,secondOperand,Operation));

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
