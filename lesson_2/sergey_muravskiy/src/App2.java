class App2
{
    public static void main(String[] params) 
	{
		int count = params.length;
		float Min = Float.parseFloat(params[0]);
		float Max = Float.parseFloat(params[0]);
		
		for(int i=1;i<count;i++)
		{
			float Params_value = Float.parseFloat(params[i]);
			if (Params_value < Min) {Min = Params_value;}
		}
		
		for(int i=1;i<count;i++)
		{
			float Params_value = Float.parseFloat(params[i]);
			if (Params_value > Max) {Max = Params_value;}
		}
		
        System.out.println("Min" + " " + ">" + " " + Min + "\r\n" + "Max" + " " + ">" + " " + Max);
    }
}  

//2) Найти среди 3х чисел максимальное и минимальное
//A teacher asked a student to write 55. 