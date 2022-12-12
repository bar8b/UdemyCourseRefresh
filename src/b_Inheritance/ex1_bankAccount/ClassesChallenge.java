package b_Inheritance.ex1_bankAccount;


public class ClassesChallenge {

    public static void main(String[] args) {

        BankAccount bobAccount = new BankAccount();

        bobAccount.withdrawing(200);
        bobAccount.depositinf(2500);
        bobAccount.withdrawing(50);

        BankAccount timsAccount = new BankAccount("Tim", "tim@wp.pl", "123654");
        System.out.println("AccountNo: " + timsAccount.getNumber() +
                "; name " + timsAccount.getCustomerName());

    }

}
