public class GeometricalProgression {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        int number = 2;

        for(int count = 1; count <= 20; count++) {
            sb.append(count)
                    .append(":\t")
                    .append(number)
                    .append("\n");
            number *= 2;
        }

        System.out.println(
                sb.toString()
        );
    }
}
