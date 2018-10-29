public class Task3Lesson2{
    public static void main(String[] params) {

        final int MAX_ARRAY_VALUE = 3;

        int[] num = new int[MAX_ARRAY_VALUE];
        num[0] = Integer.parseInt(params[0]);
        num[1] = Integer.parseInt(params[1]);
        num[2] = Integer.parseInt(params[2]);

        int tempMin = 0;

        for (int i = 0; i < num.length; i++) {
            if (i != 0) {
                if (num[tempMin] > num[i]) {
                    tempMin = i;
                // been thinking make arraylist, but will do it easier
                }
            }
        }
        for (int i = 0; i <num.length ; i++) {
                if (num[tempMin] == num[i]) {
                    System.out.println(num [i]);
                }
        }

    }
}