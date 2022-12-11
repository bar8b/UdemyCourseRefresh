package b_Inheritance.Ex11_Pool;

public class Rectangle {

    private double width;
    private double length;

    public Rectangle(double width, double length) {
        this.width = (width < 0) ? 0 : width;
        this.length = (length < 0) ? 0 : length;
    }

    public double getArea() {
        return getLength() * getWidth();
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }
}
