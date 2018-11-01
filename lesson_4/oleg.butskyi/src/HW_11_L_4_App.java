import java.util.ArrayList;

public class HW_11_L_4_App {
    public static void main(String[] args) {

        int nutShell = 555555;
        boolean isTrue = true;
        ArrayList<Integer> arrayList = new ArrayList<>();


        HW_11_L_4_b summNutshell = new HW_11_L_4_b();

        while (isTrue){

               if (summNutshell.checkForNegative(nutShell)){

                  summNutshell.inputInToArray(arrayList, nutShell);

                  nutShell = summNutshell.summAllElementsInArray(arrayList);

                  isTrue = summNutshell.checkSummedNumIsSingle(nutShell);

                    if (isTrue) {

                        summNutshell.clearArray(arrayList);
                    }
                }else {
                   System.out.println("Something wrong");
                   break;
               }
        }

        System.out.println("The result is : " + nutShell);

    }
}
