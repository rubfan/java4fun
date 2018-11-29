import java.util.ArrayList;

public class MainForExercise2 {
    public static void main(String[] args) {
        Exercise2 exercise2 = new Exercise2();
        ArrayList<String> arr = new ArrayList<String>();
        for (int i = 0; i <args.length ; i++) {
            arr.add(args[i]);
        }
        for (int i = 0; i <arr.size() ; i++) {
            System.out.println(exercise2.cutWords(arr.get(i)));
        }
    }
}
