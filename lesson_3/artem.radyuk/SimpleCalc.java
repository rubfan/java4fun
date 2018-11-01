public class SimpleCalc {
    public static void main(String[] args) {
        System.out.println("5 + 12 = "  +calculate("+", 5, 12));
        System.out.println("5 - 12 = "  +calculate("-", 5, 12));
        System.out.println("5 * 12 = "  +calculate("*", 5, 12));
        System.out.println("12 / 5 = "  +calculate("/", 12, 5));
        System.out.println("12 \\ 5 = " +calculate("\\", 12, 5));
        System.out.println("12 % 5 = "  +calculate("%", 12, 5));
        System.out.println("abs -15 = " +calculate("abs", -15, 0));
    }

    private static int calculate(String operation, int arg1, int arg2){
        int result = 0;
        switch (operation){
            case "+":
                result = arg1 + arg2;
                break;
            case "-":
                result = arg1 - arg2;
                break;
            case "*":
                result = arg1 * arg2;
                break;
            case "/":
            case "\\":
                result = arg1 / arg2;
                break;
            case "%":
                result = arg1 % arg2;
                break;
            case "abs":
                result = Math.abs(arg1);
                break;
        }
        return result;
    }
}
