public class Task1 {

    public static void main(String[] args) {
        int num[] = sequence(1000, 9999, 3); //returns sequence in array
        System.out.println("Sequence of numbers: ");
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
    }

    public static int[] sequence(int min, int max, double step) {
        int quantity = 0;
        for (int i = min; i <= max; i+=step) {
            quantity++;
        }
        int arr[] = new int[quantity];
        int p = min;
        for (int i = 0; i < quantity; i++) {
            arr[i] = p;
            p+=step;
        }
        return arr;
    }

}
