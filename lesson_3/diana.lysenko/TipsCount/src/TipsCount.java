import java.util.Scanner;

public class TipsCount {

    public static void main(String[] args) {
        double tips = 0;
        float sum = 0;
        Scanner scan = new Scanner(System.in);
        do {
            System.out.print("Enter sum:  ");
            sum = scan.nextFloat();
        } while (sum<0);
        System.out.print("Service level: ");
        String serv = scan.next();
        switch (serv) {
            case "terrible":
                tips = 0;
                break;
            case "poor":
                tips = sum * 0.05;
                break;
            case "good":
                tips = sum * 0.1;
                break;
            case "great":
                tips = sum * 0.15;
                break;
            case "excellent":
                tips = sum * 0.2;
                break;
        }
        System.out.println("Your tips:  " + tips);
    }

}
