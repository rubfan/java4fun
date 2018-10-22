public class Task2 {

    public static void main(String[] args) {
        System.out.println("Sequence on numbers: ");
        int step = 2;
        int num = 1-step; // number before the first one
        for (int i = 0; i < 55; i++) {
            num+=step;
            System.out.print(num + " ");
        }
    }

}
