public class HW4Lucky /*Task 8*/ {
    public static void main(String[] args) {
        int count = 0;
        for (int n1 = 1; n1 < 10; n1++)
            for (int n2 = 0; n2 < 10; n2++)
                for (int n3 = 0; n3 < 10; n3++)
                    for (int n4 = 0; n4 < 10; n4++)
                        for (int n5 = 0; n5 < 10; n5++)
                            for (int n6 = 0; n6 < 10; n6++)
                                if ((n1 + n2 + n3) == (n4 + n5 + n6)) {
                                    count++;
                                }
                                System.out.println("Task 8. Here are how many happy tickets from 100,000 to 999,999: " + count);
    }
}
