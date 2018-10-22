public class HW6 {
    
    public static void main(String[] args) {
        
        double n = 9.5;
        double m = 11.45;
        int a = 10;

        double b = Math.abs(a - n);
        double c = Math.abs(a - m);

        if (b == c) {
            System.out.println("Numbers " + n + " and " + m + " equidistant from number " + a);
        }
        if (b > c) {
            System.out.println("Number " + m + " closer to number " + a);
        }
        if (b < c) {
            System.out.println("Number " + n + " closer to number " + a);
        }
    }

}

