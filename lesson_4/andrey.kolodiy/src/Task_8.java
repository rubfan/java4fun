public class Task_8 {

    public static void main(String[] args) {

        array number = new array();
        number.likySumNumbers(100000, 999999);
    }
}

class array {

    public void likySumNumbers(int startNumber, int finishNumber) {

        int number = 0;
        int half = 0;
        int lastSum = 0;
        int firstSum = 0;

        for (int i = startNumber; i <= finishNumber; i++) {

            int quantityNumbers = (int) Math.log10(i) + 1;

            number = i;
            half = quantityNumbers / 2;
            lastSum = 0;
            firstSum = 0;

            while (number != 0) {

                if (half > 0) {
                    lastSum = lastSum + (number % 10);
                    half--;
                } else
                    firstSum = firstSum + (number % 10);

                number = number / 10;
            }

            if (lastSum == firstSum)
                System.out.println(i);
        }
    }
}
