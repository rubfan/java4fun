<<<<<<< HEAD:HW_lesson3/src/SimpleCalc.java

public class SimpleCalc {
    public static void main(String[] args) {
            if(args.length < 2) {
                System.out.println("Not enough arguments");
                return;
            }

            System.out.println("Result is: " +
                    calculate(  args[0],
                                Integer.parseInt(args[1]),
                                args[2]==null ? 0 : Integer.parseInt(args[2])));
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
            case "mul":
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
=======

public class ParamsCalc {
    public static void main(String[] args) {
            if(args.length < 2) {
                System.out.println("Not enough arguments");
                return;
            }

            System.out.println("Result is: " +
                    calculate(  args[0],
                                Integer.parseInt(args[1]),
                                args[2]==null ? 0 : Integer.parseInt(args[2])));
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
            case "mul":
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
>>>>>>> c9bfe2472d6cc06c335e9a7f926ce0d879f8b558:lesson_3/artem.radyuk/ParamsCalc.java
