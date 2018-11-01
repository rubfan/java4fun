public class OddEvenSum {
    public static void main(String[] args) {
        int arr[] = { 5, 3, -4, 23, 0, 45, 9, -8, 10, -1 };

        System.out.println(
                "Odd sum:" + "\t\t" + oddSum(arr)
        );

        System.out.println(
                "Even sum:" + "\t\t" + evenSum(arr)
        );
    }

    private static int oddSum(int arr[]){
        int sum = 0;

        for (int i : arr) {
            if ( (i % 2) != 0 ){
                sum += i;
            }
        }

        return sum;
    }

    private static int evenSum(int arr[]){
        int sum = 0;

        for (int i : arr) {
            if ( (i % 2) == 0 ){
                sum += i;
            }
        }

        return sum;
    }
}
