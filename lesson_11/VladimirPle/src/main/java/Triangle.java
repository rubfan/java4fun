public class Triangle extends Figure {
    int c;
    int b;

    public Triangle(int a, int b, int c) {
        super(a);
        this.b = b;
        this.c = c;
    }

    @Override
    public int getPerimeter() {
        return a + b + c;
    }

    @Override
    public int getArea() {
        int p = (a + b + c) / 2;
        int S = (int)Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return S;
    }
}
