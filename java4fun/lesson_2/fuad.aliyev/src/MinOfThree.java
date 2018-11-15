public class MinOfThree {
	public static void main(String[] args) {
		int mas[] = new int[3];
		for(int i = 0; i < 3; i++) {
		    mas[i] = Integer.parseInt(args[i]);
		}
		int min = mas [0];
		for(int i = 1; i < 3; i++) {
		    if(mas[i] < min) 
			min = mas[i];
		}  
		System.out.println("Min number is " + min);	  
	}		
}