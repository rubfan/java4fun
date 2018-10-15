public class DivisionCheck{
	public static void main(String[] params){
		System.out.println(Integer.parseInt(params[0])%Integer.parseInt(params[1])==0?
							"Division successful":
							"Division has a non-integer result");
	}
}
