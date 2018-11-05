public class Task7 {
    public static void main(String[] args) {
        int[] array = {1, 2, 334, 45, 55, 66, 5, 44, 3, 32, 33, 5, 66};
        sumArray(array);
    }

    public static void sumArray(int[] array) {
        int chetnye = 0;
        int neChetnye = 0;
        for (int i = 0; i < array.length; i++) {

            if ((array[i] % 2) == 0) {
                chetnye += array[i];
            } else {
                neChetnye += array[i];
            }
        }
        System.out.println("Summa chetnich = " + chetnye);
        System.out.println("Summa chetnich = " + neChetnye);
    }

}
