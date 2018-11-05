public class HW2 {
    public static void main(String[] args) {
        int a = 1;
        int counter = 55;
        printNumber135(a, counter);
    }


    public static void printNumber135(int a, int counter) {


        while (counter != 0) {
            System.out.println(a + " ;");
            a += 2;
            counter--;
        }
    }

}