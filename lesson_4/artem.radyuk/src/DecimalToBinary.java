public class DecimalToBinary {

    public static void main(String[] args) {

        System.out.println(
                toBinary(100)
        );
    }

    private static String toBinary(int num){

        StringBuilder sb = new StringBuilder();

        int remainder;
        do{
            remainder = num % 2;
            sb.insert(0, remainder);
            num /= 2;
        } while(num > 0);

        return sb.toString();
    }
}
