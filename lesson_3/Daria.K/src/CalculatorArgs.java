import java.util.Scanner;

public class CalculatorArgs {
	public static void main(String[] args) {
		int result = 0;
		
		Scanner scan = new Scanner(System.in);
		
		String operation = args[0];
		int firstNumber = Integer.parseInt(args[1]);
		int secondNumber = Integer.parseInt(args[2]);
		
		switch(operation) {
			case "addittion":
			case "add":
			case "+":
				result = firstNumber + secondNumber;
				break;
			case "multiply":
			case "*":
				result = firstNumber * secondNumber;
				break;
			case "division":
			case "div":
			case "/":
				if (secondNumber == 0) { 
					System.out.println("Error"); 
					break; 
				} else {
					result = firstNumber / secondNumber;
					break; 
				}
			case "subtract":
			case "sub":
			case "-":
				result = firstNumber - secondNumber;
				break;
			case "remainder":
			case "rem":
			case "%":
				if (secondNumber == 0) { 
					System.out.println("Error"); 
					break; 
				} else {
				result = firstNumber % secondNumber;
				break; 
				}
			case "module":
			case "mod":
				result = Math.abs(firstNumber);
				break;
		}
		System.out.println("Result:");
		System.out.println(result);
	}
}