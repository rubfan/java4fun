public class Task1 {

    public static void main(String[] args) {
        // arr.length = n; O(n^2)
        int count = 0;
        int[] arr = {7, 2, 3, 6, 8, 9, 1};
        for(int i = 0; i < arr.length - 1; i++) {
            int min_i = i;
            count++; // int min_i = i
            for(int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min_i]) {
                    min_i = j;
                    count++;
                }
            }

            int temp = arr[min_i];
            arr[min_i] = arr[i];
            arr[i] = temp;
            count++; // swap elements

        }


        System.out.println("Sorted array");
        printArray(arr);
        System.out.println();
        System.out.println("Operations executed: " + count);
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
