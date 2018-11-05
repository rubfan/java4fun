public class HW4 {
    public static void main(String[] args) {
        int firstNumber = 2;
        int step = 2;
        int maxCounter = 20;
        printNumber(firstNumber, step, maxCounter);
    }

    public static void printNumber(int firstNum, int step, int maxCount) {
        while (maxCount > 0) {
            maxCount--;
            System.out.println(firstNum + " ;");
            firstNum *= step;
        }
    }
}
