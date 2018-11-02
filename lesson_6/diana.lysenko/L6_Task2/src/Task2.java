public class Task2 {

    public static void main(String[] args) {
        int[] a = {1, 3, 5, 11, 20, 21};
        int[] b = {2, 4, 8, 9, 12};
        int size = a.length + b.length;
        int c[] = new int[size];
        int i = 0;
        int j = 0;
        int k = 0;
        while ((i < a.length) && (j < b.length)) {
            if (a[i] < b[j]) {
                c[k] = a[i];
                k++;
                i++;
            } else {
                c[k] = b[j];
                k++;
                j++;
            }
        }
        if (i > a.length-1) {
            System.arraycopy(b, j, c, k, c.length - k);
        }
        if (j > b.length-1) {
            System.arraycopy(a, i, c, k, c.length - k);
        }
        printArray(c);
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
