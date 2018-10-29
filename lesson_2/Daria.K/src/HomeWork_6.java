public class HomeWork_6 {
	public static void main(String[] args) {
		int a = 10 - Integer.parseInt(args[0]);
		int b = 10 - Integer.parseInt(args[1]);
		int i = 0;
		if (Math.abs(a) > Math.abs(b)) i = 1; 
		System.out.println(args[i] + " is closer to 10");
	}
}