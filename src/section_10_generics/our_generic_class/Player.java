package section_10_generics.our_generic_class;

public abstract class Player {

    private String name;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
