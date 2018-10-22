public class RentDiscount {
	public static void main(String[] args) {
		int numbofdays = Integer.parseInt(args[0]);
		if(numbofdays >= 5 && numbofdays < 7) {
			int price = numbofdays * 40 - 20;
			System.out.println("Rent is " + price);
		}
		else if(numbofdays >= 7) {
			int price = numbofdays * 40 - 50;
			System.out.println("Rent is " + price);
		}
		else {
			int price = numbofdays * 40;
			System.out.println("Rent is " + price);
		}
	}
}
			