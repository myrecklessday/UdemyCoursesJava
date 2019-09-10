package section_10_generics;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // ArrayList without Generics
//        ArrayList items = new ArrayList();

        ArrayList<Integer> items = new ArrayList<>();
        items.add(1);
        items.add(2);
        items.add(3);
//        items.add("meow"); // exception in runtime
        items.add(4);
        items.add(5);

        printDoubled(items);

    }

    private static void printDoubled(/*ArrayList n*/
                                    ArrayList<Integer> n) {

        // need to cast type
//        for (Object i : n) {
//            System.out.println((Integer) i * 2);
//        }

        for (int i : n) {
            System.out.println(i * 2);
        }

    }


}
