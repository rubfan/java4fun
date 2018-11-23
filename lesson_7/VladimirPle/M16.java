package lesson_7.VladimirPle;

public class M16 {
    private int weight = 5;
    private String color = "red";
    private Owner owner;
    private int quantityOfRounds = 30;
    private boolean silencer = false;

    public M16() {
    }

    public M16(int weight, String color, Owner owner, int quantityOfRounds, boolean silencer) {
        this.weight = weight;
        this.color = color;
        this.owner = owner;
        this.quantityOfRounds = quantityOfRounds;
        this.silencer = silencer;
    }

    public M16(int weight, String color, Owner owner, int quantityOfRounds) {
        this.weight = weight;
        this.color = color;
        this.owner = owner;
        this.quantityOfRounds = quantityOfRounds;
    }

    public void fire(int quantityOfRoundsYouWantToFire) {
        for (int i = 0; i < quantityOfRoundsYouWantToFire; i++) {
            quantityOfRounds--;
            if (quantityOfRounds > 0) {
                System.out.println("\"Bang!\"");
            } else {
                System.out.println("\"Click\"");
                System.out.println("You need to recharge");
                return;
            }
        }
    }

    public void recharge(int quantityOfRounds) {
        this.quantityOfRounds = quantityOfRounds;
    }

    public void silencer() {
        if (silencer == true) {
            silencer = false;
        } else {
            silencer = true;
        }
    }
}
