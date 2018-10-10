package javaElementary;

public class Exercise7 {
    public static void main(String[] args) {
        int days;
        days = Integer.parseInt(args[0]);
        int priceOfRent = 0;
        final int PRICE = 40;
        if (days >= 5 && days < 8) {
            priceOfRent = days * PRICE - 20;
        } else if (days > 7) {
            priceOfRent = days * PRICE - 40;
        } else {
            priceOfRent = days * PRICE;
        }
        System.out.println(priceOfRent);
    }
}
