// To calculate the area of the rectangle and circle
interface Area {
    double pi = 3.14;

    public double calArea(double x, double y);

}

class Rectangle implements Area {
    public double calcArea(double x, double y) {
        return x * y;
    }

    @Override
    public double calArea(double x, double y) {
        // TODO Auto-generated method stub
        return 0;
    }
}

class Circle implements Area {
    public double calcArea(double x, double y) {
        return pi * x * y;
    }

    @Override
    public double calArea(double x, double y) {
        // TODO Auto-generated method stub
        return 0;
    }
}
