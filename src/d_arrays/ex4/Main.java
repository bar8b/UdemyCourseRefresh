package d_arrays.ex4;

import java.util.*;


// TODO:
// add new customer
// transactions
// input exeptions

public class Main {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Bank> listOfBanks = new ArrayList();

    public static void main(String[] args) {
        String menu = ("""
                B - add new bank,
                L - see the list of existing banks,
                C - add new customer,
                T - make a new transaction,
                U - see list of customers,
                M - see the menu,
                Q - quit""");

        boolean loop = true;
        System.out.printf("What would you like to do?%n" + menu + "%n");
        while (loop) {
            String choice = sc.next();
            switch (choice.toUpperCase()) {
                case "B":
                    createBank(listOfBanks);
                    break;
                case "L":
                    System.out.println(listOfBanks);
                    break;
                case "C":
                    if (!listOfBanks.isEmpty()) {
                        selectBank().addNewCustomer();
                    } else {
                        createBank(listOfBanks);
                        selectBank().addNewCustomer();
                    }
                    break;
                case "M":
                    System.out.println(menu);
                    break;
                case "T":
                    Bank bank = selectBank();
                    String name = bank.getCustomer().name();
                    bank.makeTransaction(name);
                    break;
                case "U":
                    System.out.println(selectBank().getListOfCustomers());
                    break;
                case "S":
                    selectBank();
                    break;
                case "Q":
                    loop = false;
                    break;
            }
        }
    }

    public static void createBank(ArrayList listOfBanks) {
        System.out.println("What is the name of a bank?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine().toUpperCase();
        if (!listOfBanks.contains(name)) {
            Bank bank = new Bank(name);
            listOfBanks.add(bank);
            System.out.println("New Bank added: " + bank);
        } else {
            System.out.println("Bank is already existing");
        }
    }

    public static Bank selectBank() {
        if (listOfBanks.isEmpty()) {
            createBank(listOfBanks);
        }
        for (int i = 1 ; i <= listOfBanks.size(); i++){
            listOfBanks.get(i-1).getName();
            System.out.println(i + " - " + listOfBanks.get(i-1).getName());
        }
        System.out.println("Select Bank by number.");
        int index = sc.nextInt();
        listOfBanks.get(index -1);
        return listOfBanks.get(index - 1);
    }


}
