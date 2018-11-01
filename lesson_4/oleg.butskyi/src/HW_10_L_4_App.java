public class HW_10_L_4_App {

    public static void main(String[] args) {

        final int SEQUENSE_FOR_ARRAY = 5;
        final int MAX_LENGTH_OF_ARRAY = 20;
        int [] array = new int[MAX_LENGTH_OF_ARRAY];
        HW_10_L_4_b hw = new HW_10_L_4_b();

        hw.fillTheArray(array);
        hw.arraySort(array);
        hw.printFirstfiveDigitsOfArray(SEQUENSE_FOR_ARRAY, array);
    }


}


