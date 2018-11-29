

public class MyQueue implements Queue {
    private static int DEFAULT_LENGTH;
    protected int arr[];
    private int index;
    private int beforeIndex;


    MyQueue(int DEFAULT_LENGTH) {
        this.DEFAULT_LENGTH = DEFAULT_LENGTH;
        arr = new int[DEFAULT_LENGTH];
        index = DEFAULT_LENGTH - 1;
        beforeIndex = index;
    }

    public int getLength() {
        return arr.length;
    }


    public int pop() {
        if (arr[index] != 0) {
            int finRes = arr[index];
            for (int i = arr.length - 1; i > 0; i--) {
                arr[i] = arr[i - 1];
            }
            beforeIndex++;
            arr[beforeIndex]=0;
            return finRes;
        } else {
            System.out.println("ERROR ZERO");
            return 0;
        }
    }

    public boolean push(int value) {
        if (beforeIndex >= 0) {
            arr[beforeIndex] = value;
            beforeIndex--;
            return true;
        } else {
            System.out.println("Error");
            return false;
        }
    }


}
