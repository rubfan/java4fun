public class HW11 {
  public static void main(String[] args) {
    int sum = addDigits(555555);
      if(sum != -1) {
        System.out.println("Sum of Digits = "
                    + addDigits(555555));
      }
  }

  public static int addDigits(int number) {
    if(number < 0) {
      return -1;
    }
      return 1 + ((number - 1) % 9);
  }
}
