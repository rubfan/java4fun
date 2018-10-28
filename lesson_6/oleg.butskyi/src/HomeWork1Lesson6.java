public class HomeWork1Lesson6 {

    public static void main(String[] args) {

        int [] array = {6,4,5,7,2,3};
        HomeWork1Lesson6 t1 = new HomeWork1Lesson6();

        t1.selectSortArray(array);
        t1.printArray(array);

    }
    public  void printArray (int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
        System.out.println();
    }

    public void selectSortArray(int[] array){
        int tempMin, indexMin = 0;

        for (int i = 0; i < array.length - 1; i++) {

            indexMin = i;

            for (int j = i + 1; j < array.length; j++)
                if (array[indexMin] > array[j]) {
                    tempMin = array[j];
                    indexMin = j;
                }

            int temp = array[i];
            array[i] = array[indexMin];
            array[indexMin] = temp;
        }
    }


}
