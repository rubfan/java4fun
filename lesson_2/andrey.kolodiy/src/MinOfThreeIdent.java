
/*
Tasc 3.

  Find the minimum of 3 numbers, and, if the minimum number is to output all such numbers.

*/

class MinOfThreeIdent {

    public static void main(String[] params) {

        int minimum = 0;

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
      minimum  = num[0];
      for (int g = 0; g <num.length; g++){
         if (num[g] == minimum){
           System.out.println(minimum);
       }
    }


    }
}

