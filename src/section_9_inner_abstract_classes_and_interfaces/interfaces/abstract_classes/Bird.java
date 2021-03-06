package section_9_inner_abstract_classes_and_interfaces.interfaces.abstract_classes;

public abstract class Bird extends Animal implements CanFly {

    public Bird(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is pecking");
    }

    @Override
    public void breathe() {
        System.out.println("Breathe in, breathe out, repeat");
    }

//    public abstract void fly();


    @Override
    public void fly() {
        System.out.println(getName() + " is flapping its wings");
    }
}
