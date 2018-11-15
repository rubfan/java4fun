import java.util.Scanner;
/*
Задача "Чаевые".
входные данные: сумма, которую вы должны заплатить и уровень сервиса
в зависимости от уровня сервиса посчитайте количество денег, которое вы должны оставить:
- terrible (0%)
- poor (5%)
- good (10%)
- great (15%)
- excellent (20%)
 */
public class Home_Work_4_Lesson_3 {

        public static void main(String[] args) {
            System.out.println("Enter the payment amount");
            int sum = getSum();
            System.out.println("Leave the comment of the quality of our service " +
                             "\n-terrible \n-poor \n-good \n-great \n-excellent ");
            String comment = getCommentary();

            System.out.println("Total payment - " + getTotalSum(comment,sum));


        }
        public static String getCommentary (){
            Scanner scan = new Scanner(System.in);
            return scan.nextLine();
        }

        public static int getSum (){
            Scanner scan = new Scanner(System.in);
            return scan.nextInt();
        }

        public static int getTotalSum (String  comentary,int sum ){
          int result = 0;
            if (comentary.equals("terrible")){
                result = sum;
            }
            if (comentary.equals("poor")){
                result = sum + (sum / 100) * 5;
            }
            if (comentary.equals("good")){
                result = sum +  (sum / 100) * 10;
            }
            if (comentary.equals("great")){
                result = sum + (sum / 100) * 15;
            }
            if (comentary.equals("excellent")){
                result = sum + (sum / 100) * 20;
            }
            return result;
        }
}
