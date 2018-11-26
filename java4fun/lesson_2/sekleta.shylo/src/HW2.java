public class HW2 {

    public static void main(String[] args) {

        float num1 = 4.25f;
        int num2 = 5;
        double num3 = 0.54876;

        if (num1 > num2 && num1 > num3) {
            System.out.println("The maximum number of three numbers is: " + num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("The maximum number of three numbers is: " + num2);
        } else if (num3 > num1 && num3 > num2) {
            System.out.println("The maximum number of three numbers is: " + num3);
        }

        if (num1 < num2 && num1 < num3) {
            System.out.println("The minimum number of three numbers is: " + num1);
        } else if (num2 < num1 && num2 < num3) {
            System.out.println("The minimum number of three numbers is: " + num2);
        } else if (num3 < num1 && num3 < num2) {
            System.out.println("The minimum number of three numbers is: " + num3);
        }
    }
}
