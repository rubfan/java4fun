
public class Task_11 {

    public static void main(String[] args) {

        array number = new array();
        number.digitalRoot(963896);

    }
}

class array {

    public void digitalRoot(int number) {

        int sum = 0;

        while (true) {

            if (number > 0) {
                int dsum = number % 10;
                number /= 10;
                sum += dsum;

            } else if (sum > 9) {
                int dsum = sum % 10;
                sum /= 10;
                sum += dsum;

            } else if (sum <= 9)
                break;
        }

        System.out.println(sum);
    }
}
