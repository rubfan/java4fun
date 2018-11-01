
public class HW1 {

    public static void main(String[] args) {

        System.out.println("Min number is: " + min(5, 2, 3));
    }

    public static int min(int a, int b, int c) {
        int m2;
        if (a < b) {
            m2 = a;
        } else {
            m2 = b;
        }
        if (b < c) {
            m2 = b;
        } else {
            m2 = c;
        }
        if (a < c) {
            m2 = a;
        } else {
            m2 = c;
        }
        return m2;

    }
}
