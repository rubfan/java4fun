class App6
{
    public static void main(String[] params) 
	{
		float Stat_value = 10;
		float First_value = Float.parseFloat(params[0]);
		float Second_value = Float.parseFloat(params[1]);
		float First_length = 0;
		float Second_length = 0;
		
		if(First_value > Stat_value) {First_length = First_value - Stat_value;}
		else {First_length = Stat_value - First_value;}
		
		if(Second_value > Stat_value) {Second_length = Second_value - Stat_value;}
		else {Second_length = Stat_value - Second_value;}
		
		if (First_length > Second_length){System.out.println("Second value is closer!" + ' ' + "(" + Second_value + ")" );}
		else {System.out.println("First value is closer!" + ' ' + "(" + First_value + ")");}
		
		if (First_length == Second_length){System.out.println("Numbers are equal!" + ' ' + "(" + First_value + ")" );}
        
    }
}  

//6) Найти ближайшее к 10 из 2х заданных чисел. Например, среди чисел 8 и 11 ближайшее к десяти 11