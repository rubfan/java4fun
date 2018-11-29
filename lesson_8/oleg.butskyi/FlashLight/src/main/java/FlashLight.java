public class FlashLight {
    private boolean whiteLight = false;
    private boolean redLight = false;
    private boolean blinkMode = false;
    private boolean allOFF = true;
    private int battery;

    public void setBattery(int battery) {
        this.battery = battery;
    }

    public void setWhiteLightON() {
        minMaxBatteriesCanBeInputed();
        if (battery >= 1) {
            whiteLight = true;
            redLight = false;
            blinkMode = false;
            allOFF = false;

            System.out.println("White Light is activated");
        } else {
            whenInsufficienBatteries();
        }

    }

    public void setRedLightON() {
        minMaxBatteriesCanBeInputed();
        if (battery >= 2) {
            whiteLight = false;
            redLight = true;
            blinkMode = false;
            allOFF = false;

            System.out.println("Red Light is activated");
        } else {
            whenInsufficienBatteries();
        }
    }

    public void setBlinkModeON() {
        minMaxBatteriesCanBeInputed();
        if (battery == 3) {
            whiteLight = false;
            redLight = false;
            blinkMode = true;
            allOFF = false;

            System.out.println("Blink mode is activated");
        } else {
            whenInsufficienBatteries();
        }

    }

    public void setAllOFF() {
        whiteLight = false;
        redLight = false;
        blinkMode = false;
        allOFF = true;

        System.out.println("All light's is turn off");
    }

    public void whenInsufficienBatteries() {
        whiteLight = false;
        redLight = false;
        blinkMode = false;
        allOFF = true;

        System.out.println("Insuficient batteries in FlashLight");
    }

    public void minMaxBatteriesCanBeInputed() {
        if (battery < 0) {
            battery = 0;
        }
        if (battery > 3) {
            battery = 3;
        }
    }

    public boolean isWhiteLight() {
        return whiteLight;

    }

    public boolean isRedLight() {
        return redLight;
    }

    public boolean isBlinkMode() {
        return blinkMode;
    }

    public boolean isAllOFF() {
        return allOFF;
    }
}

