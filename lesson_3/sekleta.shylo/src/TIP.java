import java.util.Scanner;

public class TIP {

    public static void main(String[] args) {
        System.out.print("Please, input coast: ");
        Scanner sc = new Scanner(System.in);
        int coast = sc.nextInt();
        System.out.print("Enter the service level (1 - terrible, 2 - poor, 3 - good, 4 - great, 5 - excellent): ");
        int serviceLevel = sc.nextInt();

        double terrible = 0;
        double poor = 0.05;
        double good = 0.1;
        double great = 0.15;
        double excellent = 0.2;

        if (serviceLevel == 1) {
            System.out.println("You must leave " + (coast + (coast * terrible)) + " UAH (0%).");
        }
        if (serviceLevel == 2){
            System.out.println("You must leave " + (coast + (coast * poor)) + " UAH (5%).");
        }
        if (serviceLevel == 3){
            System.out.println("You must leave " + (coast + (coast * good)) + " UAH (10%).");
        }
        if (serviceLevel == 4){
            System.out.println("You must leave " + (coast + (coast * great)) + " UAH (15%).");
        }
        if (serviceLevel == 5){
            System.out.println("You must leave " + (coast + (coast * excellent)) + " UAH (20%).");
        }
    }
}
