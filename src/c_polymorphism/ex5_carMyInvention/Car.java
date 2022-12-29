package c_polymorphism.ex5_carMyInvention;

import java.util.Scanner;

public class Car {
    private String description;


    public Car(String description) {
        this.description = description;
    }

    public Car() {

    }

    public void startEngine() {
        System.out.println("Car -> startEngine");
    }

    public void emission() {
        String carName = this.getClass().getSimpleName();
        System.out.printf("This %s is _brudnopis.a.a %s and it emits an carbon dioxide %n", description, carName);
    }

    public String driverExperience() {
        Scanner s = new Scanner(System.in);
        System.out.println("how many years do you actively drive _brudnopis.a.a car?");
        return (s.nextInt() >= 5) ? "experienced" : "not experienced";
    }


    public String enviorment() {
        Scanner s = new Scanner(System.in);
        System.out.println("Are you going to drive over the city? y/n");
        return (s.nextLine().equals("y")) ? "city" : " ";
    }

    public double carConsumption() {
        return 0;
    }

    public static Car driveACar(String type, String description) {
        return switch (type.toUpperCase().charAt(0)) {
            case 'E' -> new ElectricCar(description);
            case 'H' -> new HybridCar(description);
            case 'G' -> new GasPoweredCar(description);
            default -> new Car(description);
        };
    }
}

class GasPoweredCar extends Car {
    public GasPoweredCar(String description) {
        super(description);
    }

    public void howManyCylinders(int cylinders) {
        if (cylinders == 2 || cylinders == 3 || cylinders == 4) {
            System.out.printf("The engine in this car has %d%n", cylinders);
        } else {
            System.out.println("It's not _brudnopis.a.a car, it's fucking transformer");
        }
    }

    @Override
    public void emission() {
        super.emission();
        Scanner s = new Scanner(System.in);
        System.out.println("The emitted carbon dioxide comes from an engine");
        System.out.println("How many cylinders has this engine?");
        howManyCylinders(s.nextInt());


    }

    @Override
    public double carConsumption() {
        String enviorment = enviorment();
        String carDriver = driverExperience();
        if (enviorment.equalsIgnoreCase("city")) {
            return (carDriver.equalsIgnoreCase("experienced")) ? 7.0 : 12.0;
        }
        return (carDriver.equalsIgnoreCase("experienced")) ? 5.5 : 10.5;
    }
}

class ElectricCar extends Car {

    public ElectricCar(String description) {
        super(description);
    }

    @Override
    public void emission() {
        super.emission();
        System.out.println("The emitted carbon dioxide in majority amount comes from an production of _brudnopis.a.a car");

    }

}

class HybridCar extends Car {

    public HybridCar(String description) {
        super(description);
    }

    @Override
    public void emission() {
        super.emission();
        System.out.println("The emitted carbon dioxide comes from an production of _brudnopis.a.a car and from engine");

    }

    @Override
    public double carConsumption() {
        String enviorment = enviorment();
        String carDriver = driverExperience();
        if (enviorment.equalsIgnoreCase("city")) {
            return (carDriver.equalsIgnoreCase("experienced")) ? 3.5 : 6;
        }
        return (carDriver.equalsIgnoreCase("experienced")) ? 2 : 5;
    }
}
