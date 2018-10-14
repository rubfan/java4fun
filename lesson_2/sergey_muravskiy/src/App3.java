class App3
{
    public static void main(String[] params) 
	{
		int Count_param = params.length;
		float Min = Float.parseFloat(params[0]);
		int Out_check=0;
		
		for(int i=1;i<Count_param;i++)
		{
			float Params_value = 0;
		    Params_value = Float.parseFloat(params[i]);
			if (Params_value < Min) {Min = Params_value;}
		}
		
		for(int i=0;i<Count_param;i++)
		{
			float Check = 0;
			Check = Float.parseFloat(params[i]);
			Out_check++;
			if(Check == Min) 
			{
				if (Out_check == 1) {System.out.print("Min" + " " + ">" + " " + Min + " ");}
				else {System.out.print(Min + " ");}
			}
			
		}
    }
}  

//3) Найти минимальное из 3х чисел, причем, если минимальных несколько вывести все такие числа
//Student asked: How? 