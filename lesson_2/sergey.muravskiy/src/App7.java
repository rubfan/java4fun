class App7
{
    public static void main(String[] params) 
	{

		int Day_count = Integer.parseInt(params[0]);
		float Low_discount = 20;
		float High_discount = 50;
		float Cost = 40;
		float Rent_without_discount = 40 * Day_count;
		float Full_rent = 0;
		
		if(Day_count > 5 && Day_count <= 7)
		{ 
	      Full_rent = Rent_without_discount - 20;
		  System.out.println("Full rent is" + " " + Full_rent + " " + "UAH");
	    }
		
		else if(Day_count > 7)
		{ 
	      Full_rent = Rent_without_discount - 50; 
		  System.out.println("Full rent is" + " "  + Full_rent + " " + "UAH");
	    }
		
    }
} 

/*
7) Посчитайте, сколько будет стоить аренда квартиры за заданное число дней, если известно, 
что за 1 день ее стоимость 40 грн. Причем, если съемщик прожил в ней больше 5 дней, 
он получит скидку 20 грн, а если больше 7 дней, то скидка составит 50 грн. 
*/
//student: I don't know which side to write the other 5! 