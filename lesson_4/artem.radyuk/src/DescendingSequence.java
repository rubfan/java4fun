public class DescendingSequence {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        int value = 90;

        do{
            sb.append(value).append("\n");
        } while( (value -= 5) >= 0 );

        System.out.println(
                sb.toString()
        );
    }
}
