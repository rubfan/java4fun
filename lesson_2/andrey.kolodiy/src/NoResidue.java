/*

Task 5

Given the 2 numbers, determine whether the first number is divisible by the second without a remainder.

*/

public class NoResidue{

    public static void main(String[] params){

        int num1 = Integer.parseInt(params[0]);
        int num2 = Integer.parseInt(params[1]);
        if (num1 % num2 == 0) {
            System.out.println("No residue");
        } else {
            System.out.println("There is a residue");
        }
    }
}


