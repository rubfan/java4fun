package lesson_8.VladimirPle;

public class Torch {
    private String name;
    protected int quantityOfBatteries;

    public String shineWhite() {
        if (quantityOfBatteries > 0) {
            System.out.println("The torch shine white light");
            return "The torch shine white light";

        } else {
            System.out.println("You need more batteries!");
            return "You need more batteries!";
        }
    }

    public String shineRed() {
        if (quantityOfBatteries > 1) {
            System.out.println("The torch shine red light");
            return "The torch shine red light";
        } else {
            System.out.println("You need more batteries!");
            return "You need more batteries!";
        }
    }

    public String blink() {
        if (quantityOfBatteries > 2) {
            System.out.println("The torch blinks");
            return "The torch blinks";
        } else {
            System.out.println("You need more batteries!");
            return "You need more batteries!";
        }
    }

    public String turnOff() {
        System.out.println("The torch is off");
        return "The torch is off";
    }

    public Torch(String name, int quantityOfBatteries) {
        this.name = name;
        this.quantityOfBatteries = quantityOfBatteries;
    }
}
