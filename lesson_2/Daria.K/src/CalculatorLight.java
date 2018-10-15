public class CalculatorLight {
	public static void main(String[] args) {
		String operation = "addition";
		int firstNumber = 10;
		int secondNumber = 14;
		int result = 0;
		
		switch(operation) {
			case "addition":
				result = firstNumber + secondNumber;
				break;
			case "mult":
				result = firstNumber * secondNumber;
				break;
			case "division":
				if (secondNumber == 0) { System.out.println("Error"); break; }
				else {
				result = firstNumber / secondNumber;
				break; }
			case "sub":
				result = firstNumber - secondNumber;
				break;
			case "remainder":
				if (secondNumber == 0) { System.out.println("Error"); break; }
				else {
				result = firstNumber % secondNumber;
				break; }
			case "modul":
				result = Math.abs(firstNumber);
				break;
		}
		
		System.out.println(result);
	}
}