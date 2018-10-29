public class HomeWork_7 {
	public static void main(String[] args) {
		int days = Integer.parseInt(args[0]);
		int cost = days*40;
		if (days > 7) cost = cost - 50;
			else if (days > 5) cost = cost - 20;
		System.out.println("Total cost: " + cost);
	}
}