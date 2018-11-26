public class Task3 {

    public static void main(String[] args) {
        int num[] = inverseSequence(90, -90, -5);
        System.out.println("Sequence of numbers: ");
        for (int i = 0; i < num.length; i++) {
            if (num[i] >= 0) {
                System.out.print(num[i] + " ");
            }
        }
    }

    public static int[] inverseSequence(int start, int end, int step) {
        int quantity = 0;
        for (int i = start; i >= end; i+=step) {
            quantity++;
        }
        int arr[] = new int[quantity];
        int p = start;
        for (int i = 0; i < quantity; i++) {
            arr[i] = p;
            p+=step;
        }
        return arr;
    }
}
