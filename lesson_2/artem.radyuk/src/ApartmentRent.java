public class ApartmentRent{
	public static void main(String[] params){
		int days = Integer.parseInt(params[0]);
		if(days < 0){ 
			System.out.print("Parameter`s value must be above 0");
			return;
		}
		int discount = getDiscount(days);
		int dayCharge = 40;
		System.out.println("Total cost: "+ (dayCharge*days - discount));
		
	}

	private static int getDiscount(int days){
		if(days>7)return 50;
		if(days>5)return 20;
		return 0;	
	}
}
