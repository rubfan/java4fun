//3) Создайте программу, выводящую на экран все неотрицательные элементы последовательности 90 85 80 75 70 65 60 ….

public class HW4_third_task {

    public static void main(String[] args) {
        int number = 90;
        while(number > 0) {
            System.out.println(number);
            number -= 5;
        }
    }
}
