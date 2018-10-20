
public class Task_3 {

    public static void main(String[] args) {

        Conclusion number = new Conclusion();
        number.conclusion(90,0,5);
    }
}

class Conclusion {

    public void conclusion(int startNumber, int finishNumber, int interval) {

        for (int i = startNumber; i > finishNumber; i=i-interval)

            System.out.println(i);

    }

}


