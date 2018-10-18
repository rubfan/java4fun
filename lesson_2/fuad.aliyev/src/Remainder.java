public class Remainder {
	public static void main(String[] args) {
		int first = Integer.parseInt(args[0]);
		int second = Integer.parseInt(args[1]);
		if(first > second && (first % second) == 0) { 
			System.out.println("Divided without remainder");
		}
		else {
			System.out.println("Divided with remainder");
		}
	}	
}		