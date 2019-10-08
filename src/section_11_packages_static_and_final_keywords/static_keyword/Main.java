package section_11_packages_static_and_final_keywords.static_keyword;

public class Main {

    public static int multiplier = 7;

    public static void main(String[] args) {

//        StaticTest firstInstance = new StaticTest("1st Instance");
//        System.out.println(firstInstance.getName() + " is instance number " + StaticTest.getNumInstances());
//
//        StaticTest secondInstance = new StaticTest("2nd Instance");
//        System.out.println(secondInstance.getName() + " is instance number " + StaticTest.getNumInstances());
//
//        StaticTest thirdInstance = new StaticTest("3rd Instance");
//        System.out.println(thirdInstance.getName() + " is instance number " + StaticTest.getNumInstances());

        //only static fields and methods in same class
        // or create instance before using non-static methods and fields from another class!
        int answer = multiply(6);
        System.out.println("The answer is " + answer);
        System.out.println("Multiplier is " + multiplier);

        //Static initialization blocks
        System.out.println("Main method called");
        StaticInitializationBlockTest test = new StaticInitializationBlockTest();
        test.someMethod();
        System.out.println("Owner is " + StaticInitializationBlockTest.owner);

    }

    public static int multiply(int number) {
        return number * multiplier;
    }

}
