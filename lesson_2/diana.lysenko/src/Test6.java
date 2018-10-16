public class Test6 {
public static void main(String[] params) {
        int a = Integer.parseInt(params[0]);
        int b = Integer.parseInt(params[1]);
        int w = Math.abs(a - 10);
        int z = Math.abs(b - 10);
        if (w<z) {
            System.out.println("Число " + a + " ближе к 10 чем число " + b);
        } else System.out.println("Число " + b + " ближе к 10 чем число " + a);
    }
}