import java.nio.Buffer;
import java.util.ArrayList;

public class PalindromEx3 {
    String text;
    ArrayList<String> strArr = new ArrayList<String>();

    public PalindromEx3(String text) {
        this.text = text;
    }

    public String findPalindroms() {
        int counterOfPolindroms = 0;
        for (String temp : text.split(",")) {
            strArr.add(temp.trim());
        }
        for (int j = 0; j < strArr.size(); j++) {
            String actual = strArr.get(j);
            String revers = strArr.get(j);
            revers = new StringBuffer(revers).reverse().toString();
            if (actual.equals(revers)) {
                counterOfPolindroms++;
            }
        }
        String finRes = "Polindroms: " + Integer.toString(counterOfPolindroms);
        return finRes;
    }
}
