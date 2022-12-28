package d_arrays.ex4;

import java.util.*;

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
                        Bank bank = selectBank();
                        bank.addNewCustomer();
                    } else {
                        createBank(listOfBanks);
                        Bank bank = selectBank();
                        bank.addNewCustomer();
                    }

                    break;
                case "M":
                    System.out.println(menu);
                    break;
                case "T":
                    Bank bank1 = selectBank();
                    String name = bank1.getCustomer().name();
                    bank1.makeTransaction(name);
                    break;
                case "U":
                    Bank bank2 = selectBank();
                    System.out.println(bank2.getListOfCustomers());
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
        System.out.println("Select Bank?");
        System.out.println(listOfBanks);
        Bank bank = new Bank(sc.next().toUpperCase());
        int index = listOfBanks.indexOf(bank);
        return listOfBanks.get(index + 1);
    }


}
