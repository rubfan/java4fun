public class Task6 {
    public static void main(String[] params) {
        int a = Integer.parseInt(params[0]);
        int b = Integer.parseInt(params[1]);
        int w = Math.abs(a - 10);
        int z = Math.abs(b - 10);
        if (w<z) {
            System.out.println("����� " + a + " ����� � 10 ��� ����� " + b);
        } else {
	    System.out.println("����� " + b + " ����� � 10 ��� ����� " + a);
	}
    }
}