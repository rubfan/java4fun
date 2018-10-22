import java.util.ArrayList;
import java.util.Collections;

public class HW_8_L_4_a {

    final int SPLIT_FOR_GET_SINGLE_NUM = 10;

    ArrayList<Integer> buffArrayOne = new ArrayList<>();
    ArrayList<Integer> buffArrayTwo = new ArrayList<>();

    public void convertToArrayList (ArrayList arrayList, int temporaryValue) {
        do {
            arrayList.add(temporaryValue % SPLIT_FOR_GET_SINGLE_NUM);
            temporaryValue /= SPLIT_FOR_GET_SINGLE_NUM;
        }while (temporaryValue > 0);
    }

    public void clearGarbageFromArray (ArrayList <Integer> arrayList) {
        arrayList.clear();
        buffArrayOne.clear();
        buffArrayTwo.clear();
    }

    public int nextNumOfCircle (int value) {
        return value +1;
    }

    public boolean checkAnAnagram (ArrayList <Integer> arrayList) {
        int neededSizeOfArray = arrayList.size() / 2;
        int j = arrayList.size() - 1;
        boolean check = true;

        for (int i = 0; i < neededSizeOfArray; i++, j--) {
            buffArrayOne.add(arrayList.get(i));
            buffArrayTwo.add(arrayList.get(j));
        }

        Collections.sort(buffArrayOne);
        Collections.sort(buffArrayTwo);
        return buffArrayOne.equals(buffArrayTwo);
    }

    public void printIfAnagram (boolean value, int num ) {
        if (value) {
            System.out.println(num);
        }

    }

    public void checkArray () {
        int num = 0;
        for (int i = 0; i <buffArrayOne.size() ; i++) {
            num = buffArrayOne.get(i);
            System.out.println(num);
        }
    }


}
