//2) Создайте программу, выводящую на экран первые 55 элементов последовательности 1 3 5 7 9 11 13 15 17 …

public class HW4_second_task {

    public static void main(String[] args) {
        int number = 1;
        for(int i = 0; i < 55 ; i++) {
            System.out.println(number);
            number += 2;
        }
    }
}
