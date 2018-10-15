public class Task5Lesson2 {
    public static void main(String[] params) {

        final int MAX_ARRAY_VALUE = 2;

        int[] value = new int[MAX_ARRAY_VALUE];
        value[0] = Integer.parseInt(params[0]);
        value[1] = Integer.parseInt(params[1]);

        if (value[0] % value[1] == 0){
            System.out.println("Number is divisible");
        }else System.out.println("Number divided with remainder");
    }
}