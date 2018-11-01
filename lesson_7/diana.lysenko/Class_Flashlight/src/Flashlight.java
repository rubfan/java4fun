public class Flashlight {

    public int batteries;
    public String name_fl;
    private boolean whiteLight;
    private boolean redLight;
    private boolean blink;

    // shine white with 1 battery
    // shine red with 2 batteries
    // blink with 3 batteries

    public Flashlight(String name, int btr) {
        name_fl = name;
        batteries = btr;
    }

    public void whiteLightON() {
        if (batteries >= 1) {
            whiteLight = true;
        } else {
            System.out.println("Not enough batteries!");
        }
    }

    public void whiteLightOFF() {
        whiteLight = false;
    }

    public void redLightON() {
        if (batteries >= 2) {
            redLight = true;
        } else {
            System.out.println("Not enough batteries!");
        }
    }

    public void redLightOFF() {
        redLight = false;
    }

    public void blinkON() {
        if (batteries >= 3) {
            blink = true;
        } else {
            System.out.println("Not enough batteries!");
        }
    }

    public void blinkOFF() {
        blink = false;
    }

}
