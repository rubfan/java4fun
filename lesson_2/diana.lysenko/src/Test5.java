public class Test5 {
public static void main(String[] params) {
        int a = Integer.parseInt(params[0]);
        int b = Integer.parseInt(params[1]);
        if (a % b == 0) {
            System.out.println("Число " + a + " делится на число " + b + " без остатка.");
        } else System.out.println("Число " + a + " не делится на число " + b + " без остатка.");
    }
}