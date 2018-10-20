public class Task_1 {

    public static void main(String[] args) {

        Conclusion number = new Conclusion();
        number.conclusion(1000,10000,3);
    }
}

class Conclusion {

    public void conclusion(int startNumber, int finishNumber, int interval) {

        for (int i = startNumber; i < finishNumber; i=i+interval)

            System.out.println(i);

    }

}
