public class Task3 {

    public static void main(String[] params) {
        int a = Integer.parseInt(params[0]);
        int b = Integer.parseInt(params[1]);
        int c = Integer.parseInt(params[2]);
        int min = whoIsBiger(a, b, c);
        printMinNumbers(a, b, c, min);

    }

    public static int whoIsBiger(int a, int b, int c) {
        int min = a;
        if (min > b) min = b;
        if (min > c) min = c;
        return min;
    }

    public static void printMinNumbers(int a, int b, int c, int min) {
        if (min == a) {
            System.out.println("this number is min" + a);
        }
        if (min == b) {
            System.out.println("this number is min" + b);
        }
        if (min == c) {
            System.out.println("this number is min" + c);
        }

    }


}

