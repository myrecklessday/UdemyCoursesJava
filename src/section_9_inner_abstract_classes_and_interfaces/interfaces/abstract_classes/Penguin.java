package section_9_inner_abstract_classes_and_interfaces.interfaces.abstract_classes;

public class Penguin extends Bird {

    public Penguin(String name) {
        super(name);
    }

    @Override
    public void fly() {
        super.fly();
        System.out.println("I'm not very good for that, can I go for a swim instead?");
    }
}
