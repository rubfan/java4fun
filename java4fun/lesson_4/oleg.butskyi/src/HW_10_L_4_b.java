public class HW_10_L_4_b {

    public void arraySort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] < array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }

        }
    }

    public void fillTheArray(int[] array) {

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
    }

    public void printFirstfiveDigitsOfArray ( int sequense , int[] array){
        System.out.println("First five digits:" );
        for (int i = 0; i < sequense; i++) {
            System.out.print(array [i] + ".");
        }
    }
}