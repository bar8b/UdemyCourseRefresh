package b_Inheritance.Ex6_Point;

import b_Inheritance.Ex7_CarpetCalculator.Floor;

public class Main {
    public static void main(String[] args) {
        Point first = new Point(6, 5);
        Point second = new Point(3, 1);

        System.out.println("dist(0,0)= " + first.distance());
        System.out.println("dist(second)= " + first.distance(second));
        System.out.println("dist(2,2)= " + first.distance(2, 2));
        Point point = new Point();
        System.out.println("dist()= " + point.distance());

    }
}
