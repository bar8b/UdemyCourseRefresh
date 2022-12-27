package d_arrays.ex4;

import java.util.ArrayList;

public record Customer(String name, ArrayList<Double> transactions) {
    public Customer(String name, double initialDeposit){
        this(name.toUpperCase(), new ArrayList<Double>(500));
        transactions.add(initialDeposit);
    }
    @Override
    public ArrayList<Double> transactions() {
        return transactions;
    }

    @Override
    public String toString() {
        return "Customer: name = " + name + " transactions = " + transactions ;
    }
}
