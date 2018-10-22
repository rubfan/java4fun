public class TipCalc {
    public static void main(String[] args) {
        if(args.length < 2) {
            System.out.println("Not enough arguments");
            return;
        }

        double orderSum = Double.parseDouble(args[0]);
        String serviceLevel = args[1];

        double finalSum = 0;
        switch(serviceLevel){
            case "terrible":
                finalSum = orderSum;
                break;
            case "poor":
                finalSum = orderSum * 1.05;
                break;
            case "good":
                finalSum = orderSum * 1.1;
                break;
            case "great":
                finalSum = orderSum * 1.15;
                break;
            case "excellent":
                finalSum = orderSum * 1.2;
                break;
        }

        System.out.println("Your sum is " + (((int)(finalSum * 100))/(double)100));
    }

}
