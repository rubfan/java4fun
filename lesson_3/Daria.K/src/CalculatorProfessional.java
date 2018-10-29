import java.util.Scanner;

public class CalculatorProfessional {
	public static void main(String[] args) {
		int result = 0;
		int secondNumber = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Calculator can handle these operations: addition (1), multiply (2), division (3), subtract (4), remainder of the division (5), module (6).");
		System.out.println("Choose operation: ");
		int operation = scan.nextInt();
		System.out.println("Enter number: ");
		int firstNumber = scan.nextInt();
		if (operation != 6) {
			System.out.println("Enter second number: ");
			secondNumber = scan.nextInt();
		}
		
		switch(operation) {
			case 1:
				result = firstNumber + secondNumber;
				break;
			case 2:
				result = firstNumber * secondNumber;
				break;
			case 3:
				if (secondNumber == 0) { 
					System.out.println("Error"); 
					break; 
				} else {
					result = firstNumber / secondNumber;
					break; 
				}
			case 4:
				result = firstNumber - secondNumber;
				break;
			case 5:
				if (secondNumber == 0) { 
					System.out.println("Error"); 
					break; 
				} else {
					result = firstNumber % secondNumber;
					break; 
				}
			case 6:
				result = Math.abs(firstNumber);
				break;
		}
		System.out.println("Result:");
		System.out.println(result);
	}
}