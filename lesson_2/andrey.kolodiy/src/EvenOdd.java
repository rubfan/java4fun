/*

Task 4

Write a program that checks if the number is even or odd.

*/

public class EvenOdd{

    public static void main(String[] params){

        int num = Integer.parseInt(params[0]);
        if (num % 2 == 0) {
            System.out.println("Number " + num + " even ");
        } else if (num % 1 == 0) {
            System.out.println("Number " + num + " not even ");
        }
    }
}


