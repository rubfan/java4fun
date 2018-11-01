public class HW7 {
    public static void main(String[] args) {
        int priceForOneDay = 40;
        int maxDays = 10;


        for (int i = 1; i < maxDays; i++) {

            if (i <= 5) {
                System.out.println("In the period of " + i + " days the rent will be " + (i * priceForOneDay) + " UAH.");
            }

            if (i > 5 && i <= 7) {
                System.out.println("In the period of " + i + " days the rent will be " + (i * priceForOneDay - 20) + " UAH (a discount is 20 UAH).");
            }

            if (i > 7) {
                System.out.println("In the period of " + i + " days the rent will be " + (i * priceForOneDay - 50) + " UAH (a discount is 50 UAH).");
            }

        }
    }
}
