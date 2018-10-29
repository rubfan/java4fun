public class ClosestToTen{
	public static void main(String[] params){
		int firstNumber = Integer.parseInt(params[0]);
		int secondNumber = Integer.parseInt(params[1]);
		if (Math.abs(10 - firstNumber) == Math.abs(10 - secondNumber)){ 
			System.out.println("Both numbers are equally close to 10");
			return;
		}
		System.out.println("Number " + 
				(Math.abs(10 - firstNumber) < Math.abs(10 - secondNumber) ? firstNumber : secondNumber) +
				" is closer to 10");
	}
}
