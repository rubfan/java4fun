public class Task11 {
    public static void main(String[] args) {
        long number = 9999888789909998L;

        while (number > 10) {
            number = fockus(number);
        }

        System.out.println("Finish number = " + number + ".");
    }

    public static long fockus(long number) {
        int start = 0;
        for (long i = number; i > 0; i /= 10) {
            start += i % 10;

        }
        return start;
    }

}
