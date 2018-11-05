public class HW5 {
    public static void main(String[] args) {
        int[] number = {1, 2, 3, 3, 4, 45, 55, 55, 5};
        int n = 6;
        printSumma(number, n);
    }

    public static void printSumma(int[] number, int n) {
        int summa = 0;
        for (int i = 0; i < number.length; i++) {
            summa += number[i];
            n--;
            if (n == 0) {
                break;
            }

        }
        System.out.println("Summa = " + summa + ";");
    }
}
