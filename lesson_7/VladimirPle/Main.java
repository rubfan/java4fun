package lesson_7.VladimirPle;

public class Main {
    public static void main(String[] args) {
        Torch torch = new Torch("My Torch", 2);
        torch.shineRed();
        torch.blink();
        Owner Mark = new Owner("Mark", 18, 32, 22);
        M16 m16 = new M16(4, "Black and white", Mark, 45);
        Mark.run();
        Mark.getTheGun();
        Mark.getGun().fire(35);
        Mark.getGun().recharge(30);
        Mark.getGun().fire(10);
    }
}
