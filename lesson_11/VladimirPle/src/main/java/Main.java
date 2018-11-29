import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Figure> arr = new ArrayList<Figure>();
        arr.add(new Figure(5));
        arr.add(new Rectangle(5, 9));
        arr.add(new Triangle(4, 5, 3));
        arr.add(new Figure(20));
        int perimeter = 0;
        int area = 0;
        for (int i = 0; i < arr.size(); i++) {
            perimeter += arr.get(i).getPerimeter();
            area += arr.get(i).getArea();
        }
        System.out.println("Perimeter " + perimeter);
        System.out.println("Area " + area);
    }
}
