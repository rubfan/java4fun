public class FiftyFiveElements {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        int number = 1;

        for(int count = 1; count <= 55; count++) {
            sb.append(count)
                    .append(":\t")
                    .append(number)
                    .append("\n");
            number += 2;
        }

        System.out.println(
                sb.toString()
        );
    }
}
