package b_Inheritance.Ex11_Pool;

public class Cuboid extends Rectangle {

    private double height;

    public Cuboid(double width, double lenght, double height) {
        super(width, lenght);
        this.height = (height < 0) ? 0 : height;
    }

    public double getVolume(){
        return getArea()*getHeight();
    }

    public double getHeight() {
        return height;
    }
}
