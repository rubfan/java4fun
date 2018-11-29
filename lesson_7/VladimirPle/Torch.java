package lesson_7.VladimirPle;

public class Torch {
    private String name;
    private int quantityOfBatteries;

    public void shineWhite() {
        if (quantityOfBatteries > 0) {
            System.out.println("The torch shine white light");
        } else {
            System.out.println("You need more batteries!");
        }
    }

    public void shineRed() {
        if (quantityOfBatteries > 1) {
            System.out.println("The torch shine red light");
        } else {
            System.out.println("You need more batteries!");
        }
    }

    public void blink() {
        if (quantityOfBatteries > 2) {
            System.out.println("The torch blinks");
        } else {
            System.out.println("You need more batteries!");
        }
    }

    public void turnOff() {
        System.out.println("The torch is off");
    }

    public Torch(String name, int quantityOfBatteries) {
        this.name = name;
        this.quantityOfBatteries = quantityOfBatteries;
    }
}
