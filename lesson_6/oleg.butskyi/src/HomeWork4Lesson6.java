public class HomeWork4Lesson6 {
    public static void main(String[] args) {

        int NumberToCheck = 5;
        int sizeOfArray = 10;
        int [] array = new int[sizeOfArray];
        HomeWork4Lesson6 t6 = new HomeWork4Lesson6();

        t6.fillArrayRandom(array);
        t6.sortArrayGnome(array);
        t6.printArray(array);
        System.out.println("Summ of elements in array have a this number");
        System.out.println(t6.boolSummNumInArray(array,NumberToCheck));
    }
    public void fillArrayRandom (int [] array){
        for (int i = 0; i < array.length; i++) {
            array [i] = (int) (Math.random() * 10 + 1);
        }
    }

    public void sortArrayGnome (int[] array){
        int savepoint = 0;  int temp;
        for (int i = 1; i < array.length;){
            if (i == 0 || array[i - 1] < array[i]){
                if (savepoint > i){
                    i = savepoint;
                }
                i++;
            }else {
                if (i > savepoint) {
                    savepoint = i;
                }
                temp = array[i];
                array[i] = array [i -1];
                array [i -1] = temp;
                i --;
            }
        }

    }
    public void printArray (int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
        System.out.println();
    }
    public boolean boolSummNumInArray(int [] array, int pointedNum){
        boolean bo = false; int temp = 0;
        for (int i = 0; i < array.length; i++) {
             int j;
            if (i == array.length - 1){
                j = 0;
            }else {
                j = i + 1;
            }
            if (array[i] + array [j] == pointedNum){
                bo = true;
                break;
            }
        }
        return bo;
    }
}
