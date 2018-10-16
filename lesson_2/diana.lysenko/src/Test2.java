public class Test2 {

    public static void main(String[] params) {
        int a = Integer.parseInt(params[0]);
        int b = Integer.parseInt(params[1]);
        int c = Integer.parseInt(params[2]);
        
        int min = 0;
        int max = 0;
        if ((b>a) && (b>c)) {
            max =b;
            if ((a<c)) {     
                min = a;
            } else { 
                min = c;
            }
        } else {   
            if (a>b) {
                if (a>c) {
                    max = a;
                    if (b<c) {
                        min = b;
                    } else min = c;
                } else {
                    max = c;
                    min = b;
                }
            } else {
                max = c;
                min = a;
            }
        }
        
        System.out.println("min = " + min);
        System.out.println("max = " + max);
    }
}