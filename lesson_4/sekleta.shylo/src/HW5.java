public class HW5 {

    public static void main(String[] args) {
        int myArray[] = {3, 5, 7, 12, 4, 8, 20};
        int sum = 0;

        for (int i = 0; i < 3; i++) {
            sum = sum + myArray[i];
        }
        System.out.println("The sum of the first 3 elements of the array = " + sum);
    }
}
