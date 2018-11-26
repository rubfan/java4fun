public class Task4 {

    private static final int NUMBER_OF_DIGITS = 20;

    public static void main(String[] args) {
        int num[] = sequenceMultiply(2, 10000000,2);
        System.out.println("Sequence of numbers: ");
        for (int i = 0; i < NUMBER_OF_DIGITS; i++) {
            System.out.print(num[i] + " ");
        }
    }

    public static int[] sequenceMultiply(int start, int end, int step) {
        int quantity = 0;
        for (int i = start; i <= end; i = i * step) {
            quantity++;
        }
        int arr[] = new int[quantity];
        int p = start;
        for (int i = 0; i < quantity; i++) {
            arr[i] = p;
            p = p * step;
        }
        return arr;
    }
}
