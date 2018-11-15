public class HW3 {

    public static void main(String[] args) {

        int number1 = 1;
        int number2 = 0;
        int number3 = 0;

               if (number1 < number2
                && number1 < number3) {
            System.out.println("The minimum number of three numbers is number1 (" + number1 + ").");
        } else if (number1 == number2) {
            System.out.println("The minimum number of three numbers is number1 (" + number2 + ") and number2 (" + number2 + ").");
        } else if (number1 == number3
                && number1 < number2
                && number3 < number2) {
            System.out.println("The minimum number of three numbers is number1 (" + number1 + ") and number3 (" + number3 + ").");
        }

               if (number2 < number1
                && number2 < number3) {
            System.out.println("The minimum number of three numbers is number2 (" + number2 + ").");
        } else if (number2 == number3) {
            System.out.println("The minimum number of three numbers is number2 (" + number2 + ") and number3 (" + number3 + ").");
        }

               if (number3 < number1
                && number3 < number2) {
            System.out.println("The minimum number of three numbers is number3 (" + number3 + ").");
        }
    }
}
