package d_arrays.ex4;

import java.util.ArrayList;
import java.util.Scanner;

public class Bank {
    private String name;
    private ArrayList<Customer> listOfCustomers = new ArrayList<>(500);


    public Bank(String name) {
        this.name = name;
    }

    public void addNewCustomer() {
        System.out.println("What is the name of a new Customer?");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println("What is the entered deposit?");
        double deposit = sc.nextDouble();
        if (!listOfCustomers.contains(name)) {
            Customer customer = new Customer(name, deposit);
            listOfCustomers.add(customer);
            System.out.println("New Customer added: " + customer);
        } else {
            System.out.println("Customer is already existing");
        }
    }

    public ArrayList getListOfCustomers() {
        return listOfCustomers;
    }

    public Customer getCustomer() {
        System.out.println("For whom would you like to do a transaction?");
        getListOfCustomers();
        Scanner sc = new Scanner(System.in);
        String name = sc.next().toUpperCase();
        for (var customer : listOfCustomers) {
            if (customer.name().equalsIgnoreCase(name)) {
                return customer;
            }
        }
        System.out.printf("Customer (%s) wasn't found %n", name);

        return null;
    }

    public void makeTransaction(String name) {
        System.out.println("What transaction would you like to on your account?");
        Scanner sc = new Scanner(System.in);
        double transactionAmount = sc.nextDouble();
        for (double d : getCustomer().transactions()) {  // unboxing
            System.out.printf("$%10.2f (%s)%n", d, d < 0 ? "debit" : "credit");
        }
    }

    @Override
    public String toString() {
        return getName();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
