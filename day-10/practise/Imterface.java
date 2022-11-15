interface Area {
    double pi = 3.14;

    public double calcArea(double x, double y);
}

class Rectangle implements Area {
    public double calcArea(double x, double y) {
        return x * y;
    }
}

class Circle implements Area {
    public double calcArea(double x, double y) {
        return x * y * pi;
    }
}

public class Imterface {
    public static void main(String[] args) {
        // Area a;
        Rectangle r = new Rectangle();
        Circle c = new Circle();
        // a = c;
        // a = r;
        System.out.println("Area of the rectangle is " + r.calcArea(2.2, 4.5));
        System.out.println("Area of the Circle is " + c.calcArea(22.2, 45.4));

    }
}
