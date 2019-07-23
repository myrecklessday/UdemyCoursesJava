package section_8_arrays_and_lists.arrays.linkedList;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Customer customer = new Customer("Ann", 85.55);
        Customer anotherCustomer;
        anotherCustomer = customer;
        anotherCustomer.setBalance(15.88);
        System.out.println("Balance for customer " + customer.getName() + " is " + customer.getBalance());


        ArrayList<Integer> intList = new ArrayList<Integer>();

        intList.add(1);
        intList.add(2);
        intList.add(5);

        for (int i = 0; i < intList.size(); i++){
            System.out.println(i + ": " + intList.get(i));
        }

        intList.add(2, 3);

        for (int i = 0; i < intList.size(); i++){
            System.out.println(i + ": " + intList.get(i));
        }

    }

}
