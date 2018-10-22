public class HW_9_L_4 {

    public static void main(String[] args) {

        int value = 12;
        int temp = value;

        HW_9_L_4 s = new HW_9_L_4();
        s.ToBinary(value,temp);

        s.anotherOption(temp);


    }

    public void ToBinary (int value, int temp) {

        StringBuilder Binary = new StringBuilder();
        do {

            if (value % 2 == 0) {
                Binary.append("0");
                value = value / 2;
            }else {
                Binary.append("1");
                value = value / 2;
            }
        }while (value > 0);

        System.out.println("In decimal is: " + temp + "\n" +
                "In binary is: " + Binary.reverse());
    }

    public void anotherOption (int value) {
        System.out.println("------------------------------------");
        System.out.println("In decimal is: " + value + "\n" +
                "In binary is: " + Integer.toBinaryString(value));
    }
}
