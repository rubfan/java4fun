public class HW4Lucky {
    public static void main(String[] args) {
        int k[] = new int[6];
        int count = 0;
        for (int i = 100; i < 1000; i++) {
            for (int j = 0; j < 1000; j++) {
                k[0] = i % 10;
                k[1] = i % 100 / 10;
                k[2] = i % 1000 / 100;
                k[3] = j % 10;
                k[4] = j % 100 / 10;
                k[5] = j % 1000 / 100;
                if ((k[0] + k[1] + k[2]) == (k[3] + k[4] + k[5])) {
                    count++;
                }
            }
        }
        System.out.println("Task 8. Here are how many happy tickets from 100,000 to 999,999: " + count);
    }
}
