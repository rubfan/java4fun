package lesson_6.VladimirPle;

public class Exercise4 {

    public static void main(String[] args) {
        int[] a = {1, 5, 7, 9, 12};
        int sum = 12;
        myMethod(a, sum);
    }


    private static boolean myMethod(int[] a, int sum) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (i != j && a[i] + a[j] == sum) {
                    System.out.println("arr: " + a[i] + " + " + a[j] + " = " + sum);
                    return true;
                }
            }
        }
        return false;
    }
}
