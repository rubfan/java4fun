public class Task6 {
    public static void main(String[] params) {
        int a = Integer.parseInt(params[0]);
        int b = Integer.parseInt(params[1]);
        int c = Integer.parseInt(params[2]);
        int one = whoIsCloser(a, b);
        int too = whoIsCloser(c, b);
        printRes(one, too);


    }

    public static void printRes(int one, int too) {
        if (one > too) {
            System.out.println("Second number is closer");
        } else {
            System.out.println("First number is closer");
        }
    }

    public static int whoIsCloser(int param, int b) {
        int whoBigger;
        if (param > b) {
            whoBigger = param - b;
        } else {
            whoBigger = b - param;
        }
        return whoBigger;
    }
}
