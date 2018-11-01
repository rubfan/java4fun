public class FiveMinElements {
    public static void main(String[] args) {
        int arr[] = {5, 3, -4, 23, 0, 45, 9, -8, 10, -1, 3};

        printArray(
                getMinElements(5, arr)
        );
    }

    private static int[] getMinElements(int quantity, int arr[]) {
        if( quantity < 0 ) {
            quantity = 0;
        }
        if( quantity > arr.length ) {
            quantity = arr.length;
        }

        sortArray(arr);

        int minValues[] = new int[quantity];
        System.arraycopy(arr,0, minValues,0, minValues.length);

        return minValues;
    }

    private static void sortArray(int arr[]) {
        for(int rightBorder = arr.length - 1; rightBorder > 1; rightBorder--) {
            for(int index = 0; index < rightBorder; index++) {
                if( arr[index] > arr[index + 1] ) {
                    int buf         = arr[index];
                    arr[index]      = arr[index + 1];
                    arr[index + 1]  = buf;
                }
            }
        }
    }

    private static void printArray(int arr[]){
        StringBuilder sb = new StringBuilder();

        for (int i : arr) {
            sb.append(" ").append(i);
        }
        System.out.println(
                sb.toString()
        );
    }
}
