public class Task4 {

    public static void main(String[] args) {
        int[] a = {1, 5, 7, 9, 12};
        int sum = 2;
        int a_i = 0;
        int a_j = 0;
        boolean check = false;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] >= sum) {
                break;
            }
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > sum) {
                    break;
                }
                if (a[i] + a[j] == sum) {
                    a_i = a[i];
                    a_j = a[j];
                    check = true;
                }
            }
        }
        if (check) {
            System.out.println(check + ": " + a_i + " + " + a_j + " = " + sum);
        } else {
            System.out.println(check);
        }
    }

}
