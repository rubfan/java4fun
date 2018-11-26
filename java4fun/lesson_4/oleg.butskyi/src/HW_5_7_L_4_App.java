public class HW_5_7_L_4_App
{
    public static void main(String[] args)
    {

        final int ARRAY_LENGTH = 50;
        int lenghtCheck = 5;
        int[] incomingArray = new int[ARRAY_LENGTH];


        Random_For_Array rmd = new Random_For_Array();
        rmd.randForTask(incomingArray);

        HW_5_7_L_4_b task5 = new HW_5_7_L_4_b();
        int resultT5 = task5.firstNOfArray(incomingArray, lenghtCheck);
        System.out.println("First Summed N Elements in array" + resultT5);

        HW_5_7_L_4_b task6 = new HW_5_7_L_4_b();
        int resultMinOfArray = task6.minElementArray(incomingArray);
        int resultMaxOfArray = task6.maxElementArray(incomingArray);
        System.out.println("Min element is: " + resultMinOfArray + "\n"
                         + "Max element is: " + resultMaxOfArray);

        HW_5_7_L_4_b task7 = new HW_5_7_L_4_b();
        int resultSummEvenElements = task7.summEvenElements(incomingArray);
        int resultSummNotEvenElements = task7.summNotEvenElements(incomingArray);
        System.out.println("Summary all even elements is: " + resultSummEvenElements +
                "\n" + "Summary all not even elements is: " + resultSummNotEvenElements);


    }

}
