package section_9_inner_abstract_classes_and_interfaces.interfaces;

public class Main {

    public static void main(String[] args) {

        ITelephone lenasPhone;
        lenasPhone = new DeskPhone(3222);
        lenasPhone.powerOn();
        lenasPhone.callPhone(3222);
        lenasPhone.answer();

        lenasPhone = new MobilePhone(12345);
//        lenasPhone.powerOn();
        lenasPhone.callPhone(12345);
        lenasPhone.answer();

    }

}
