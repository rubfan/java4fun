public class Figure {
    int a;

    public Figure(int a) {
        this.a = a;
    }

    public int getPerimeter() {
        return a * 4;
    }

    public int getArea() {
        return (int) Math.pow(a, 2);
    }
}
