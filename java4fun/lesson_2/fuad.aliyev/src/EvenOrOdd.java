public class EvenOrOdd {
	public static void main(String[] args) {
		int numb = Integer.parseInt(args[0]);
		if((numb % 2) == 0) {
			System.out.println("Number is even");
		} else {
			System.out.println("Number is odd");
		}
	}
} 