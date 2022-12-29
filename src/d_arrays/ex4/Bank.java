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
        System.out.println("What is the name of _brudnopis.a.a new Customer and what is entered deposit? Split with ','");
        Scanner sc = new Scanner(System.in);
        String [] answer = sc.next().split(",");
        String name = answer[0];
        int deposit = Integer.parseInt(answer[1]);
        Customer customer = new Customer(name, deposit);
        if (iterationCustomerList(name) != null) {
            listOfCustomers.add(customer);
            System.out.println("New Customer added into the " + getName() + " bank -> " + customer );
        } else if (listOfCustomers.contains(customer)){
            System.out.println("Customer is already existing");
        }
    }

    public ArrayList getListOfCustomers() {
        return listOfCustomers;
    }

    public Customer getCustomer() {
        System.out.println("Choose _brudnopis.a.a Customer?");
        System.out.println(getListOfCustomers());
        Scanner sc = new Scanner(System.in);
        String name = sc.next().toUpperCase();
        if (iterationCustomerList(name) == null){
            System.out.printf("Customer (%s) wasn't found %n", name);
        }
        return iterationCustomerList(name);
    }

    public Customer iterationCustomerList(String name){
        for (var customer : listOfCustomers) {
            if (customer.name().equalsIgnoreCase(name)) {
                return customer;
            }
        }
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
