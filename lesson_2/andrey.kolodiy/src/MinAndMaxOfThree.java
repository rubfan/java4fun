
/*
Tasc 2.

  Find the minimum and max of 3 numbers.

*/

class MinAndMaxOfThre{

    public static void main(String[] params) {

        int minimum = 0;
        int maximum = 0;

        int[] num = new int[3];  //number of numbers to compare.
        num[0] = Integer.parseInt(params[0]);
        num[1] = Integer.parseInt(params[1]);
        num[2] = Integer.parseInt(params[2]);

       for (int i = 0; i < num.length; i++) {
         int min = num[i];
         int min_i = i;
         for (int j = i+1; j < num.length; j++) {
            if (num[j] < min) {
                min = num[j];
                min_i = j;
       }
    }
         if (i != min_i) {
            int tmp = num[i];
            num[i] = num[min_i];
            num[min_i] = tmp;
       }
    }
        minimum = num[0];
        maximum = num[2];
        System.out.println("Minimum of 3 numbers: " + minimum + " and " + "Maximum of 3 numbers: " + maximum);
    }
}

