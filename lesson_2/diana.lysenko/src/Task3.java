public class Task3 {
    public static void main(String[] params) {
        int arr[] = new int[3];
	for (int i = 0; i < 3; i++) {
            arr[i] = Integer.parseInt(params[i]);
	}
	int min = arr[0];
	for (int i = 1; i < 3; i++) {
            if (arr[i] < min) {
		min = arr[i];
            }
	}
	System.out.print("Min: ");
        for (int i = 0; i < 3; i++) {
            if (arr[i] == min) {
                System.out.print(min + " ");
            }
	}
    } 
}