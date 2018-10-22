import java.util.ArrayList;

public class HW_8_L_4_App {
    public static void main(String[] args) {

        int valueStart = 100000;
        int valueEnd = 999999;
        ArrayList<Integer> array = new ArrayList<>();

        HW_8_L_4_a luckyTickets = new HW_8_L_4_a();
        while (valueStart <= valueEnd){

          luckyTickets.convertToArrayList(array, valueStart );

          boolean result = luckyTickets.checkAnAnagram(array);

          luckyTickets.printIfAnagram(result, valueStart);

          luckyTickets.clearGarbageFromArray(array);

          valueStart = luckyTickets.nextNumOfCircle(valueStart);
        }
    }
}
