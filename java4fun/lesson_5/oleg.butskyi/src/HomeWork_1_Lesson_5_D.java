public class HomeWork_1_Lesson_5_D {

    //Much easer to another way
    //make algorithm of Factorial: factorial(i)/(factorial((i-j))* factorial(j))
    // where i first for, j second array of array int ,long, BigInteger[][]


    int [][] Array;
    int space;

    public HomeWork_1_Lesson_5_D(int[][] array) {
        this.Array = array;
    }

    public void fillTheArray() {

        for (int i = 0; i < Array.length; i++) {

            Array [i] [0] = 1;
            Array [0] [i] = 1;
            space++;

            for (int j = 1; j < i; j++) {
                Array[i] [j] = Array [i - 1 ] [j - 1] + Array [i - 1] [j];
            }
        }
    }

    public void printArray (){
        for (int i = 0; i < Array.length; i++) {

            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            space --;

            for (int j = 0; j < i ; j++) {
                System.out.print( Array[i] [j] + " ");
            }
            System.out.println();
        }
    }
}


