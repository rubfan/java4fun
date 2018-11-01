class App5 {
    public static void main(String[] params) {

        float First_value = Float.parseFloat(params[0]);
        float Second_value = Float.parseFloat(params[1]);

        if (First_value % Second_value != 0) {
            System.out.println("The number do not devide!");
        } else {
            System.out.println("The number devide!");
        }

    }
}

//5) Даны 2 числа, определить делится ли первое число на второе без остатка
//The student wrote 5 and stopped. 