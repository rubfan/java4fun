import java.util.Scanner;

public class Tips {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double tips = 0;
		
		System.out.println("How much should you pay?");
		double cost = scan.nextDouble();
		System.out.println("How good was service? (options: terrible (1); poor (2); good (3); great (4); excellent (5);)");
		int service = scan.nextInt();
		switch(service) {
			case 1:
				break;
			case 2:
				tips = cost * 0.05;
				break;
			case 3:
				tips = cost * 0.1;
				break;
			case 4:
				tips = cost * 0.15;
				break;
			case 5:
				tips = cost * 0.2;
				break;
		}
		
		System.out.println("This is how much you should tip: ");
		System.out.format("%.2f%n", tips);
		System.out.println("Total cost:");
		System.out.format("%.2f%n", tips + cost);
			
	}
}