public class Kettle {

    private float capacity;
    private String material;
    private float waterIn = 0;
    private boolean isBoiled = false;

    public Kettle(float cpct, String mtrl) {
        capacity = cpct;
        material = mtrl;
    }

    public void pourWater(float volume) {
        if (volume > capacity) {
            System.out.println("Please, pour less water!");
        } else {
            waterIn = volume;
        }
    }

    public void boilWater() {
        isBoiled = true;
    }

    public float getCapacity() {
        return capacity;
    }

    public String getMaterial() {
        return material;
    }

    public boolean isBoiled() {
        return isBoiled;
    }

    public float getWaterIn() {
        return waterIn;
    }
}
