import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the sum:");
        int sum = Integer.parseInt(bufferedReader.readLine());
        System.out.println("Choose the service quality from the list: \n 1)terrible \n 2)poor \n 3)good \n 4)great \n 5)excellent ");
        String serviceQuality = bufferedReader.readLine();
        if(serviceQuality.equals("terrible") || serviceQuality.equals("1"))
            System.out.println("Recommended tip: 0");
        if(serviceQuality.equals("poor") || serviceQuality.equals("2"))
            System.out.println("Recommended tip: " + 0.05 * sum);
        if(serviceQuality.equals("good") || serviceQuality.equals("3"))
            System.out.println("Recommended tip: " + 0.1 * sum);
        if(serviceQuality.equals("great") || serviceQuality.equals("4"))
            System.out.println("Recommended tip: " + 0.15 * sum);
        if(serviceQuality.equals("excellent") || serviceQuality.equals("5"))
            System.out.println("Recommended: tip " + 0.2 * sum);
    }
}
