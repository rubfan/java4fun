import java.util.Scanner;
import java.lang.String;
class Calculator
{
    public static void main(String[] params) 
	{
		
		float FirstOp = Float.parseFloat(params[0]);
		String Operation = String.valueOf(params[1]);
		float SecondOp = Float.parseFloat(params[2]);
		float Result;
		
		if (Operation.equals("plus"))
            {
                Result = FirstOp + SecondOp;
            }
        else if (Operation.equals("min"))
            {
                Result = FirstOp - SecondOp;
            }
        else if (Operation.equals("mult"))
            {
                Result = FirstOp * SecondOp;
            }
        else if (Operation.equals("dev"))
            {
                Result = FirstOp / SecondOp;
            }
        else if (Operation.equals("dev2"))
            {
                Result = FirstOp % SecondOp;
            }
        else 
		    {
			    Result = 0;
			}
			
            System.out.print("Result > " + Result );
			
    }
}  
 