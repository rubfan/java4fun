public class Task4 {
    public static void main(String[] params) {
        int a = Integer.parseInt(params[0]);

        System.out.println("this number is even! -It's " + even(a));
    }

    public static boolean even(int a) {
        boolean eve = false;
        if ((a % 2) == 0) {
            eve = true;
        }
        return eve;
    }
}