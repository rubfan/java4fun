public class ArraySum {
    public static void main(String[] args) {
        int arr[] = {5, 3, -4, 23, 0, 45, 9, -8, 10, -1};
        int sum = arraySum(arr, 7);

        System.out.println(sum);
    }

    private static int arraySum(int arr[], int quantity) {
        int sum = 0;

        if (quantity < 0) {
            quantity = 0;
        }
        if (quantity > arr.length) {
            quantity = arr.length;
        }

        for(int i = 0; i < quantity; i++) {
            sum += arr[i];
        }

        return sum;
    }
}
