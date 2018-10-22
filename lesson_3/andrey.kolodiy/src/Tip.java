import java.util.Scanner;

public class Tip {

    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.printf("Enter order amount: ");
        int money = sc1.nextInt();

        Scanner sc2 = new Scanner(System.in);
        System.out.println(" ===========(terrible, poor, good, great, excellent)============ ");
        System.out.printf("Specify service level: ");
        String service = sc2.nextLine();

        int Summ = 0;




        final int terrible = 0;       //tip percentage for service level
        final int poor = 5;           //tip percentage for service level
        final int good = 10;          //tip percentage for service level
        final int great = 15;         //tip percentage for service level
        final int excellent = 20;     //tip percentage for service level


        if (service.equals("terrible")) {
            Summ = money + terrible;
            System.out.println("It was not bad to give " + Summ + " UAH!");
        }
        if (service.equals("poor")) {
            Summ = money + (money * poor / 100);
            System.out.println("It was not bad to give " + Summ + " UAH!");
        }
        if (service.equals("good")){
            Summ = money + (money * good / 100);
            System.out.println("It was not bad to give " + Summ + " UAH!");
        }
        if (service.equals("great")){
            Summ = money + (money * great / 100);
            System.out.println("It was not bad to give " + Summ + " UAH!");
        }
        if (service.equals("excellent")){
            Summ = money + (money * excellent / 100);
            System.out.println("It was not bad to give " + Summ + " UAH!");
        }

    }
}
