public class HW4Numbers /*Tasks 1-4*/ {
    public static void main(String[] args) {
        System.out.println("Task 1");
        First();
        System.out.println("Task 2");
        Second();
        System.out.println("Task 3");
        Third();
        System.out.println("Task 4");
        Fourth();
    }

    public static void First() {
        int number = 1000;
        while (number < 10000) {
            System.out.print(number + " ");
            number += 3;
        }
        System.out.println();
    }

    public static void Second() {
        int number = 1;
        int counter = 1;
        do {
            System.out.print(number + " ");
            counter++;
            number += 2;
        } while (counter <= 55);
        System.out.println();
    }

    public static void Third() {
        int number = 90;
        while (number >= 0) {
            System.out.print(number + " ");
            number -= 5;
        }
        System.out.println();
    }

    public static void Fourth() {
        int number = 2;
        for (int i = 0; i < 20; i++) {
            System.out.print(number + " ");
            number *= 2;
        }
        System.out.println();
    }

}
