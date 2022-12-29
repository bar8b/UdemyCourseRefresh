package e_interface_AbstractCl.ex1_descPhone;

public class DescPhone implements ITelephone {

    private int myNumber;
    private boolean isRinging;

    public DescPhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        System.out.println("Desk phone is alwas on");
    }

    @Override
    public void dial(int phoneNumber) {
        System.out.println("Now ringing" + phoneNumber + "on descphone");
    }

    @Override
    public void answer() {
        if (isRinging) {
            System.out.println("Answering the desc phone");
            isRinging = false;
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if (phoneNumber == myNumber) {
            isRinging = true;
            System.out.println("ring ring");
        } else {
            isRinging = false;
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
