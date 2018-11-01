class App1 {
    public static void main(String[] params) {
        int count = params.length;
        float Min = Float.parseFloat(params[0]);

        for (int i = 1; i < count; i++) {
            float Params_value = Float.parseFloat(params[i]);
            if (Params_value < Min) {
                Min = Params_value;
            }
        }

        System.out.println("Min" + " " + ">" + " " + Min);
    }
}

//1) Найти минимальное из 3х чисел
//First Joke from internet