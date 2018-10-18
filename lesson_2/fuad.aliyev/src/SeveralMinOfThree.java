public class SeveralMinOfThree {
	public static void main(String[] args) {
		int mas[] = new int[3];
		for(int i = 0; i < 3; i++) {
		    mas[i] = Integer.parseInt(args[i]);
		}
		int min = mas [0];
		int j = 0;
		for(int i = 0; i < 3; i++) {
			if(mas[i] < min) {
				min = mas[i];
			}
		}
		for(int i = 0; i < 3; i++) {
			if(min == mas[i]) {
				j++;
			}
		}	  
		if(j == 3) {
			System.out.println("Min numbers are " + min + " " + min + " " + min);
		} else if(j == 2) { 
			System.out.println("Min numbers are " + min + " " + min);
		} else if(j == 1) {
			System.out.println("Min number is " + min);
		}		  
	}		
}