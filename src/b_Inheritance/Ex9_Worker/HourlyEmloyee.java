package b_Inheritance.Ex9_Worker;

public class HourlyEmloyee extends Employee {

    private double hourlyPayRate;

    public HourlyEmloyee(String name, String birthDate,
                         String hireDate, double hourlyPayRate) {
        super(name, birthDate, hireDate);
        this.hourlyPayRate = hourlyPayRate;
    }

    @Override
    public double collectPay(){
        return 40* hourlyPayRate;
    }

    public double getDoublePay(){
        return 2*collectPay();
    }

}
