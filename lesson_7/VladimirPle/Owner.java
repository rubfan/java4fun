package lesson_7.VladimirPle;

public class Owner {
    private String name;
    private int age;
    private int strength;
    private int speed;
    private M16 gun;


    public Owner(String name, int age, int strength, int speed) {
        this.name = name;
        this.age = age;
        this.strength = strength;
        this.speed = speed;
    }

    public void run() {
        for (int i = 0; i < strength; i++) {
            System.out.println("You are running");
        }
        System.out.println("You are tired");
    }

    public void tellAboutYourself() {
        System.out.println("My name is " + name + "and i'm " + age + "years old.\nI like cats");
    }

    public void getTheGun() {
        gun = new M16();
    }

    public M16 getGun() {
        return gun;
    }
}
