import java.util.ArrayList;

public class Exercise2 {
    ArrayList<String> strArr = new ArrayList<String>();

    public void cutSentense(String sentece) {
        for (String temp : sentece.split(" ")) {
            strArr.add(temp);
        }
        System.out.println("===Checking===");
        for (int i = 0; i < strArr.size(); i++) {
            System.out.println(strArr.get(i));
        }

    }

    public String cutWords(String word) {
        char[] chrWordArr = word.toCharArray();
        String backStr;
        if (chrWordArr.length >= 4) {
            char first = chrWordArr[0];
            String middle = String.valueOf(chrWordArr.length - 2);
            char last = chrWordArr[chrWordArr.length - 1];
            String fin = first + middle + last;
            System.out.println("====Checking====");
            System.out.println(fin);
            return fin;
            //System.out.println(backStr);
        }
        return word;
    }
}
