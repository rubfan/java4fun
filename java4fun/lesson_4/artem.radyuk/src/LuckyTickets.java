public class LuckyTickets {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        checkTickets(sb);

        System.out.println(
                sb.toString()
        );
    }

    private static void checkTickets(StringBuilder sb) {
        int outputCounter = 0;

        for(int i = 100000; i <= 999999; i++) {
            if( isLucky(i) ){
                sb.append(i).append("  ");
                outputCounter++;
                if( outputCounter % 20 == 0 ) {
                    sb.append("\n");
                }
            }
        }
    }

    private static boolean isLucky(int num) {
        int lower = num % 1000;
        int higher = num - lower;

        return getDigitSum(lower) == getDigitSum(higher);
    }

    private static int getDigitSum(int num) {
        int sum = 0;
        int remainder;

        do {
             remainder = num % 10;
             sum += remainder;
             num /= 10;
        } while( num > 0 );

        return sum;
    }
}
