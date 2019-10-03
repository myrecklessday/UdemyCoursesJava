package section_11_packages_static_and_final_keywords.scope_and_visibility_challenge;

import java.util.Scanner;

public class X {

    private int x;

    public X(Scanner x /*int x*/) {
        System.out.println("Enter the integer number:");
        this.x = x.nextInt();
//        this.x = x;
    }

    public void x() {
        for (int x = 1; x <= 12; x++) {
            System.out.println(x + " times " + this.x + " equals " + x * this.x);
        }
    }


}
