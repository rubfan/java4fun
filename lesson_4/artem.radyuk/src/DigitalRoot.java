public class DigitalRoot {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        getRootOutput(sb,555555);
        getRootOutput(sb,948165931);
        getRootOutput(sb,85);

        System.out.println(
                sb.toString()
        );
    }

    private static void getRootOutput(StringBuilder sb, int number) {
        sb.append("The digital root of ")
                .append(number)
                .append(" is: ")
                .append(digitalRoot(number))
                .append("\n");
    }

    private static int digitalRoot(int num) {
        while( num >= 10) {
            num = digitSum(num);
        }
        return num;
    }

    private static int digitSum(int num) {
        int sum = 0;
        int remainder;

        do{
            remainder = num % 10;
            sum += remainder;
            num /= 10;
        } while(num > 0);

        return sum;
    }
}
