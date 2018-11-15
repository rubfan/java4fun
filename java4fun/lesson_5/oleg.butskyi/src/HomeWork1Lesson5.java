public class HomeWork1Lesson5 {
    public static void main(String[] args) {

        int HORIZON_SIZE = 10;
        int VERTICAL_SIZE = 10;

        int [][] arr = new int[VERTICAL_SIZE][HORIZON_SIZE];

        HomeWork_1_Lesson_5_D dt = new HomeWork_1_Lesson_5_D (arr);
        dt.fillTheArray ();
        dt.printArray();
    }
}
