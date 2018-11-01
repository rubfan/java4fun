public class CloserToTen {
	public static void main(String[] args) {
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		if(Math.abs(num1-10) > Math.abs(num2-10)) {
			System.out.println(num2 + " is closer to 10 than " + num1);
		} else {
			System.out.println(num1 + " is closer to 10 than " + num2);
		}
	}
}
