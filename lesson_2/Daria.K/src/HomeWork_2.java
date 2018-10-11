public class HomeWork_2 {
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);
		int max, min;
		if (a < b) { min = a; max = b; }
			else { min = b; max = a; };
		if (c < min) min = c; 
			else if (c > max) max = c;
		System.out.println("Min is: " + min + "; Max is: " + max);
	}
}