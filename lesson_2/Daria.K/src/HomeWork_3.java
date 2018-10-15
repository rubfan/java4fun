public class HomeWork_3 {
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);
		int[] mins = new int[3]; int i = 0;
		mins[i] = a;
		if (b <= mins[i]) {
			if (b == mins[i]) i++;
			mins[i] = b;
		}
		if (c <= mins[i]) {
			if (c == mins[i]) { i++; mins[i] = c; }
			else {
				i = 0;
				mins[i] = c;
			}
		}
		System.out.println("Min(s): ");
		for (int x = 0; x <= i; x++)
			System.out.print(mins[x] + " ");
	}
}