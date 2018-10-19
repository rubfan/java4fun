
public class FourDigitSequence {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("The produced sequence is:");

        fillSequence(sb, 1000, 10000, 3);

        System.out.println(
                sb.toString()
        );
    }

    private static void fillSequence(StringBuilder sb, int startValue, int maxValue, int step){

        int value = startValue;
        do{
            if((value - startValue) % (step * 10) == 0){
                sb.append("\n");
            }

            sb.append(" ");
            sb.append(value);

            value += step;

        } while(value < maxValue);

    }
}
