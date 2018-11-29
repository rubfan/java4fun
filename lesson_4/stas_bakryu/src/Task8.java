public class Task8 {

    public static void main(String[] args) {
        int min = 111111;
        int max = 999999;
        luckyTicket(min, max);


    }

    public static void luckyTicket(int min, int max) {
        int counter = 0;
        for (int i = min; i <= max; i++) {
            int number6 = i % 10;
            int number5 = (i / 10) % 10;
            int number4 = (i / 100) % 10;
            int number3 = (i / 1000) % 10;
            int number2 = (i / 10000) % 10;
            int number1 = (i / 100000) % 10;
            if (number1 + number2 + number3 == number4 + number5 + number6) {
                System.out.println("Lucky ticket = " + i + ";");
                counter++;
            }
        }
        System.out.println("tickets = " + counter);
    }
}
