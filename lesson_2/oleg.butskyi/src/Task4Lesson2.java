public class Task4Lesson2{
    public static void main(String[] params) {

        final int MAX_ARRAY_VALUE = 1;

        int[] value = new int[MAX_ARRAY_VALUE];
        value[0] = Integer.parseInt(params[0]);

        if (value[0] % 2 == 0){
            System.out.println("Number even");
        }else System.out.println("Number not even");
    }
}