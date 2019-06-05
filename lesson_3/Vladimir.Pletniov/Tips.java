import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Tips {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int sum = Integer.parseInt(reader.readLine());
        String service = reader.readLine();
        switch (service) {
            case "terrible":
                sum *= 1;
                break;
            case "poor":
                sum *= 1.05;
                break;
            case "good":
                sum *= 1.1;
                break;
            case "great":
                sum *= 1.15;
                break;
            case "excellent":
                sum *= 1.2;
                break;
        }
        System.out.println("You have to pay: " + sum);
    }
}

