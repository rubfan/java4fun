public class Task5 {
    public static void main(String[] params) {
        int a = Integer.parseInt(params[0]);
        int b = Integer.parseInt(params[1]);

        System.out.println("divisible! -It's " + divisible(a,b));
    }

    public static boolean divisible(int a,int b) {
        boolean div = false;
        if ((a % b) == 0) {
            div= true;
        }
        return div;
    }
}