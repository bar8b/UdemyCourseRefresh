package b_Inheritance.Ex1_bankAccount;

public class BankAccount {
    private String number;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount() {
        this("0000", 2.5, "default Name",
                "default email", "default phone number");
        System.out.println("Empty constructor");
    }

    public BankAccount(String number, double balacne, String customerName,
                       String email, String phoneNumber) {
        System.out.println("Account constructor with parameters called");
        this.number = number;
        this.balance = balacne;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public BankAccount(String customerName, String email, String phoneNumber) {
        this("9999", 100.55, customerName, email, phoneNumber);
//        this.customerName = customerName;
//        this.email = email;
//        this.phoneNumber = phoneNumber;
    }

    public void depositinf(int depositAmount) {
        balance += depositAmount;
        System.out.println("Your balance is = " + balance);
    }

    public void withdrawing(int withdrawalAmount) {
        if (balance - withdrawalAmount < 0) {
            System.out.println("You are broke");
        } else {
            balance -= withdrawalAmount;
            System.out.println("Your balance is = " + balance);
        }
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }


}
