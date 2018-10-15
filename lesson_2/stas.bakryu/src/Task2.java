

public class Task2 {

    public static void main(String[] params) {
         int a = Integer.parseInt(params[0]);
        int b = Integer.parseInt(params[1]);
        int c = Integer.parseInt(params[2]);
        int min = whoIsMin(a,b,c);
        int max = whoIsMax(a ,b,c);

        System.out.println("this number is min "+min);
        System.out.println("this number is max "+max);

    }
    public static int whoIsMin(int a,int b, int c){
        int min = a;
        if (min > b) min = b;
        if (min > c) min = c;
        return min;
    }
    public static int whoIsMax(int a,int b, int c){
        int max = a;
        if (max < b) max = b;
        if (max < c) max = c;
        return max;
    }
}
