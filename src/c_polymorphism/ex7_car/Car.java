package c_polymorphism.ex7_car;

//        For this exercise you will create four classes of vehicles. The first class should be named Car. This will be the base class for three other classes, Mitsubishi, Holden, and Ford.
//        The first class contains four member variables, or fields, with these names and conditions:
//        - engine of type boolean
//        - cylinders of type int
//        - name of type String
//        - wheels of type int
//        All four member variables should have private access.
//        The constructor should accept two parameters, cylinders and name. Also, all of these cars have an engine and
//        four wheels. So the other two fields should be set to default values.
//        In addition, there are five other methods These methods should be defined as described below:

//          startEngine accepts no parameters and returns _brudnopis.a.a message which says that the car's engine is starting.
//          accelerate accepts no parameters and returns _brudnopis.a.a message that says the car is accelerating.
//          brake accepts no parameters and returns _brudnopis.a.a message stating the car is braking.
//          The messages these methods return should somewhere contain the name of the class, Car.
//          Two getter methods should also be defined here for the member variables cylinders and name. All methods have public access.

//        The other three classes mentioned above are sub-classes of Car. These classes have no member variables and the constructor for each
//        will call the parent constructor for object instantiation. Each of these classes will override the three parent methods startEngine,
//        accelerate, and brake. The return messages for these methods should somewhere contain the name of the class to which the methods belong.
//
//        Notes:
//        Remember that your DescPhone class is not included in the code evaluation.
//        You should paste the code from each of your classes into the respective class file in the code evaluator.

public class Car {

    private boolean engine = true;
    private int cylinders;
    private String name;
    private int wheels = 4;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
    }

    public void startEngine() {
        String carType = this.getClass().getSimpleName();
        System.out.println(carType + " -> The " + getName() + " engine is starting.");
    }

    public void accelerate() {
        String carType = this.getClass().getSimpleName();
        System.out.println(carType + " -> The " + getName() + " is accelerate.");


    }

    public void brake() {
        String carType = this.getClass().getSimpleName();
        System.out.println(carType + " -> The " + getName() + " is braking.");
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }
}

