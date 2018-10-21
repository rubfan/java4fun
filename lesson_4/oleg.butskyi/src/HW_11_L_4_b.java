import java.util.ArrayList;

public class HW_11_L_4_b {
    final int MAX_SINGLE_NUM = 9;
    final int IS_POZITIVE = 1;
    final int SPLIT_FOR_TEN = 10;

    public boolean checkForNegative(int value) {
        return value > IS_POZITIVE;
    }

    public void inputInToArray(ArrayList <Integer> array, int value) {

        int temp = 0;

        while (value > 0){

            temp = value % SPLIT_FOR_TEN;
            value /= SPLIT_FOR_TEN;

            array.add(temp);

        }
    }

    public int summAllElementsInArray(ArrayList <Integer> arrayList) {

        int temp = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            temp +=arrayList.get(i);

        }
        return temp;
    }

    public boolean checkSummedNumIsSingle(int value) {
        return value > MAX_SINGLE_NUM;
    }

    public void clearArray (ArrayList<Integer> arrayList){
        arrayList.clear();
    }
}
