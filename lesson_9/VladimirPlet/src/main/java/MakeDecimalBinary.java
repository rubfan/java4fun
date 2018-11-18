import java.util.ArrayList;

public class MakeDecimalBinary {
    int decimalNumberSystem;
    ArrayList<Integer> binaryNumberSystem = new ArrayList<Integer>();

    public MakeDecimalBinary(int decimalNumberSystem) {
        this.decimalNumberSystem = decimalNumberSystem;
    }

    public int decimalToBinary() {
        binaryNumberSystem.add(decimalNumberSystem % 2);
        decimalNumberSystem /= 2;
        if (decimalNumberSystem == 0) {
            String temp ="";
            for (int i = 0; i < binaryNumberSystem.size(); i++) {
                temp = temp + Integer.toString(binaryNumberSystem.get(i));
            }
            int finAns = Integer.valueOf(temp);
            return finAns;
        } else {
            return decimalToBinary();
        }
    }
}
