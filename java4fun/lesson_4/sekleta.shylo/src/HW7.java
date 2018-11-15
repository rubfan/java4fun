public class HW7 {

    public static void main(String[] args) {
        int myArray[] = {3, 5, 7, 12, 4, 8, 20, 76, 1};

        int even;
        int odd;

        int sumEven = 0;
        int sumOdd = 0;

        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] % 2 == 0) {
                even = myArray[i];
                sumEven += even;
            } else {
                odd = myArray[i];
                sumOdd += odd;
            }
        }
        
        System.out.println("The sum of all even numbers in the array is " + sumEven);
        System.out.println("The sum of all odd numbers in the array is " + sumOdd);
    }
}
