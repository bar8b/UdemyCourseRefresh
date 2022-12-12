package c_polymorphism.ex5_car;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        boolean carType = true;
        while (carType) {
            System.out.println("What kind of car would you like to drive today? choose: " +
                    "E -electric, G - gas, H - hybrid, Q - quit");
            String type = s.nextLine();
            if (type.equalsIgnoreCase("q")) {
                break;
            }
            System.out.println("Which model?");
            String description = s.nextLine();
            Car car = Car.driveACar(type, description);
            car.startEngine();
            car.emission();
            if (type.equalsIgnoreCase( "E")||type.equalsIgnoreCase("H")
                    || type.equalsIgnoreCase("G")) {
                System.out.println("Your car will consume " + car.carConsumption() + "l/100km");
            }

        }
    }


}
