public class HomeWork1Lesson6Corrected {
    public static void main(String[] args) {

        int[] array = {4,7,3,6,8,9,3,5,7,3,6,4,5,1,4,6,9,5,7,4,8,5};
        HomeWork1Lesson6Corrected ar = new HomeWork1Lesson6Corrected();
        System.out.println("In array with using method select" + array.length + "" +
                " to found min number, operations need " + ar.select(array));
        System.out.println("In array with using method select2" + array.length + "" +
                " to found min number, operations need " + ar.select2(array));

    }
    public int select (int [] array){
        int minNum = 0; int selectCount = 0;
        for (int i = 0; i < array.length - 1; i++) {
            selectCount ++;
            for (int j = 0; j < array.length; j++) {
                selectCount ++;
                if (i != j){
                    if (array [minNum] > array [j]){
                        minNum = array[j];
                    }
                }
            }
        }
        return selectCount;
    }

    public int select2 (int[] array){
        int minNum = 2147483646;
        int selectCount = 0;
        for (int i = 0; i < array.length - 1; i++) {
            selectCount++;
            for (int j = i + 1; j < i + 2; j++) {
                selectCount ++;
                if (array[i] < array[j]){
                    selectCount++;
                    if (array[i] < minNum){
                        minNum = array[i];
                        selectCount ++;
                    }
                }else {
                    if (array[j] > array[i]){
                        selectCount++;
                        if (array[j] < minNum){
                            minNum = array[j];
                            selectCount++;
                        }
                    }
                }
            }
        }
        return selectCount;
    }
}
