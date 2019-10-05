package section_11_packages_static_and_final_keywords.static_keyword;

public class StaticTest {

//    private int numInstances = 0;
    //changed to static
    private static int numInstances = 0;
    private String name;

    public StaticTest(String name) {
        this.name = name;
        numInstances++;
    }

//    public int getNumInstances() {
    //changed to static
    public static int getNumInstances() {
        return numInstances;
    }

    public String getName() {
        return name;
    }
}
