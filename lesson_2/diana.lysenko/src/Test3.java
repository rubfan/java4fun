public class Test3 {
public static void main(String[] params) {

        int a = Integer.parseInt(params[0]);
        int b = Integer.parseInt(params[1]);
        int c = Integer.parseInt(params[2]);
        
        int min = 0;
         int p = 1 ;
        if (a<=b) {
            if (a==b) {  
                if (b<=c) {
                    if (b==c) {
                        p+=2;
                        min = b;
                    } else {
                        p++;
                        min = b;
                    }
                } else min = c;
            } else if (a>=c) {
                if (a==c) {
                    p++;
                    min = c;
                } else min = c;
            } else min = a;
        } else if (b<=c) {
            if (b==c) {
                p++;
                min = b;
            } else min = b;
        } else min = c;
        
        System.out.print("Минимальные значения: ");
        for (int i=0; i<p; i++)
            System.out.print(min + " ");
    }
}