public class HW1 {
    public static void main(String[] args){
        int minNumber = 1000;
        int maxNumber = 9999;
        printNumber(minNumber, maxNumber);
    }
    public static void printNumber(int minNumber, int maxNumber){
        for (int i = minNumber; i <= maxNumber ; i+=3) {
            System.out.println(i + " ;");

        }
    }
}
