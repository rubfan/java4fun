public class Test1 {
public static void main(String[] params) {
        int a = Integer.parseInt(params[0]);
        int b = Integer.parseInt(params[1]);
        int c = Integer.parseInt(params[2]);
        int min = 0;
        if (a<b) {
            if (a<c) {     
                min = a;
            } else min = c;
        } else if (b<c) {
                    min = b;
                } else min = c;
        
        
        System.out.println("min = "+min);
    }
}