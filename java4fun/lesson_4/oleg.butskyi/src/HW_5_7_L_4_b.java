public class HW_5_7_L_4_b {

    public int firstNOfArray (int [] array, int lengthCheck) {
        int temp = 0;

        for (int i = 0; i < lengthCheck; i++) {
            temp += array[i];
        }
        return temp;
    }

    public int minElementArray (int[] array) {
       int j = 0;
       int temp = array [j];

        for (int i = 1; i < array.length; i++) {
            if (array [j] > array [i]) {
                j = i;
                temp = array [i];
            }
        }
        return temp;
    }

    public int maxElementArray (int [] array) {
        int temp = 0;
        int j = 0;

        for (int i = 1; i < array.length ; i++) {

            if (array [j] < array [i]) {
                j = i;
                temp = array [i];
            }
        }
        return temp;
    }

    public int summEvenElements (int[] array) {
        int result = 0;
        for (int i = 0; i < array.length; i ++) {
            if (array [i] % 2 == 0) {
                result += array[i];
            }
        }
        return result;
    }

    public int summNotEvenElements (int[] array) {

        int result = 0;
        for (int i = 1; i < array.length; i ++) {
            if (array [i] % 2 != 0) {
                result += array[i];
            }
        }
        return result;
    }


}
