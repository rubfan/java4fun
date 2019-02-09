//8) Найти все счастливые билеты от 100000 до 999999 :
//билет счастливый если сумма первых трех цифр равна сумме трех последних

public class HW4_eighth_task {

    public static void main(String[] args) {
        for(int i = 100000; i < 1000000; i++)
            if(sumOfFirstThreeNumbers(i) == sumOfLastThreeNumbers(i))
                System.out.println(i);
    }

    private static int sumOfFirstThreeNumbers(int number) {
        number = number / 1000;
        int sum = 0;
        while(number != 0) {
            sum = sum + (number % 10);
            number /= 10;
        }
        return sum;
    }

    private static int sumOfLastThreeNumbers(int number) {
        int sum = 0;
        while(number > 1000) {
            sum = sum + (number % 10);
            number /= 10;
        }
        return sum;
    }
}
