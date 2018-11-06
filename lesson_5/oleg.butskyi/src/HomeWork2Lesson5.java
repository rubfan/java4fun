public class HomeWork2Lesson5 {
    public static void main(String[] args) {
        int scannedSize;

        HomeWork_2_Lesson_5_D SpiralFill = new HomeWork_2_Lesson_5_D();
        scannedSize = SpiralFill.scanAndCheck();

        int [][] spiralArray = new int[scannedSize][scannedSize];

        SpiralFill.fillTheArray (spiralArray);
        SpiralFill.printTheArray(spiralArray);
    }
}
