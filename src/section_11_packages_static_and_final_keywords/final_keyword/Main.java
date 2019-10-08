package section_11_packages_static_and_final_keywords.final_keyword;

public class Main {

    public static void main(String[] args) {

        SomeClass one = new SomeClass("one");
        SomeClass two = new SomeClass("two");
        SomeClass three = new SomeClass("three");

        System.out.println(one.getInstanceNumber());
        System.out.println(two.getInstanceNumber());
        System.out.println(three.getInstanceNumber());

        //error because final value can't be changed
        // after instance of the class was created
//        one.instanceNumber = 4;

        System.out.println(Math.PI);
//        Math m = new Math();

        int pw = 6557;
//        Password password = new Password(pw);
        Password password = new ExtendedPassword(pw);
        password.storePassword();
        password.letMeIn(1);
        password.letMeIn(54445);
        password.letMeIn(0);
        password.letMeIn(-1);
        password.letMeIn(6557);
        password.letMeIn(pw);

    }

}
