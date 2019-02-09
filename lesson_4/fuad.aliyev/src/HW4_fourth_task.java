//4) Создайте программу, выводящую на экран первые 20 элементов последовательности 2 4 8 16 32 64 128 ….

public class HW4_fourth_task {

    public static void main(String[] args) {
        int number = 2;
        for(int i = 0; i < 20 ; i++) {
            System.out.println(number);
            number *= 2;
        }
    }
}
