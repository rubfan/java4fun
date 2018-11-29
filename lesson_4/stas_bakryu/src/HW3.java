public class HW3 {
    public static void main(String[] args) {
        int startNumber = 90;
        int step = 5;
        printNumber(startNumber, step);
    }

    public static void printNumber(int startNumber, int step) {
        while (startNumber >= 0) {
            System.out.println(startNumber + " ;");
            startNumber -= step;

        }

    }
}
