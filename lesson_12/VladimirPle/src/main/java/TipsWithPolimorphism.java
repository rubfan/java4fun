public class TipsWithPolimorphism {
    int sumYouHaveToPay;

    public TipsWithPolimorphism(int sumYouHaveToPay) {
        this.sumYouHaveToPay = sumYouHaveToPay;
    }

    public double getTips(Terrible quality) {
        return sumYouHaveToPay;
    }

    public double getTips(Poor quality) {
        return sumYouHaveToPay * 1.05;
    }


    public double getTips(Good quality) {
        return sumYouHaveToPay * 1.1;
    }


    public double getTips(Great quality) {
        return sumYouHaveToPay * 1.15;
    }


    public double getTips(Exellent quality) {
        return sumYouHaveToPay * 1.2;
    }
}
