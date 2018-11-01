/*

Task_6

Find the nearest to 10 of 2 given numbers. For example, among the numbers 8 and 11, the nearest to ten 11.


*/

public class CloserToTen{
    public static void main(String[] params){

        int num1 = Integer.parseInt(params[0]);
        int num2 = Integer.parseInt(params[1]);
        int number = 10; //to this number we are looking for the nearest.
        double number1 = Math.abs(number - num1);
        double number2 = Math.abs(number - num2);
        if (number1 == number2) {
            System.out.println("Number " + num1 + " and " + num2 + "  equal distance closer to " + number);
        } else if (number1 > number2) {
            System.out.println("Number " + num2 + " closer to " + number);
        } else {
            System.out.println("Number " + num1 + " closer to " + number);
        }
    }
}


