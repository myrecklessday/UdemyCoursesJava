package section_11_packages_static_and_final_keywords.static_keyword;

public class StaticInitializationBlockTest {

    public static final String owner;

    static {
        owner = "Helen";
        System.out.println("Static initialization block call");
    }

    public StaticInitializationBlockTest() {
        System.out.println("Constructor called");
    }

    static {
        System.out.println("2nd initialization block call");
    }

    public void someMethod() {
        System.out.println("someMethod called");
    }
}
