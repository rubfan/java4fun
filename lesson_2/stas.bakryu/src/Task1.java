

public class Task1 {

    public static void main(String[] params) {
        int a = Integer.parseInt(params[0]);
        int b = Integer.parseInt(params[1]);
        int c = Integer.parseInt(params[2]);
        int min = whoIsBiger(a, b, c);

        System.out.print("this number is min" + min);

    }

    public static int whoIsBiger(int a, int b, int c) {
        int min = a;
        if (min > b) min = b;
        if (min > c) min = c;
        return min;
    }

}
