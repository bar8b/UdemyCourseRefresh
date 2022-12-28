package e_interface_AbstractClasses;

public class Main {
    public static void main(String[] args) {
        ITelephone basiasPhone;
        basiasPhone = new DescPhone(123456789);
        basiasPhone.powerOn();
        basiasPhone.callPhone(123456789);
        basiasPhone.answer();

    }
}
