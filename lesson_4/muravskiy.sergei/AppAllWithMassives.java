import java.io.DataInputStream;
import java.util.*;
import java.util.stream.Stream;

public class AppAllWithMassives {



    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input a number of elements in array: ");
        int num = in.nextInt();
        System.out.print("Input a count for summ of firsts elements: ");
        int count = in.nextInt();
        List<Integer> arrayList = array(num);
        System.out.println("Array >" + " " + arrayList);
        System.out.println("Array min>" + " " + min(arrayList));
        System.out.println("Array max>" + " " + max(arrayList));
        System.out.println("Array sum of evens>" + " " + even(arrayList));
        System.out.println("Array sum of not even>" + " " + notEven(arrayList));
        System.out.println("Array sum of first " + count + " elements >" + " " + summByCount(arrayList,count));
        System.out.println("Array five min>" + " " + fiveMin(arrayList));
    }

    public static List<Integer> array(Integer num)
    {
        int min = 0;
        int max = 100;
        int diff = max - min;
        List<Integer> array = new ArrayList<>();
        for(int i =0; i<num ; i ++) {
            Random random = new Random();
            int y = random.nextInt(diff + 1);
            array.add(y);
        }
        return array;
    }

    public static Integer min(List<Integer> array)
    {
        int current = 0;
        int min = array.get(0);
        for(int i = 0; i<array.size(); i++) {
            current = array.get(i);
            if(min > current) {min = current;}
        }
        return min;
    }

    public static Integer max(List<Integer> array)
    {
        int current = 0;
        int max = array.get(0);
        for(int i=1; i<array.size(); i++) {
            current = array.get(i);
            if(max < current) {max = current;}
        }
        return max;
    }

    public static  Integer summByCount(List<Integer> array, int count)
    {
        int summ = 0;
        for (int i=0;i<count;i++){
            summ+= array.get(i);
        }
        return summ;
    }

    public static  Integer notEven(List<Integer> array)
    {
        int notEven = 0;
        for (int i=0;i<array.size();i++){
            if(array.get(i)%2 != 0 ) {
                notEven +=array.get(i);
            }
        }
        return notEven;
    }


    public static  Integer even(List<Integer> array)
    {
        int even = 0;
        for (int i=0;i<array.size();i++){
            if(array.get(i)%2 == 0 ) {
                even +=array.get(i);
            }
        }
        return even;
    }

    public static  List<Integer> fiveMin(List<Integer> array)
    {
        array.sort(Comparator.naturalOrder());
        List<Integer> fiveMin = new ArrayList<>();
        for(int i=0;i<5;i++)
        {
            fiveMin.add(array.get(i));
        }
        return fiveMin;
    }

}
