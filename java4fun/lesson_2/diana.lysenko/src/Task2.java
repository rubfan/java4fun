public class Task2 {
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
        
        int max = arr[0];
        for (int i = 1; i < 3; i++) {
            if (arr[i] > max) {
		max = arr[i];
            }
	}
        
	System.out.println("Min: " + min);
        System.out.println("Max: " + max);
    }  
}