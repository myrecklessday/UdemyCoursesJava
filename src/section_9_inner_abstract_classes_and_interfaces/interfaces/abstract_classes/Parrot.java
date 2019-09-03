package section_9_inner_abstract_classes_and_interfaces.interfaces.abstract_classes;

public class Parrot extends Bird {

    public Parrot(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println(getName() + " is flitting from branch to branch");
    }
}
