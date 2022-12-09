package b_Inheritance.Ex4_Customer;

public class Customer {

    private String creditLimit;
    private String name;
    private String emailAddress;

    public Customer(String creditLimit, String name, String emailAddress) {
        this.creditLimit = creditLimit;
        this.name = name;
        this.emailAddress = emailAddress;

        System.out.println("credit limits = " + creditLimit + ", name = " + name +
               ", emailAddress = "+ emailAddress);
    }

    public Customer(String name, String emailAddress){
        this("111", name, emailAddress);
    }

    public Customer() {
        this ( "imie", "imię@email.pl");
    }

    public String getName() {
        return name;
    }

    public String getCreditLimit() {
        return creditLimit;
    }
    public String getEmailAddress() {
        return emailAddress;
    }


}
