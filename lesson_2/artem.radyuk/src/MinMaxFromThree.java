public class MinMaxFromThree{
	public static void main(String[] params){ 
		int mas[] = new int[3];
		for(int i = 0;i < 3;i++){
			mas[i]=Integer.parseInt(params[i]);
		}
	
		int min = mas[0];
		for(int i=1;i<3;i++){
			if(mas[i]<min) min=mas[i];
		}
		System.out.println("Minimal number is " + min);	

		int max = mas[0];
		for(int i=1;i<3;i++){
			if(mas[i]>max) max=mas[i];
		}
		System.out.println("Max number is " + max);
	}	
}
