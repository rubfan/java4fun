public class MinMaxInArray {

    public static void main(String[] args) {

        int arr[] = {5, 3, -4, 23, 0, 45, 9, -8, 10, -1};

        System.out.println(
                "Minimal  number:" + "\t\t\t" + minInArray(arr)
        );

        System.out.println(
                "Greatest number:" + "\t\t\t" + maxInArray(arr)
        );
    }

    private static int minInArray(int arr[]){

        int min = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }

        return min;
    }

    private static int maxInArray(int arr[]){

        int max = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }

        return max;
    }
}
