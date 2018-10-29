public class Task7Lesson2{
    public static void main(String[] params) {

        final int PAYMENT_PER_DAY = 40;
        final int DISCOUNT_FOR_FIVE_DAYS = 20;
        final int FIVE_DAYS = 5;
        final int DISCOUNT_FOR_SEVEN_DAYS = 50;
        final int SEVEN_DAYS = 7;
              int days = Integer.parseInt(params[0]);

              int PaymentForAllTime = days * PAYMENT_PER_DAY;

              if (days >= FIVE_DAYS && days < SEVEN_DAYS)
                  PaymentForAllTime -= DISCOUNT_FOR_FIVE_DAYS ;
              if (days >= SEVEN_DAYS)
                  PaymentForAllTime -= DISCOUNT_FOR_SEVEN_DAYS;
        System.out.println("Rental price is: " + PaymentForAllTime);

    }
}