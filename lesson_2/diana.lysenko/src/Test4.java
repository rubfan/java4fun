public class Test4 {
public static void main(String[] params) {
        int a = Integer.parseInt(params[0]);
        if (a % 2 == 0) {
            System.out.println("Число " + a + " четное.");
        } else System.out.println("Число " + a + " нечетное.");
    }
}