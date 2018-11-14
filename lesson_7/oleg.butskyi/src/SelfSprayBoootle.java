public class SelfSprayBoootle {
    private final int MilliInSeconds = 1000;
    private long timerStart;
    private long timerEnd;
    private long timerDoIt;
    private int capasity;

    public SelfSprayBoootle(long timerDoItInSeconds, int capasity) {
        this.timerDoIt = timerDoItInSeconds;
        this.capasity = capasity;
    }

    public void SprayCircleTooAir() {
        convertTooMilliSeconds();
        while (capasity > 0) {

            if (timerStart == 0) {
                timerStart = System.currentTimeMillis();
                timerEnd = timerStart + timerDoIt;
            }

            if (timerEnd <= System.currentTimeMillis()){
                timerStart = 0;
                capasity -= 1;
                System.out.println("Spraying anything in air from a bottle");
            }
        }

    }
    private void convertTooMilliSeconds (){
        timerDoIt = timerDoIt * MilliInSeconds;
    }



}