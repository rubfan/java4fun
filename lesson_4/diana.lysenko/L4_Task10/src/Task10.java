import java.util.Random;

public class Task10 {

    public static void main(String[] args) {
        int num[] = initArray(-30, 30, 7);
        System.out.print("Array: ");
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
        System.out.println();
        int n = 5; // quantity of minimal elements
        int min[] = firstMinElements(num, 5);
        System.out.print("First " + n + " minimal element: ");
        for (int i = 0; i < n; i++) {
            System.out.print(min[i] + " ");
        }
    }

    public static int[] initArray(int min, int max, int quantity) {
        int arr[] = new int[quantity];
        Random r = new Random();
        for (int i = 0; i < quantity; i++) {
            arr[i] = r.nextInt((max - min) + 1) + min;
        }
        return arr;
    }

    public static int[] firstMinElements(int arr[], int n) {
        sortArray(arr);
        int arr2[] = new int[n];
        System.arraycopy(arr, 0, arr2, 0, n);
        return arr2;
    }

    public static void sortArray(int arr[]) {
        for(int i = arr.length-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){
                if( arr[j] > arr[j+1] ){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
    }
}
