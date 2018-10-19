public class FiftyFiveElements {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();

        int value = 1;
        sb.append("1:\t")
                .append(value)
                .append("\n");

        for(int i = 2; i <= 55; i++){
            value += 2;
            sb.append(i)
                    .append(":\t")
                    .append(value)
                    .append("\n");
        }

        System.out.println(
                sb.toString()
        );
    }
}
