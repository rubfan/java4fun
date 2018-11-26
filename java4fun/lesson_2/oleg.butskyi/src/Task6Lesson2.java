public class Task6Lesson2 {
     public static void main(String[] params) {

         final int VALUE = 10;

         int number1 = Integer.parseInt(params[0]);
         int number2 = Integer.parseInt(params[1]);

         number1 = Math.abs(number1 -= VALUE);
         number2 = Math.abs(number2 -= VALUE);

         if (number1 == number2) System.out.println("Numbers equally close to value 10");
         if (number1 > number2)  System.out.println("Number 2 is closer to value 10");
         if (number2 > number1)  System.out.println("Number 1 is closer to value 10");
    }
}