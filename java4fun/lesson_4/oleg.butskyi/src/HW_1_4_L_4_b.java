public class HW_1_4_L_4_b {
 private final int QUADRANIAL_MIN_VALUE = 1000;
 private final int QUADRANIAL_MAX_VALUE = 9999;
 private final int MIN_POZITIVE_NUMBER = 0;


    public void quadranialSequence (Integer stepAdd, Integer start) {
        if (start >= QUADRANIAL_MIN_VALUE) {
            while (start <= QUADRANIAL_MAX_VALUE) {
                start += stepAdd;
                if (start > QUADRANIAL_MAX_VALUE) {
                    start -= stepAdd;
                    break;
                }
                System.out.println("Number has changed to : " + start );
            }
        }
        else {
            System.out.println("Wrong value");
        }
    }

    public void nElementsForNumsOfSequense (Integer stepAdd, Integer start, Integer elements) {
        for (int i = 1; i <= elements ; i++) {
            start += stepAdd;

            System.out.println( "Iteration is: " + i + " value is " + start );

        }

    }

    public void minusSequenceWhilePozitive (Integer stepMinus, Integer start) {
        if (start > MIN_POZITIVE_NUMBER || stepMinus < start) {
            while (start >= 0 ) {
                start = start - stepMinus;
                if (start > 0) {
                    System.out.println("Value is : " + start);
                }
            }

        }else {
            System.out.println("Something wrong check values");
              }

    }

    public void multipliedSequence (Integer stepMultiply, Integer start , Integer elements){
        for (int i = 1; i <= elements; i++) {
            start *= stepMultiply;
            System.out.println("Iteration is: " + i + " Value is: " + start);
        }
    }
}
