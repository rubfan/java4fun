public class MinFromThree{
	public static void main(String[] params){ 
		int mas[] = new int[3];
		for(int i = 0;i < 3;i++){
			mas[i]=Integer.parseInt(params[i]);
		}
	
		int buf = mas[0];
		for(int i=1;i<3;i++){
			if(mas[i]<buf) buf=mas[i];
		}
		System.out.println("Minimal number is " + buf);	
	}	
}
