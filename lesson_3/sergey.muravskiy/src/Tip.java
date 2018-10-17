import java.util.Scanner;
import java.lang.String;

public class Tip 
{
    public static void main(String[] args)
    {
        double Bill, Tea, Tip, TotalBill;
        String QualityOfService = "";
        Scanner in = new Scanner(System.in);
        System.out.print("Bill > ");
        Bill = in.nextDouble();
        System.out.print("Enter service quality [Terrible/Poor/Good/Great/Excelant] > ");
        QualityOfService = in.next();
        TotalBill = Bill;
<<<<<<< HEAD
        //Качество обслуживания
        switch (QualityOfService)
        {
            case "Terrible":
                Tip = (Bill * 0) / 100;
                break;
            case "Poor":
                Tip = (Bill * 5) / 100;
                break;
            case "Good":
                Tip = (Bill * 10) / 100;
                break;
            case "Great":
                Tip = (Bill * 15) / 100;
                break;
            case "Excelant":
                Tip = (Bill * 20) / 100;
                break;
            default:
                Tip = 0;
                break;
        }
        //Вывод чаевых и счета с чаевыми
        TotalBill += Tip;
        System.out.println("Tip > " + Tip + " UAH");
        System.out.print("Bill with Tip > " + TotalBill + " UAH");
=======
	//Качество обслуживания
	switch(QualityOfService)
            {
                case "Terrible" :
                    Tip = (Bill * 0)/100;
                    break;
                case "Poor" :
                    Tip = (Bill * 5)/100;
                    break;
                case "Good" :
                    Tip = (Bill *10)/100;
                    break;
		case "Great" :
                    Tip = (Bill * 15)/100;
                    break;
		case "Excelant" :
                    Tip = (Bill * 20)/100; 
                    break;
                default :
                    Tip = 0;
                    break;
            }
        //Вывод чаевых и счета с чаевыми
	TotalBill +=Tip;
        System.out.println("Tip > " + Tip + " UAH");
	System.out.print("Bill with Tip > " + TotalBill  + " UAH");

>>>>>>> 2b40575a50f2a51bb3e3c0ea775173d5fb922964
    }
}
