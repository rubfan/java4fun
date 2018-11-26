public class Task4 {
    public static void main(String[] params) {
        int a = Integer.parseInt(params[0]);
        if (a % 2 == 0) {
            System.out.println("Number " + a + " is even.");
        } 
	else {
	    System.out.println("Number " + a + " is uneven.");
	}
    }
}