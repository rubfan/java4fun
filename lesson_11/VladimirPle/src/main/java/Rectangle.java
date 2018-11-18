public class Rectangle extends Figure {
    int b;

    public Rectangle(int a, int b) {
        super(a);
        this.b = b;
    }

    @Override
    public int getPerimeter() {
        return (a + b) * 2;
    }

    @Override
    public int getArea() {
        return a * b;
    }
}
