public class Task_4 {

    public static void main(String[] args) {

        Conclusion number = new Conclusion();
        number.conclusion(1,20);
    }
}

class Conclusion {

    public void conclusion(int startNumber, int finishNumber) {
        int counter = 2;
        for (int i = startNumber; i <= finishNumber;i++) {
         System.out.println(counter);
         counter = counter * 2;
        }
    }
}
