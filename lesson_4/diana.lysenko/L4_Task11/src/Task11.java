import java.util.Scanner;

public class Task11 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter digit: ");
        int num = scan.nextInt();
        System.out.println("Digital root: " + digitalRoot(num));
    }

    public static int digitalRoot(int a) {
        StringBuilder s = new StringBuilder();
        s.append(a);
        int digit_length = String.valueOf(a).length();
        int arr[] = new int[digit_length];
        int sum = 0;
        while (digit_length != 1) {
            sum = 0;
            for (int j = 0; j < digit_length; j++) {
                arr[j] = a % 10;
                sum += arr[j];
                a = a / 10;
            }
            s.append(" = ");
            for (int j = 0; j < digit_length-1; j++) {
                s.append(arr[j] + " + ");
            }
            s.append(arr[digit_length-1]);
            s.append(" = " + sum);
            a = sum;
            digit_length = String.valueOf(sum).length();
        }
        //s.append(" = " + sum);
        System.out.println(s);
        return sum;
    }

}
