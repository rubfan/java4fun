import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ChangeMail {
    ArrayList<Character> mail = new ArrayList<Character>();
    private static final char[] sobaka = {']', ' ', 't', 'a', ' ', '['};
    private static final char[] dot = {']', ' ', 't', 'o', 'd', ' ', '['};

    public ChangeMail(String mail) {
        char[] temp = mail.toCharArray();
        for (int i = 0; i < temp.length; i++) {
            this.mail.add(temp[i]);
        }
    }

    public void getMail() {
        for (int i = 0; i < mail.size(); i++) {
            System.out.print(mail.get(i));
        }
        System.out.println();
    }

    public String changing() {
        for (int i = 0; i < mail.size(); i++) {
            if (mail.get(i) == '@') {
                mail.remove(i);
                for (int j = 0; j < sobaka.length; j++) {
                    mail.add(i, sobaka[j]);
                }
            } else if (mail.get(i) == '.') {
                mail.remove(i);
                for (int j = 0; j < dot.length; j++) {
                    mail.add(i, dot[j]);
                }
            }
        }
        String finResult = "";
        for (int i = 0; i < mail.size(); i++) {
            finResult = finResult + mail.get(i);
        }
        return finResult;
    }
}
