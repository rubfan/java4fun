package lesson_8.VladimirPle;

import static org.junit.jupiter.api.Assertions.*;

class TorchTest {

    @org.junit.jupiter.api.Test
    void shineWhite() {
        Torch torch = new Torch("S", 1);
        String testResult = torch.shineWhite();
        String realResult = "The torch shine white light";
        assertEquals(testResult, realResult);
    }

    @org.junit.jupiter.api.Test
    void shineRed() {
        Torch torch = new Torch("S", 3);
        String testResult = torch.shineRed();
        String realResult = "The torch shine red light";
        assertEquals(testResult, realResult);
    }

    @org.junit.jupiter.api.Test
    void blink() {
        Torch torch = new Torch("S", 3);
        String testResult = torch.blink();
        String realResult = "The torch blinks";
        assertEquals(testResult, realResult);
    }

    @org.junit.jupiter.api.Test
    void turnOff() {
        Torch torch = new Torch("S", 1);
        String testResult = torch.turnOff();
        String realResult = "The torch is off";
        assertEquals(testResult, realResult);
    }
}